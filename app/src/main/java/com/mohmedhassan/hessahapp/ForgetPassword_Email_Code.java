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
import android.widget.Toast;

public class ForgetPassword_Email_Code extends AppCompatActivity {

    private static final String KEY_EMPTY = "";
    EditText Ed_emailCode_forgetpassword;
    TextView Tv_emailCode_forgetpassword;
    Button Btn_emailCode_forgetpassword;
    String emailCode,Code,Email;
    ProgressBar m_progress_ForgetPassword_email_code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password__email__code);

        Ed_emailCode_forgetpassword = findViewById(R.id.ed_emailCode_forgetpassword);
        Tv_emailCode_forgetpassword = findViewById(R.id.tv_eamilCode_forgetpassword);
        Btn_emailCode_forgetpassword = findViewById(R.id.btn_emailCode_forgetpassword);
        m_progress_ForgetPassword_email_code = findViewById(R.id.m_progress_ForgetPassword_email_code);

        Ed_emailCode_forgetpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_emailCode_forgetpassword.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
        Btn_emailCode_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                emailCode = Ed_emailCode_forgetpassword.getText().toString();

                if(validateInputs()){

                    Intent intent = new Intent(ForgetPassword_Email_Code.this, ForgetPasswordVerifyCode.class);
                    startActivity(intent);
                    finish();

                }



            }
        });
    }

    private boolean validateInputs() {

        if (KEY_EMPTY.equals(emailCode)) {
            Ed_emailCode_forgetpassword.setError("Verification Code cannot be empty");
            Ed_emailCode_forgetpassword.requestFocus();
            return false;
        }
        if ((emailCode.length() < 4)) {
            Ed_emailCode_forgetpassword.setError("Invalid Verification Code");
            Ed_emailCode_forgetpassword.requestFocus();
            return false;
        }

        return true;
    }

}
