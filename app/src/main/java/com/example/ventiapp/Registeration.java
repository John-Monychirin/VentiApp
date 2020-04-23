package com.example.ventiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registeration extends AppCompatActivity {
    DatabaseHelper db;
    private TextView alreadyRegistered;
    private EditText e1,e2,e3,e4;
    private Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.editregName) ;
        e2 = (EditText) findViewById(R.id.editregEmail) ;
        e3 = (EditText) findViewById(R.id.editpassword) ;
        e4 = (EditText) findViewById(R.id.editconfirmpassword) ;
        Reg = (Button) findViewById(R.id.btnregister);
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                if(s1.equals("") || s2.equals("")||s3.equals("")||s4.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(s3.equals(s4)){
                        Boolean chkemail = db.chkemail(s2);
                        if (chkemail==true){
                            Boolean insert = db.insert(s1,s2,s3);
                            if (insert == true){
                                Toast.makeText(getApplicationContext(),"Registered successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"User Name already exists",Toast.LENGTH_SHORT).show();
                        }
                    }
                    Toast.makeText(getApplicationContext(),"Passwords dont match",Toast.LENGTH_SHORT).show();
                }
            }
        });
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
