package com.example.leoputras.deteksidinipenyakitdiabetesmellitus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mulaiPeriksa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_periksa);
    }

    public void buttonHome(View view) {
        Intent intent1 = new Intent(this, activityHome.class);
        startActivity(intent1);
    }
}
