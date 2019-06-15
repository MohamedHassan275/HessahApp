package com.mohmedhassan.hessahapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPasswordVerifyCode extends AppCompatActivity {

    Button Btn_verifyDone_forgetpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_verify_code);

        Btn_verifyDone_forgetpassword = findViewById(R.id.btn_verifyDone_forgetpassword);

        Btn_verifyDone_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ForgetPasswordVerifyCode.this, Forgetpassword_Password_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
