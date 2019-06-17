package com.mohmedhassan.hessahapp.WomenPerfumes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohmedhassan.hessahapp.ManPerfumes.ManPerfumesAdapter;
import com.mohmedhassan.hessahapp.ManPerfumes.ManPerfumesDataModel;
import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class WomenPerfumesAdapter extends RecyclerView.Adapter<WomenPerfumesAdapter.CustomViewHolder> {

    Context context;
    ArrayList<WomenPerfumesDataModel> womenPerfumesDataModels;

    public WomenPerfumesAdapter(Context context, ArrayList<WomenPerfumesDataModel> womenPerfumesDataModels) {
        this.context = context;
        this.womenPerfumesDataModels = womenPerfumesDataModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageView_WomenPerfumesItem;
        public TextView Tv_price_Man_WomenPerfumesItem,TV_Name_WomenPerfumesItem;


        public CustomViewHolder(View view) {
            super(view);

            ImageView_WomenPerfumesItem = (ImageView) view.findViewById(R.id.ImageView_reycleView_Women_perfumes_ListItem);
            TV_Name_WomenPerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_name_Women_perfumes_ListItem);
            Tv_price_Man_WomenPerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_price_Women_perfumes_ListItem);


        }
    }

    @NonNull
    @Override
    public WomenPerfumesAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reycle_women_perfumes_item,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WomenPerfumesAdapter.CustomViewHolder customViewHolder, int position) {

        WomenPerfumesDataModel womenPerfumesDataModel = womenPerfumesDataModels.get(position);
        customViewHolder.ImageView_WomenPerfumesItem.setImageResource(womenPerfumesDataModel.getImageView_WomenPerfumes());
        customViewHolder.TV_Name_WomenPerfumesItem.setText(womenPerfumesDataModel.getName_WomenPerfumes());
        customViewHolder.Tv_price_Man_WomenPerfumesItem.setText(womenPerfumesDataModel.getPrice_WomenPerfumes());
    }

    @Override
    public int getItemCount() {
        return womenPerfumesDataModels.size();
    }
}
