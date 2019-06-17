package com.mohmedhassan.hessahapp.ManPerfumes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohmedhassan.hessahapp.R;
import com.mohmedhassan.hessahapp.UAEPerfumes.UAEPerfumesDataModel;

import java.util.ArrayList;

public class ManPerfumesAdapter extends RecyclerView.Adapter<ManPerfumesAdapter.CustomViewHolder> {

    Context context;
    ArrayList<ManPerfumesDataModel> manPerfumesDataModels;

    public ManPerfumesAdapter(Context context, ArrayList<ManPerfumesDataModel> manPerfumesDataModels) {
        this.context = context;
        this.manPerfumesDataModels = manPerfumesDataModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageView_ManPerfumesItem;
        public TextView Tv_price_ManPerfumesItem,TV_Name_ManPerfumesItem;


        public CustomViewHolder(View view) {
            super(view);

            ImageView_ManPerfumesItem = (ImageView) view.findViewById(R.id.ImageView_reycleView_Man_perfumes_ListItem);
            Tv_price_ManPerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_name__Man_perfumes_ListItem);
            TV_Name_ManPerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_price__Man_perfumes_ListItem);

        }
    }

    @NonNull
    @Override
    public ManPerfumesAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reycle_man_perfumes_item,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ManPerfumesAdapter.CustomViewHolder customViewHolder, int position) {

        ManPerfumesDataModel manPerfumesDataModel = manPerfumesDataModels.get(position);
        customViewHolder.ImageView_ManPerfumesItem.setImageResource(manPerfumesDataModel.getImageView_ManPerfumes());
        customViewHolder.TV_Name_ManPerfumesItem.setText(manPerfumesDataModel.getName_ManPerfumes());
        customViewHolder.Tv_price_ManPerfumesItem.setText(manPerfumesDataModel.getPrice_ManPerfumes());
    }

    @Override
    public int getItemCount() {
        return manPerfumesDataModels.size();
    }
}
