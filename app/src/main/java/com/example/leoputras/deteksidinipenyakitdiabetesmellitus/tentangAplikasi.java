package com.example.leoputras.deteksidinipenyakitdiabetesmellitus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tentangAplikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);
    }

    public void button1(View view) {
        Intent intent1 = new Intent(this, activityHome.class);
        startActivity(intent1);
    }
}
