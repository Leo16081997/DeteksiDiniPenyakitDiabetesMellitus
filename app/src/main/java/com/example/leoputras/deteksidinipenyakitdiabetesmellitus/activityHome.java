package com.example.leoputras.deteksidinipenyakitdiabetesmellitus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void button1(View view){
        Intent intent1 = new Intent(this, mulaiPeriksa.class);
        startActivity(intent1);
    }

    public void button2(View view){
        Intent intent1 = new Intent(this, referensidataPakar.class);
        startActivity(intent1);
    }

    public void button3(View view){
        Intent intent1 = new Intent(this, tentangAplikasi.class);
        startActivity(intent1);
    }
}
