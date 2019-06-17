package com.mohmedhassan.hessahapp.ManPerfumes;

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

public class ManPerfumesActivity extends AppCompatActivity {

    Context context;
    Spinner spinner_ManPerfumes_SortBy,spinner_ManPerfumes_Show;
    ImageView ImageViewListItem_ManPerfumes,ImageViewGridItem_ManPerfumes;
    ManPerfumesAdapter manPerfumesAdapter;
    ArrayList<ManPerfumesDataModel> manPerfumesDataModels= new ArrayList<>();
    RecyclerView recyclerview__ManPerfumes_item;
    ArrayAdapter<CharSequence> arrayAdapterSortBy;
    ArrayAdapter<CharSequence> arrayAdapterShowItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_perfumes);

        spinner_ManPerfumes_SortBy = findViewById(R.id.spinnerSortBy_Man_perfumes);
        spinner_ManPerfumes_Show = findViewById(R.id.spinnerShow_Man_perfumes);
        ImageViewListItem_ManPerfumes = findViewById(R.id.ImageView_Man_perfumes_ListItem);
        ImageViewGridItem_ManPerfumes = findViewById(R.id.ImageView_Man_perfumes_GridItem);
        recyclerview__ManPerfumes_item = findViewById(R.id.recyclerview_Man_perfumes_details);

        manPerfumesAdapter = new ManPerfumesAdapter(context, manPerfumesDataModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerview__ManPerfumes_item.setLayoutManager(mLayoutManager);
        recyclerview__ManPerfumes_item.setItemAnimator(new DefaultItemAnimator());
        recyclerview__ManPerfumes_item.setAdapter(manPerfumesAdapter);

        arrayAdapterSortBy = ArrayAdapter.createFromResource(this,
                R.array.oud_sort_by_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSortBy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ManPerfumes_SortBy.setAdapter(arrayAdapterSortBy);

        arrayAdapterShowItem = ArrayAdapter.createFromResource(this,
                R.array.oud_show_iten_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterShowItem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ManPerfumes_Show.setAdapter(arrayAdapterShowItem);

        ImageViewListItem_ManPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manPerfumesAdapter = new ManPerfumesAdapter(context, manPerfumesDataModels);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context
                        , LinearLayoutManager.VERTICAL, false);
                recyclerview__ManPerfumes_item.setLayoutManager(mLayoutManager);
                recyclerview__ManPerfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview__ManPerfumes_item.setAdapter(manPerfumesAdapter);

            }
        });

        ImageViewGridItem_ManPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manPerfumesAdapter = new ManPerfumesAdapter(context, manPerfumesDataModels);
                recyclerview__ManPerfumes_item.setLayoutManager(new GridLayoutManager(context, 2));
                recyclerview__ManPerfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview__ManPerfumes_item.setAdapter(manPerfumesAdapter);
            }
        });

        prepare_ManPerfumes();

    }

    private void prepare_ManPerfumes() {

        ManPerfumesDataModel manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"Desire Dream","£30.50");
        manPerfumesDataModels.add(manPerfumesDataModel);

        manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"Desire Dream","£15.50");
        manPerfumesDataModels.add(manPerfumesDataModel);

        manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"CAGE","£25.75");
        manPerfumesDataModels.add(manPerfumesDataModel);

        manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"venezia","£50.75");
        manPerfumesDataModels.add(manPerfumesDataModel);

        manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"CAGE","£75.50");
        manPerfumesDataModels.add(manPerfumesDataModel);

        manPerfumesDataModel= new ManPerfumesDataModel(R.drawable.perfum1,"Desire Dream","£35.50");
        manPerfumesDataModels.add(manPerfumesDataModel);


    }

}
