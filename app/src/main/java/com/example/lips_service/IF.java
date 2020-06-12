package com.example.lips_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_i_f);

        Button iflip1 = (Button)findViewById(R.id.iflip1);
        Button iflip2 = (Button)findViewById(R.id.iflip2);
        Button iflip3 = (Button)findViewById(R.id.iflip3);
        Button iflip4 = (Button)findViewById(R.id.iflip4);
        Button iflip5 = (Button)findViewById(R.id.iflip5);
        Button iflip6 = (Button)findViewById(R.id.iflip6);
        Button iflip7 = (Button)findViewById(R.id.iflip7);
        Button iflip8 = (Button)findViewById(R.id.iflip8);
        Button iflip9 = (Button)findViewById(R.id.iflip9);

        iflip1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",1);
                        startActivity(intent);
                    }
                }
        );

        iflip2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",2);
                        startActivity(intent);
                    }
                }
        );

        iflip3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",3);
                        startActivity(intent);
                    }
                }
        );

        iflip4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",4);
                        startActivity(intent);
                    }
                }
        );

        iflip5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",5);
                        startActivity(intent);
                    }
                }
        );

        iflip6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",6);
                        startActivity(intent);
                    }
                }
        );

        iflip7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",7);
                        startActivity(intent);
                    }
                }
        );

        iflip8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",8);
                        startActivity(intent);
                    }
                }
        );

        iflip9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(IF.this, ifselect.class);
                        intent.putExtra("IFLIPS_CODE",9);
                        startActivity(intent);
                    }
                }
        );
    }
}
