package com.example.ventiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    DatabaseHelper db;
    private TextView register;
    private Button login;
    private EditText E1,E2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        E1 = (EditText) findViewById(R.id.editUser) ;
        E2 = (EditText) findViewById(R.id.editpassword) ;
        login = (Button) findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPatientdatapage();
                String username = E1.getText().toString();
                String Password = E2.getText().toString();
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
