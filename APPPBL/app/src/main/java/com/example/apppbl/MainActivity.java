package com.example.apppbl;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AcessCamera(View view) {
        int numOfCamera = Camera.getNumberOfCameras();//Lay ve so luong cam
        if(numOfCamera > 0){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"No cam detected",Toast.LENGTH_LONG).show();

        }

    }
}