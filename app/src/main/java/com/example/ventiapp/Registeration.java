package com.example.ventiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registeration extends AppCompatActivity {
    private TextView alreadyRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        alreadyRegistered = (TextView) findViewById(R.id.txtclickhere);
        alreadyRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReturnLoginPage();
            }
        });
    }
    public void ReturnLoginPage(){
        Intent returnLogin = new Intent(this,Login.class);
        startActivity(returnLogin);
    }
}
