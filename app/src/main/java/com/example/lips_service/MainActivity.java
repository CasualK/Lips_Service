package com.example.lips_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CA(View v) {
        Intent CAC = new Intent(MainActivity.this,AP.class);
        startActivity(CAC);
    }

    public void CI(View v) {
        Intent CIC = new Intent(MainActivity.this,IF.class);
        startActivity(CIC);
    }
    public void CB(View v) {
        Intent CBC = new Intent(MainActivity.this,ST.class);
        startActivity(CBC);
    }
}

