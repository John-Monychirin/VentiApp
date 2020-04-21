package com.example.ventiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private TextView register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPatientdatapage();
            }
        });
        register = (TextView) findViewById(R.id.txtregister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationpage();
            }
        });
    }
    public void openRegistrationpage(){
        Intent register = new Intent(this,Registeration.class);
        startActivity(register);
    }
    public void openPatientdatapage(){
        Intent patientdata = new Intent(this, Patients_Records.class);
        startActivity(patientdata);
    }
}
