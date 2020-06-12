package com.example.lips_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_p);

        Button lip1 = (Button)findViewById(R.id.lip1);
        Button lip2 = (Button)findViewById(R.id.lip2);
        Button lip3 = (Button)findViewById(R.id.lip3);
        Button lip4 = (Button)findViewById(R.id.lip4);
        Button lip5 = (Button)findViewById(R.id.lip5);
        Button lip6 = (Button)findViewById(R.id.lip6);
        Button lip7 = (Button)findViewById(R.id.lip7);
        Button lip8 = (Button)findViewById(R.id.lip8);
        Button lip9 = (Button)findViewById(R.id.lip9);


        lip1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",1);
                        startActivity(intent);
                    }
                }
        );

        lip2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",2);
                        startActivity(intent);
                    }
                }
        );

        lip3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",3);
                        startActivity(intent);
                    }
                }
        );

        lip4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",4);
                        startActivity(intent);
                    }
                }
        );

        lip5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",5);
                        startActivity(intent);
                    }
                }
        );

        lip6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",6);
                        startActivity(intent);
                    }
                }
        );

        lip7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",7);
                        startActivity(intent);
                    }
                }
        );

        lip8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",8);
                        startActivity(intent);
                    }
                }
        );

        lip9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(AP.this, select.class);
                        intent.putExtra("LIPS_CODE",9);
                        startActivity(intent);
                    }
                }
        );
    }
}
