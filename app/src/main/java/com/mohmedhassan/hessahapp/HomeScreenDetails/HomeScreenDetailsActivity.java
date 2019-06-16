package com.mohmedhassan.hessahapp.HomeScreenDetails;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.mohmedhassan.hessahapp.HomeScreen.AlbukhurDataModel;
import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class HomeScreenDetailsActivity extends AppCompatActivity {

    Context context;
    Button btn_AddToCard;
    Spinner spinnerSize;
    Albukhur_ItemAdapter albukhur_itemAdapter;
    ArrayList<Albukhur_Item_DataModel> albukhur_item_dataModels = new ArrayList<>();
    RecyclerView recyclerview_albukhur_item;
    ArrayAdapter<CharSequence> arrayAdapterSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_details);

        btn_AddToCard = findViewById(R.id.btn_AddToCard);
        spinnerSize = findViewById(R.id.spinnerSize);
        recyclerview_albukhur_item = findViewById(R.id.recyclerview_item_albukhur_details);

        albukhur_itemAdapter = new Albukhur_ItemAdapter(context, albukhur_item_dataModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.HORIZONTAL, false);
        recyclerview_albukhur_item.setLayoutManager(mLayoutManager);
        recyclerview_albukhur_item.setItemAnimator(new DefaultItemAnimator());
        recyclerview_albukhur_item.setAdapter(albukhur_itemAdapter);

        arrayAdapterSize = ArrayAdapter.createFromResource(this,
                R.array.size_arrray , android.R.layout.simple_spinner_item);
        arrayAdapterSize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSize.setAdapter(arrayAdapterSize);


        prepareAlbukhur_item();

    }

    private void prepareAlbukhur_item() {

        Albukhur_Item_DataModel albukhur_item_dataModel = new Albukhur_Item_DataModel(R.drawable.albukhur5,"L’Autre Oud Eau de Parfum Lancome for women and men","Lancome launches L'Autre Oud in October 2012 as a part of the luxurious and exclusive collectio..","£115.01");
        albukhur_item_dataModels.add(albukhur_item_dataModel);

         albukhur_item_dataModel = new Albukhur_Item_DataModel(R.drawable.albukhur7,"Oud Bouquet Eau de Parfum Lancome for women and men"," Oud Bouquet provide a unique spicy flavor of saffron, announcing rose petals in the heart comb..","£110.5");
        albukhur_item_dataModels.add(albukhur_item_dataModel);

         albukhur_item_dataModel = new Albukhur_Item_DataModel(R.drawable.albukhur9,"La Vie Est Belle Lancome for women","La Vie Est Belle is a new Lancome fragrance, available on the market from fall 2012...","£100.5");
        albukhur_item_dataModels.add(albukhur_item_dataModel);



    }
}
