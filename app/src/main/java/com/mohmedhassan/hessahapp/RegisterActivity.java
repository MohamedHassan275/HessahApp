package com.mohmedhassan.hessahapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    Button Login, Register;
    EditText Password,ConfirmPassword;
    Spinner SpinnerCountry, SpinnerRegion_State;
    CheckBox checkBoxShowPassword,checkBoxThePrivacy;
    ArrayAdapter<CharSequence> arrayAdapter;
    ArrayAdapter<CharSequence> arrayAdapter2;
    String spinnerRegion_State, spinnerCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Login = findViewById(R.id.btn_sign_up_register);
        Register = findViewById(R.id.btn_login_register);
        SpinnerCountry = findViewById(R.id.spinnerCountry);
        SpinnerRegion_State = findViewById(R.id.spinnerRegion_State);
        checkBoxShowPassword = findViewById(R.id.Ch_ShowPassword);
        checkBoxThePrivacy = findViewById(R.id.Ch_Privacy);
        Password = findViewById(R.id.Ed_reg_password);
        ConfirmPassword = findViewById(R.id.Ed_reg_confirm_password);




        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    ConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    ConfirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        checkBoxThePrivacy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    Login.setEnabled(false);
                    Login.setTextColor(Color.parseColor("#555557"));


                } else {
                    // hide password
                    Login.setEnabled(true);
                    Login.setTextColor(Color.parseColor("#fffbfbfe"));

                }
            }
        });

        arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.country_arrray , android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerCountry.setAdapter(arrayAdapter);

        arrayAdapter2 = ArrayAdapter.createFromResource(this,
                R.array.region_State_arrray , android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerRegion_State.setAdapter(arrayAdapter2);

        SpinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                  SpinnerRegion_State.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
