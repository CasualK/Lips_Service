package com.example.lips_service;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Choice extends AppCompatActivity {

    private static final int REQUEST_CODE = 0;
    private ImageView img;
    final static int PERMISSION_REQUEST_CODE = 1000;
    private static final int PICK_FROM_ALBUM = 1;
    private Instant TedPermission;
    private Uri imui;
    private Bitmap imgp;
    Button CB, AB;
    int red, green, blue;
    private String state;

    private File file;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        permissionCheck();

        img = findViewById(R.id.FaceView);
        AB = findViewById(R.id.BG);

        Intent intent = getIntent();

        red = intent.getIntExtra("red",red);
        green = intent.getIntExtra("green",green);
        blue = intent.getIntExtra("blue",blue);

//        File sdcard = Environment.getExternalStorageDirectory();
//        file = new File(sdcard,"face.pjg");


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgp != null) {
                    imgp = rotate(imgp, 90);

                    img.setImageBitmap(imgp);
                }
            }
        });

    }

    public void btnG(View v){
        GG();
    }
    public void btnC(View v) { camera();}

    private void GG() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
        startActivityForResult(intent, PICK_FROM_ALBUM);
    }

    public void camera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(intent.resolveActivity((getPackageManager())) != null) {
            File photoFile = null;
            try{
                photoFile = createImageFile();
            } catch (IOException ex) {

            }
            if (photoFile != null) {
                Uri photoURI = FileProvider.getUriForFile(this,"com.example.lips_service",photoFile);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(intent, 101);
            }
        }
    }

    String currentPhotoPath;

    private  File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(imageFileName,".jpg",storageDir);

        currentPhotoPath = image.getAbsolutePath();
        return image;
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

            }catch (Exception e)
            {
            }
        }
        if (requestCode == 101 && resultCode == Activity.RESULT_OK) {

            setPic();
        }
    }

    private void setPic() {
        int targetW = img.getWidth();
        int targetH = img.getHeight();

        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
        bmOptions.inJustDecodeBounds = true;

        int photoW = bmOptions.outWidth;
        int photoH = bmOptions.outHeight;

        int scaleFactor = Math.min(photoW/targetW, photoH/targetH);

        bmOptions.inJustDecodeBounds = false;
        bmOptions.inSampleSize = scaleFactor;
        bmOptions.inPurgeable = true;

        imgp = BitmapFactory.decodeFile(currentPhotoPath, bmOptions);
        img.setImageBitmap(imgp);
    }

    private void permissionCheck() {
        if(Build.VERSION.SDK_INT >= 23) {
            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
            ArrayList<String> arrayPermission = new ArrayList<String>();

            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                arrayPermission.add(Manifest.permission.READ_EXTERNAL_STORAGE);
            }

            permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                arrayPermission.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            }

            if (arrayPermission.size() > 0) {
                String strArray[] = new String[arrayPermission.size()];
                strArray = arrayPermission.toArray(strArray);
                ActivityCompat.requestPermissions(this, strArray, PERMISSION_REQUEST_CODE);
            } else {

            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE: {
                if(grantResults.length < 1) {
                    Toast.makeText(this, "Failed get permission", Toast.LENGTH_SHORT).show();
                    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                    return;
                }

                for (int i=0; i<grantResults.length; i++) {
                    if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this,"Permission is denide : " + permissions[i], Toast.LENGTH_SHORT).show();
                        finish();
                        return;
                    }
                }

                Toast.makeText(this, "Permission is granted", Toast.LENGTH_SHORT).show();
            }
            break;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public int rotateImage(int exifOrientation) {
        if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_90) {
            return 90;
        } else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_180) {
            return 180;
        } else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_270) {
            return 270;
        } return 0;
    }

    public static Bitmap rotate(Bitmap source, float angle) {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    }



    private File saveBit(ImageView imageView) {
        imageView.setDrawingCacheEnabled(true);

        Bitmap ddr = imageView.getDrawingCache();

        String pa =  Environment.getExternalStorageDirectory()+"/";

        String ppa = pa + "fdr/sample/";

        File dir = new File(ppa);
        try {
            if (!dir.exists()) {
                dir.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String filename = "face.png";
        File file = new File(Environment.getExternalStorageDirectory() +"/fdr/sample", filename);
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            ddr.compress(Bitmap.CompressFormat.PNG, 90, os);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageView.setDrawingCacheEnabled(false);
        return file;
    }

    public File ScreenShot(View view) {
        view.setDrawingCacheEnabled(true);

        Bitmap screenBitmap = view.getDrawingCache();

        String filename = "screenshot.png";
        File file = new File(Environment.getExternalStorageDirectory() + "/Pictures",filename);
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            screenBitmap.compress(Bitmap.CompressFormat.PNG,90,os);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        view.setDrawingCacheEnabled(false);
        return file;
    }


    public void CU (View v) {

        File save = saveBit(img);
        if(save != null){
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,Uri.fromFile(save)));
        }


        Intent cu = new Intent(this,used.class);
        cu.putExtra("red",red);
        cu.putExtra("green",green);
        cu.putExtra("blue",blue);

        startActivity(cu);
    }
}

