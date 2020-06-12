package com.example.lips_service;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ifselect extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifselect);

        TextView inform = (TextView) findViewById(R.id.ifinfo);

        Intent intent = getIntent();
        int lip_no = intent.getIntExtra("IFLIPS_CODE",0);

        switch (lip_no){
            case 1:
                inform.setText("1번립");
                break;
            case 2:
                inform.setText("2번립");
                break;
            case 3:
                inform.setText("3번립");
                break;
            case 4:
                inform.setText("4번립");
                break;
            case 5:
                inform.setText("5번립");
                break;
            case 6:
                inform.setText("6번립");
                break;
            case 7:
                inform.setText("7번립");
                break;
            case 8:
                inform.setText("8번립");
                break;
            case 9:
                inform.setText("9번립");
                break;
            default:
                inform.setText("오류");




        }

    }

}

