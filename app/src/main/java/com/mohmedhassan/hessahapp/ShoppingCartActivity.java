package com.mohmedhassan.hessahapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mohmedhassan.hessahapp.HomeScreen.HomeScreenActivity;

public class ShoppingCartActivity extends AppCompatActivity {

    Button btn_continue_shopping_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        btn_continue_shopping_card = findViewById(R.id.btn_continue_shopping_card);

        btn_continue_shopping_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ShoppingCartActivity.this, HomeScreenActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
