package com.example.lips_service;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;

public class ST extends AppCompatActivity {

    private static final int PICK_FROM_ALBUM = 1;
    private ImageView img;
    private Bitmap imgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_t);

        img = findViewById(R.id.ImgView);


    }

    public void btnG(View v) {
        GG();
    }

    private void GG() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
        startActivityForResult(intent, PICK_FROM_ALBUM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK) {

            Toast.makeText(this, "취소 되었습니다.", Toast.LENGTH_SHORT).show();

            return;
        }
        if (requestCode == PICK_FROM_ALBUM) {

            Cursor cursor = null;

            try {
                InputStream in = getContentResolver().openInputStream(data.getData());

                imgp = BitmapFactory.decodeStream(in);
                in.close();

                img.setImageBitmap(imgp);

            } catch (Exception e) {
            }
        }
    }
}
