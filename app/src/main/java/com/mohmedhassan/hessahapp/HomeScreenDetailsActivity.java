package com.mohmedhassan.hessahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class HomeScreenDetailsActivity extends AppCompatActivity {

    Button btn_AddToCard;
    Spinner spinnerSize, spinnerQty;
    ArrayAdapter<CharSequence> arrayAdapterSize;
    ArrayAdapter<CharSequence> arrayAdapterQty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_details);

        btn_AddToCard = findViewById(R.id.btn_AddToCard);
        spinnerSize = findViewById(R.id.spinnerSize);

        arrayAdapterSize = ArrayAdapter.createFromResource(this,
                R.array.size_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSize.setAdapter(arrayAdapterSize);



    }
}
