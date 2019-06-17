package com.mohmedhassan.hessahapp.HomeScreen;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mohmedhassan.hessahapp.HomeScreenDetails.HomeScreenDetailsActivity;
import com.mohmedhassan.hessahapp.OudAndAlbukhur.OudAndAlbukhurActivity;
import com.mohmedhassan.hessahapp.OudAndAlbukhurAcitivity;
import com.mohmedhassan.hessahapp.R;
import com.mohmedhassan.hessahapp.ShoppingCartActivity;
import com.mohmedhassan.hessahapp.SnapChatAvitity;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeScreenActivity extends AppCompatActivity {


    Context context;
    final long DELAY_MS = 300;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    int currentPage = 0;
    Timer timer;
    int NUM_PAGES;
    AlbukhurAdapter albukhurAdapter;
    LinearLayout linear_layout_shopping_cart;
    ImageView ImageView_shopping_cart;
    TextView Tv_snap_chat_homeScreen,Tv_oud_albukhur,Tv_Perfum;
    ArrayList<AlbukhurDataModel> dataModels = new ArrayList<>();
    RecyclerView recyclerview_item_albukhur;
    Spinner spinnerPerfumes,spinnerLanguage,spinnerCurrency;
    ArrayAdapter<CharSequence> arrayAdapterPerfumes;
    ArrayAdapter<CharSequence> arrayAdapterLanguage;
    ArrayAdapter<CharSequence> arrayAdapterCurrency;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        spinnerPerfumes = findViewById(R.id.spinnerPerfumes);
        spinnerLanguage = findViewById(R.id.spinnerLanguage);
        spinnerCurrency = findViewById(R.id.spinnerCarrancy);
        Tv_snap_chat_homeScreen = findViewById(R.id.tv_snap_chat_homeScreen);
        Tv_oud_albukhur = findViewById(R.id.tv_oud_albukhur);
        Tv_Perfum = findViewById(R.id.tv_perfumUAE);
        linear_layout_shopping_cart = findViewById(R.id.linear_layout_shopping_cart);
        ImageView_shopping_cart = findViewById(R.id.ImageView_shopping_cart);
        recyclerview_item_albukhur = findViewById(R.id.recyclerview_item_albukhur);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        arrayAdapterPerfumes = ArrayAdapter.createFromResource(this,
                R.array.perfumes_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterPerfumes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPerfumes.setAdapter(arrayAdapterPerfumes);

        arrayAdapterLanguage = ArrayAdapter.createFromResource(this,
                R.array.language_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterLanguage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLanguage.setAdapter(arrayAdapterLanguage);

        arrayAdapterCurrency = ArrayAdapter.createFromResource(this,
                R.array.currency_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterCurrency.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCurrency.setAdapter(arrayAdapterCurrency);



        albukhurAdapter = new AlbukhurAdapter(context, dataModels);
        recyclerview_item_albukhur.setLayoutManager(new GridLayoutManager(context, 3));
        recyclerview_item_albukhur.setItemAnimator(new DefaultItemAnimator());
        recyclerview_item_albukhur.setAdapter(albukhurAdapter);

        viewPagerAdapter = new ViewPagerAdapter(HomeScreenActivity.this);
        viewPager.setAdapter(viewPagerAdapter);

        prepareMovieData();
        ScorllPhoto();

        recyclerview_item_albukhur.addOnItemTouchListener(new RecyclerTouchListener(context, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(android.view.View view, int position) {
                AlbukhurDataModel dataModel = dataModels.get(position);
                Toast.makeText(HomeScreenActivity.this, dataModel.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeScreenActivity.this, HomeScreenDetailsActivity.class);
                startActivity(intent);
            }

            @Override
            public void onLongClick(android.view.View view, int position) {

            }

        }, recyclerview_item_albukhur));

        linear_layout_shopping_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, ShoppingCartActivity.class);
                startActivity(intent);
            }
        });
        ImageView_shopping_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, ShoppingCartActivity.class);
                startActivity(intent);
            }
        });
        Tv_snap_chat_homeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, SnapChatAvitity.class);
                startActivity(intent);
            }
        });
        Tv_oud_albukhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, OudAndAlbukhurActivity.class);
                startActivity(intent);
            }
        });

    }

    private void ScorllPhoto() {

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES - 1) {
                    currentPage = 0;

                }
                viewPager.setCurrentItem(currentPage++, true);
            }

        };
        currentPage = 0;


        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

    }


    private void prepareMovieData() {

        AlbukhurDataModel dataModel = new AlbukhurDataModel(R.drawable.albukhur1,String.valueOf(R.string.albukhur1),R.string.price_albukhur1,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur2,String.valueOf(R.string.albukhur2),R.string.price_albukhur2,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur3,String.valueOf(R.string.albukhur3),R.string.price_albukhur3,Double.valueOf("3.5"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur4,String.valueOf(R.string.albukhur4),R.string.price_albukhur4,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur5,String.valueOf(R.string.albukhur5),R.string.price_albukhur5,Double.valueOf("5"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur6,String.valueOf(R.string.albukhur6),R.string.price_albukhur6,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur7,String.valueOf(R.string.albukhur7),R.string.price_albukhur7,Double.valueOf("3.75"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur8,String.valueOf(R.string.albukhur8),R.string.price_albukhur8,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur9,String.valueOf(R.string.albukhur9),R.string.price_albukhur9,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur10,String.valueOf(R.string.albukhur10),R.string.price_albukhur10,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur11,String.valueOf(R.string.albukhur11),R.string.price_albukhur11,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new AlbukhurDataModel(R.drawable.albukhur12,String.valueOf(R.string.albukhur12),R.string.price_albukhur12,Double.valueOf("0"));
        dataModels.add(dataModel);


    }
}
