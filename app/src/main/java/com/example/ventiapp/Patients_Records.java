package com.example.ventiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Patients_Records extends AppCompatActivity {
    private ImageView backtoLogin;
    private ImageView nexttoDisplaysumarry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients__records);
        nexttoDisplaysumarry = (ImageView) findViewById(R.id.imagenext);
        nexttoDisplaysumarry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisplaySumarry();
            }
        });
        backtoLogin = (ImageView) findViewById(R.id.imageback);
        backtoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBacktoLogin();
            }
        });
    }
    public void openBacktoLogin(){
        Intent arrowback = new Intent(this, Login.class);
        startActivity(arrowback);
    }
    public void openDisplaySumarry(){
        Intent arrownext = new Intent(this, Display_Summary.class);
        startActivity(arrownext);
    }
}
