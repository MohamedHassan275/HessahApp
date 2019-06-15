package com.mohmedhassan.hessahapp;

import android.content.Context;
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

import com.mohmedhassan.hessahapp.HomeScreen.HomeScreenActivity;

public class LoginActivity extends AppCompatActivity {

    private static final String KEY_EMPTY = "";
    ProgressBar progressBar;
    EditText Email, Password;
    TextView Tv_Register_Login, Tv_email, Tv_password,Tv_forgetpassword,Tv_LogOut_login,Tv_sign_in_login;
    Button Btn_Login;
    String NameHolder, PasswordHolder,Lang;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Btn_Login = findViewById(R.id.btn_login);
        Tv_Register_Login = findViewById(R.id.tv_register_login);
        Tv_forgetpassword = findViewById(R.id.tv_forgetpassword_login);
        Email = findViewById(R.id.ed_email_login);
        Password = findViewById(R.id.ed_password_login);
        Tv_email = findViewById(R.id.tv_eamil_login);
        Tv_password = findViewById(R.id.tv_password_login);
        Tv_sign_in_login = findViewById(R.id.tv_sign_in_login);
        progressBar = findViewById(R.id.m_progress_login);



        Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_email.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
        Password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                Tv_password.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        Btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                startActivity(intent);

            }
        });
        Tv_Register_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
        Tv_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, ForgetpasswordEmailActivity.class);
                startActivity(intent);

            }
        });

    }
}
