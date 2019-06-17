package com.mohmedhassan.hessahapp.WomenPerfumes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class WomenPerfumesActivity extends AppCompatActivity {

    Context context;
    Spinner spinner_WomenPerfumes_SortBy,spinner_WomenPerfumes_Show;
    ImageView ImageViewListItem_WomenPerfumes,ImageViewGridItem_WomenPerfumes;
    WomenPerfumesAdapter womenPerfumesAdapter;
    ArrayList<WomenPerfumesDataModel> womenPerfumesDataModels = new ArrayList<>();
    RecyclerView recyclerview_WomenPerfumes_item;
    ArrayAdapter<CharSequence> arrayAdapterSortBy;
    ArrayAdapter<CharSequence> arrayAdapterShowItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_perfumes);

        spinner_WomenPerfumes_SortBy = findViewById(R.id.spinnerSortBy_Women_perfumes);
        spinner_WomenPerfumes_Show = findViewById(R.id.spinnerShow_Women_perfumes);
        ImageViewListItem_WomenPerfumes = findViewById(R.id.ImageView_Women_perfumes_ListItem);
        ImageViewGridItem_WomenPerfumes = findViewById(R.id.ImageView_Women_perfumes_GridItem);
        recyclerview_WomenPerfumes_item = findViewById(R.id.recyclerview_Women_perfumes_details);

        womenPerfumesAdapter = new WomenPerfumesAdapter(context, womenPerfumesDataModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerview_WomenPerfumes_item.setLayoutManager(mLayoutManager);
        recyclerview_WomenPerfumes_item.setItemAnimator(new DefaultItemAnimator());
        recyclerview_WomenPerfumes_item.setAdapter(womenPerfumesAdapter);

        arrayAdapterSortBy = ArrayAdapter.createFromResource(this,
                R.array.oud_sort_by_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSortBy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_WomenPerfumes_SortBy.setAdapter(arrayAdapterSortBy);

        arrayAdapterShowItem = ArrayAdapter.createFromResource(this,
                R.array.oud_show_iten_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterShowItem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_WomenPerfumes_Show.setAdapter(arrayAdapterShowItem);

        ImageViewListItem_WomenPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                womenPerfumesAdapter = new WomenPerfumesAdapter(context, womenPerfumesDataModels);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context
                        , LinearLayoutManager.VERTICAL, false);
                recyclerview_WomenPerfumes_item.setLayoutManager(mLayoutManager);
                recyclerview_WomenPerfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_WomenPerfumes_item.setAdapter(womenPerfumesAdapter);

            }
        });

        ImageViewGridItem_WomenPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                womenPerfumesAdapter = new WomenPerfumesAdapter(context, womenPerfumesDataModels);
                recyclerview_WomenPerfumes_item.setLayoutManager(new GridLayoutManager(context, 2));
                recyclerview_WomenPerfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_WomenPerfumes_item.setAdapter(womenPerfumesAdapter);
            }
        });

        prepare_WomenPerfumes();
    }

    private void prepare_WomenPerfumes() {

        WomenPerfumesDataModel womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud1,"Desire Dream","£15.50");
        womenPerfumesDataModels.add(womenPerfumesDataModel);

        womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud2,"CAGE","£25.50");
        womenPerfumesDataModels.add(womenPerfumesDataModel);

        womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud3,"Desire Dream","£50.75");
        womenPerfumesDataModels.add(womenPerfumesDataModel);

        womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud4,"venezia","£75.50");
        womenPerfumesDataModels.add(womenPerfumesDataModel);

        womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud5,"Desire Dream ","£35.50");
        womenPerfumesDataModels.add(womenPerfumesDataModel);

        womenPerfumesDataModel= new WomenPerfumesDataModel(R.drawable.oud6,"CAGE","£30.75");
        womenPerfumesDataModels.add(womenPerfumesDataModel);


    }
}
