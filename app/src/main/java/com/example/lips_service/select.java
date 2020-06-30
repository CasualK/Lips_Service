package com.example.lips_service;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class select extends AppCompatActivity {

    ImageView ll, lc;
    int red, green, blue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button Gcho = (Button)findViewById(R.id.Gchoice);

        ll = (ImageView) findViewById(R.id.lipimg);
        lc = (ImageView) findViewById(R.id.lipcolor);

        TextView inform = (TextView) findViewById(R.id.info);

        Intent intent = getIntent();
        int lip_no = intent.getIntExtra("LIPS_CODE",0);

        switch (lip_no){
            case 1:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip1 = BitmapFactory.decodeResource(getResources(),R.drawable.ilp1);
                Bitmap lipc1 = BitmapFactory.decodeResource(getResources(),R.drawable.isoip1);
                ll.setImageBitmap(lip1);
                lc.setImageBitmap(lipc1);


                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 234;
                                green = 0;
                                blue = 0;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }});
                break;
            case 2:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip2 = BitmapFactory.decodeResource(getResources(),R.drawable.ilp1);
                Bitmap lipc2 = BitmapFactory.decodeResource(getResources(),R.drawable.isoip2);
                ll.setImageBitmap(lip2);
                lc.setImageBitmap(lipc2);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 255;
                                green = 105;
                                blue = 180;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 3:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip3 = BitmapFactory.decodeResource(getResources(),R.drawable.lip2);
                Bitmap lipc3 = BitmapFactory.decodeResource(getResources(),R.drawable.spp1);
                ll.setImageBitmap(lip3);
                lc.setImageBitmap(lipc3);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 182;
                                green = 32;
                                blue = 32;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 4:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip4 = BitmapFactory.decodeResource(getResources(),R.drawable.lip2);
                Bitmap lipc4 = BitmapFactory.decodeResource(getResources(),R.drawable.spp2);
                ll.setImageBitmap(lip4);
                lc.setImageBitmap(lipc4);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 233;
                                green = 150;
                                blue = 122;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 5:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip5 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc5 = BitmapFactory.decodeResource(getResources(),R.drawable.edd1);
                ll.setImageBitmap(lip5);
                lc.setImageBitmap(lipc5);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 204;
                                green = 102;
                                blue = 102;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 6:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip6 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc6 = BitmapFactory.decodeResource(getResources(),R.drawable.edd2);
                ll.setImageBitmap(lip6);
                lc.setImageBitmap(lipc6);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 204;
                                green = 51;
                                blue = 102;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 7:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip7 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc7 = BitmapFactory.decodeResource(getResources(),R.drawable.edd3);
                ll.setImageBitmap(lip7);
                lc.setImageBitmap(lipc7);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 204;
                                green = 0;
                                blue = 51;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 8:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip8 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc8 = BitmapFactory.decodeResource(getResources(),R.drawable.edd4);
                ll.setImageBitmap(lip8);
                lc.setImageBitmap(lipc8);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 204;
                                green = 51;
                                blue = 0;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
                                startActivity(intent);
                            }
                        }
                );
                break;
            case 9:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip9 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc9 = BitmapFactory.decodeResource(getResources(),R.drawable.edd5);
                ll.setImageBitmap(lip9);
                lc.setImageBitmap(lipc9);

                Gcho.setOnClickListener(
                        new Button.OnClickListener(){
                            public void onClick(View v){
                                Intent intent = new Intent(select.this, Choice.class);
                                red = 255;
                                green = 102;
                                blue = 102;
                                intent.putExtra("red",red);
                                intent.putExtra("green",green);
                                intent.putExtra("blue",blue);
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

