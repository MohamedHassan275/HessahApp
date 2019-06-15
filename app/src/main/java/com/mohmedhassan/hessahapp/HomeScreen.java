package com.mohmedhassan.hessahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeScreen extends AppCompatActivity {

    Spinner spinnerPerfumes;
    ArrayAdapter<CharSequence> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        spinnerPerfumes = findViewById(R.id.spinnerPerfumes);

        arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.perfumes_arrray , android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPerfumes.setAdapter(arrayAdapter);


    }
}
