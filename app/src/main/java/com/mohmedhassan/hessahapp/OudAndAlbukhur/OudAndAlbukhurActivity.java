package com.mohmedhassan.hessahapp.OudAndAlbukhur;

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

public class OudAndAlbukhurActivity extends AppCompatActivity {

    Context context;
    Spinner spinnerSortBy_Oud, spinnerShow_Oud;
    ImageView ImageViewListItemOud,ImageViewGridItemOud;
    OudAdapter oudAdapter;
    ArrayList<OudDataModel> oudDataModels = new ArrayList<>();
    RecyclerView recyclerview_OudAndAlbukhur_item;
    ArrayAdapter<CharSequence> arrayAdapterSortBy;
    ArrayAdapter<CharSequence> arrayAdapterShowItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oud_and_albukhur);

        spinnerSortBy_Oud = findViewById(R.id.spinnerSortBy_Oud);
        spinnerShow_Oud = findViewById(R.id.spinnerShow_Oud);
        ImageViewListItemOud = findViewById(R.id.ImageView_oud_ListItem);
        ImageViewGridItemOud = findViewById(R.id.ImageView_oud_GridItem);
        recyclerview_OudAndAlbukhur_item = findViewById(R.id.recyclerview_OudAndAlbukhur_details);

        oudAdapter = new OudAdapter(context, oudDataModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerview_OudAndAlbukhur_item.setLayoutManager(mLayoutManager);
        recyclerview_OudAndAlbukhur_item.setItemAnimator(new DefaultItemAnimator());
        recyclerview_OudAndAlbukhur_item.setAdapter(oudAdapter);



        arrayAdapterSortBy = ArrayAdapter.createFromResource(this,
                R.array.oud_sort_by_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSortBy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSortBy_Oud.setAdapter(arrayAdapterSortBy);

        arrayAdapterShowItem = ArrayAdapter.createFromResource(this,
                R.array.oud_show_iten_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterShowItem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerShow_Oud.setAdapter(arrayAdapterShowItem);

        prepareOudAndAlbukhur();

        ImageViewListItemOud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oudAdapter = new OudAdapter(context, oudDataModels);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context
                        , LinearLayoutManager.VERTICAL, false);
                recyclerview_OudAndAlbukhur_item.setLayoutManager(mLayoutManager);
                recyclerview_OudAndAlbukhur_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_OudAndAlbukhur_item.setAdapter(oudAdapter);

            }
        });

        ImageViewGridItemOud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oudAdapter = new OudAdapter(context, oudDataModels);
                recyclerview_OudAndAlbukhur_item.setLayoutManager(new GridLayoutManager(context, 2));
                recyclerview_OudAndAlbukhur_item.setItemAnimator(new DefaultItemAnimator());
                recyclerview_OudAndAlbukhur_item.setAdapter(oudAdapter);
            }
        });

    }

    private void prepareOudAndAlbukhur() {

        OudDataModel oudDataModel = new OudDataModel(R.drawable.oud1,"Cambodian oud","£59.49");
        oudDataModels.add(oudDataModel);

        oudDataModel = new OudDataModel(R.drawable.oud2,"Indian Oud Oil","£69.41");
        oudDataModels.add(oudDataModel);

        oudDataModel = new OudDataModel(R.drawable.oud3,"misk","£19.83");
        oudDataModels.add(oudDataModel);

        oudDataModel = new OudDataModel(R.drawable.oud4,"Oud Marouki","£59.49");
        oudDataModels.add(oudDataModel);

        oudDataModel = new OudDataModel(R.drawable.oud5,"Oud Marouki","£59.49");
        oudDataModels.add(oudDataModel);

        oudDataModel = new OudDataModel(R.drawable.oud6,"Oud Prashin Special Oil","£45.61");
        oudDataModels.add(oudDataModel);
    }
}
