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

public class ForgetpasswordEmailActivity extends AppCompatActivity {

    private static final String KEY_EMPTY = "";
    TextView Tv_email_forgetpassword;
    EditText Ed_email_forgetpassword;
    Button Btn_next_forgetpassword;
    String EmailCode;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword_email);

        Tv_email_forgetpassword = findViewById(R.id.tv_eamil_forgetpassword);
        Ed_email_forgetpassword = findViewById(R.id.ed_email_forgetpassword);
        Btn_next_forgetpassword = findViewById(R.id.btn_forgetpassword);
        progressBar = findViewById(R.id.m_progress_ForgetPassword);

        Ed_email_forgetpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_email_forgetpassword.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        Btn_next_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EmailCode = Ed_email_forgetpassword.getText().toString();


                if (validateInputs()) {


                    Intent intent = new Intent(ForgetpasswordEmailActivity.this, ForgetPassword_Email_Code.class);
                    startActivity(intent);


                }

            }
        });
    }

    private boolean validateInputs() {

        if (KEY_EMPTY.equals(EmailCode)) {
            Ed_email_forgetpassword.setError("Email cannot be empty");
            Ed_email_forgetpassword.requestFocus();
            return false;
        }

        if (!EmailCode.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")) {
            Ed_email_forgetpassword.setError("Invalid Email Address");
            Ed_email_forgetpassword.requestFocus();
            return false;
        }

        return true;
    }

}
