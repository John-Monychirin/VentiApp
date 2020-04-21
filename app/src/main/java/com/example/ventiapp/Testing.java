package com.example.ventiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Testing extends AppCompatActivity {
    private Button editdata;
    private Button nexttoGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        nexttoGraph = (Button) findViewById(R.id.btnNext) ;
        nexttoGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGraphpage();
            }
        });
        editdata = (Button) findViewById(R.id.btneditdata);
        editdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPatientsDataPage();
            }
        });
    }
    public void openPatientsDataPage(){
        Intent patientdatapage = new Intent(this, Patients_Records.class);
        startActivity(patientdatapage);
    }
    public void openGraphpage(){
        Intent graphAnalysis = new Intent(this, Graph_Analysis.class);
        startActivity(graphAnalysis);
    }
}
