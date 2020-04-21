package com.example.ventiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Display_Summary extends AppCompatActivity {
    private Button nexttoTesting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__summary);
        nexttoTesting = (Button) findViewById(R.id.btncontinue);
        nexttoTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTestingPage();
            }
        });
    }
    public void openTestingPage(){
        Intent testingpage = new Intent(this, Testing.class);
        startActivity(testingpage);
    }
}
