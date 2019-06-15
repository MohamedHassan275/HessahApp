package com.mohmedhassan.hessahapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.HashMap;

public class Forgetpassword_Password_Activity extends AppCompatActivity {

    private static final String KEY_EMPTY = "";
    TextView Tv_password_forgetpassword,Tv_password_Confirm_forgetpassword;
    EditText Ed_password_forgetpassword,Ed_Confirm_password_forgetpassword;
    Button Btn_Submit_forgetpassword;
    String passwordHolder,confirmPasswordHolder,Email;
    ProgressBar m_progress_ForgetPassword_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword__password_);

        Tv_password_forgetpassword = findViewById(R.id.tv_password_forgetpassword);
        Tv_password_Confirm_forgetpassword = findViewById(R.id.tv_Confirm_password_forgetpassword);
        Ed_password_forgetpassword = findViewById(R.id.ed_password_forgetpassword);
        Ed_Confirm_password_forgetpassword = findViewById(R.id.ed__Confirm_password_forgetpassword);
        Btn_Submit_forgetpassword = findViewById(R.id.btn_submit_forgetpassword);
        m_progress_ForgetPassword_password = findViewById(R.id.m_progress_ForgetPassword_password);

        Ed_password_forgetpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_password_forgetpassword.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
        Ed_Confirm_password_forgetpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_password_Confirm_forgetpassword.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        Btn_Submit_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                passwordHolder = Ed_password_forgetpassword.getText().toString();



                if(validateInputs()){

                    Intent intent =new Intent(Forgetpassword_Password_Activity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();

                }

            }
        });

    }

    private boolean validateInputs() {

        if (KEY_EMPTY.equals(passwordHolder)) {
            Ed_password_forgetpassword.setError("password cannot be empty");
            Ed_password_forgetpassword.requestFocus();
            return false;
        }
        if (KEY_EMPTY.equals(confirmPasswordHolder)) {
            Ed_Confirm_password_forgetpassword.setError("password cannot be empty");
            Ed_Confirm_password_forgetpassword.requestFocus();
            return false;
        }

        if (passwordHolder.equals(confirmPasswordHolder)) {
            Ed_Confirm_password_forgetpassword.setError("Password and Confirm Password does not match");
            Ed_Confirm_password_forgetpassword.requestFocus();
            return false;
        }


        return true;
    }

}
