package com.mohmedhassan.hessahapp.UAEPerfumes;

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

import com.mohmedhassan.hessahapp.OudAndAlbukhur.OudAdapter;
import com.mohmedhassan.hessahapp.OudAndAlbukhur.OudDataModel;
import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class UAEPerfumesActivity extends AppCompatActivity {

    Context context;
    Spinner spinnerPerfumes_SortBy,spinnerPerfumes_Show;
    ImageView ImageViewListItemPerfumes,ImageViewGridItemPerfumes;
    UAEPerfumesAdapter uaePerfumesAdapter;
    ArrayList<UAEPerfumesDataModel> uaePerfumesDataModels = new ArrayList<>();
    RecyclerView recyclerview_Perfumes_item;
    ArrayAdapter<CharSequence> arrayAdapterSortBy;
    ArrayAdapter<CharSequence> arrayAdapterShowItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uaeperfumes);

        spinnerPerfumes_SortBy = findViewById(R.id.spinnerSortBy_perfumes);
        spinnerPerfumes_Show = findViewById(R.id.spinnerShow_perfumes);
        ImageViewListItemPerfumes = findViewById(R.id.ImageView_perfumes_ListItem);
        ImageViewGridItemPerfumes = findViewById(R.id.ImageView_perfumes_GridItem);
        recyclerview_Perfumes_item = findViewById(R.id.recyclerview_perfumes_details);

        uaePerfumesAdapter = new UAEPerfumesAdapter(context, uaePerfumesDataModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerview_Perfumes_item.setLayoutManager(mLayoutManager);
        recyclerview_Perfumes_item.setItemAnimator(new DefaultItemAnimator());
        recyclerview_Perfumes_item.setAdapter(uaePerfumesAdapter);

        arrayAdapterSortBy = ArrayAdapter.createFromResource(this,
                R.array.oud_sort_by_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSortBy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPerfumes_SortBy.setAdapter(arrayAdapterSortBy);

        arrayAdapterShowItem = ArrayAdapter.createFromResource(this,
                R.array.oud_show_iten_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterShowItem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPerfumes_Show.setAdapter(arrayAdapterShowItem);



        ImageViewListItemPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uaePerfumesAdapter = new UAEPerfumesAdapter(context, uaePerfumesDataModels);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context
                        , LinearLayoutManager.VERTICAL, false);
                recyclerview_Perfumes_item.setLayoutManager(mLayoutManager);
                recyclerview_Perfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_Perfumes_item.setAdapter(uaePerfumesAdapter);

            }
        });

        ImageViewGridItemPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uaePerfumesAdapter = new UAEPerfumesAdapter(context, uaePerfumesDataModels);
                recyclerview_Perfumes_item.setLayoutManager(new GridLayoutManager(context, 2));
                recyclerview_Perfumes_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_Perfumes_item.setAdapter(uaePerfumesAdapter);
            }
        });

        prepareOudAndAlbukhur();

    }

    private void prepareOudAndAlbukhur() {

        UAEPerfumesDataModel uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum1,"Desire Dream","£12.69");
        uaePerfumesDataModels.add(uaePerfumesDataModel);

        uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum2,"CAGE","£25.38");
        uaePerfumesDataModels.add(uaePerfumesDataModel);

        uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum3,"Gaëlle ELSATYS for women","£47.59");
        uaePerfumesDataModels.add(uaePerfumesDataModel);

        uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum4,"SENORTA CUTE FOR WOMEN","£19.04");
        uaePerfumesDataModels.add(uaePerfumesDataModel);

        uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum5,"venezia","£26.97");
        uaePerfumesDataModels.add(uaePerfumesDataModel);

        uaePerfumesDataModel= new UAEPerfumesDataModel(R.drawable.perfum6,"سدرة الغرمول للجنسين ","£22.21");
        uaePerfumesDataModels.add(uaePerfumesDataModel);
    }

}
