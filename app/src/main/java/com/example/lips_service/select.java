package com.example.lips_service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class select extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button Gcho = (Button)findViewById(R.id.Gchoice);

        TextView inform = (TextView) findViewById(R.id.info);

        Intent intent = getIntent();
        int lip_no = intent.getIntExtra("LIPS_CODE",0);

        switch (lip_no){
            case 1:
                inform.setText("1번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",1);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 2:
                inform.setText("2번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",2);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 3:
                inform.setText("3번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",3);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 4:
                inform.setText("4번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",4);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 5:
                inform.setText("5번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",5);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 6:
                inform.setText("6번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",6);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 7:
                inform.setText("7번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",7);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 8:
                inform.setText("8번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",8);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 9:
                inform.setText("9번립");

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                intent.putExtra("LIPS_COLOR",9);
                                startActivity(intent);
                            }
                        }
                );
                break;
            default:
                inform.setText("오류");
        }


    }

}

