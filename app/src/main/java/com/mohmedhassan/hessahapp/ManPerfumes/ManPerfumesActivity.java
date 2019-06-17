package com.mohmedhassan.hessahapp.ManPerfumes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.mohmedhassan.hessahapp.R;
import com.mohmedhassan.hessahapp.UAEPerfumes.UAEPerfumesAdapter;
import com.mohmedhassan.hessahapp.UAEPerfumes.UAEPerfumesDataModel;

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
        ImageViewGridItem_ManPerfumes = findViewById(R.id.ImageView_Women_perfumes_GridItem);
        recyclerview__ManPerfumes_item = findViewById(R.id.recyclerview_Man_perfumes_details);

        arrayAdapterSortBy = ArrayAdapter.createFromResource(this,
                R.array.oud_sort_by_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSortBy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ManPerfumes_SortBy.setAdapter(arrayAdapterSortBy);

        arrayAdapterShowItem = ArrayAdapter.createFromResource(this,
                R.array.oud_show_iten_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterShowItem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ManPerfumes_Show.setAdapter(arrayAdapterShowItem);
    }
}
