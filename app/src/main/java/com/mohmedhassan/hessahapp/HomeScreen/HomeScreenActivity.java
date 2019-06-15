package com.mohmedhassan.hessahapp.HomeScreen;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mohmedhassan.hessahapp.R;

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
    ArrayList<DataModel> dataModels = new ArrayList<>();
    RecyclerView recyclerview_item_albukhur;
    Spinner spinnerPerfumes;
    ArrayAdapter<CharSequence> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        spinnerPerfumes = findViewById(R.id.spinnerPerfumes);
        recyclerview_item_albukhur = findViewById(R.id.recyclerview_item_albukhur);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.perfumes_arrray , android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPerfumes.setAdapter(arrayAdapter);



        albukhurAdapter = new AlbukhurAdapter(context, dataModels);
        recyclerview_item_albukhur.setLayoutManager(new GridLayoutManager(context, 3));
        recyclerview_item_albukhur.setItemAnimator(new DefaultItemAnimator());
        recyclerview_item_albukhur.setAdapter(albukhurAdapter);

        viewPagerAdapter = new ViewPagerAdapter(HomeScreenActivity.this);
        viewPager.setAdapter(viewPagerAdapter);

        prepareMovieData();
        ScorllPhoto();


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

        DataModel dataModel = new DataModel(R.drawable.albukhur1,String.valueOf(R.string.albukhur1),R.string.price_albukhur1,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur2,String.valueOf(R.string.albukhur2),R.string.price_albukhur2,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur3,String.valueOf(R.string.albukhur3),R.string.price_albukhur3,Double.valueOf("3.5"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur4,String.valueOf(R.string.albukhur4),R.string.price_albukhur4,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur5,String.valueOf(R.string.albukhur5),R.string.price_albukhur5,Double.valueOf("5"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur6,String.valueOf(R.string.albukhur6),R.string.price_albukhur6,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur7,String.valueOf(R.string.albukhur7),R.string.price_albukhur7,Double.valueOf("3.75"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur8,String.valueOf(R.string.albukhur8),R.string.price_albukhur8,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur9,String.valueOf(R.string.albukhur9),R.string.price_albukhur9,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur10,String.valueOf(R.string.albukhur10),R.string.price_albukhur10,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur11,String.valueOf(R.string.albukhur11),R.string.price_albukhur11,Double.valueOf("0"));
        dataModels.add(dataModel);

        dataModel = new DataModel(R.drawable.albukhur12,String.valueOf(R.string.albukhur12),R.string.price_albukhur12,Double.valueOf("0"));
        dataModels.add(dataModel);


    }
}
