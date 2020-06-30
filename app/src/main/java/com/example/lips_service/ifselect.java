package com.example.lips_service;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ifselect extends AppCompatActivity {
    ImageView ll, lc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifselect);

        ll = (ImageView) findViewById(R.id.iflipimg);
        lc = (ImageView) findViewById(R.id.iflipcolor);

        TextView inform = (TextView) findViewById(R.id.ifinfo);

        Intent intent = getIntent();
        int lip_no = intent.getIntExtra("IFLIPS_CODE",0);

        switch (lip_no){
            case 1:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip1 = BitmapFactory.decodeResource(getResources(),R.drawable.ilp1);
                Bitmap lipc1 = BitmapFactory.decodeResource(getResources(),R.drawable.isoip1);
                ll.setImageBitmap(lip1);
                lc.setImageBitmap(lipc1);
                break;
            case 2:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip2 = BitmapFactory.decodeResource(getResources(),R.drawable.ilp1);
                Bitmap lipc2 = BitmapFactory.decodeResource(getResources(),R.drawable.isoip2);
                ll.setImageBitmap(lip2);
                lc.setImageBitmap(lipc2);
                break;
            case 3:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip3 = BitmapFactory.decodeResource(getResources(),R.drawable.lip2);
                Bitmap lipc3 = BitmapFactory.decodeResource(getResources(),R.drawable.spp1);
                ll.setImageBitmap(lip3);
                lc.setImageBitmap(lipc3);
                break;
            case 4:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip4 = BitmapFactory.decodeResource(getResources(),R.drawable.lip2);
                Bitmap lipc4 = BitmapFactory.decodeResource(getResources(),R.drawable.spp2);
                ll.setImageBitmap(lip4);
                lc.setImageBitmap(lipc4);
                break;
            case 5:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip5 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc5 = BitmapFactory.decodeResource(getResources(),R.drawable.edd1);
                ll.setImageBitmap(lip5);
                lc.setImageBitmap(lipc5);
                break;
            case 6:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip6 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc6 = BitmapFactory.decodeResource(getResources(),R.drawable.edd2);
                ll.setImageBitmap(lip6);
                lc.setImageBitmap(lipc6);
                break;
            case 7:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip7 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc7 = BitmapFactory.decodeResource(getResources(),R.drawable.edd3);
                ll.setImageBitmap(lip7);
                lc.setImageBitmap(lipc7);
                break;
            case 8:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip8 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc8 = BitmapFactory.decodeResource(getResources(),R.drawable.edd4);
                ll.setImageBitmap(lip8);
                lc.setImageBitmap(lipc8);
                break;
            case 9:
                inform.setText("해당 립스틱에 대한 소개와 정보들이 소개 되는 곳입니다.");
                Bitmap lip9 = BitmapFactory.decodeResource(getResources(),R.drawable.lip8);
                Bitmap lipc9 = BitmapFactory.decodeResource(getResources(),R.drawable.edd5);
                ll.setImageBitmap(lip9);
                lc.setImageBitmap(lipc9);
                break;
            default:
                inform.setText("오류");




        }

    }

}

