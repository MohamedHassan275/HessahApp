package com.mohmedhassan.hessahapp.UAEPerfumes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class UAEPerfumesAdapter extends RecyclerView.Adapter<UAEPerfumesAdapter.CustomViewHolder> {

    Context context;
    ArrayList<UAEPerfumesDataModel>uaePerfumesDataModel;

    public UAEPerfumesAdapter(Context context, ArrayList<UAEPerfumesDataModel> uaePerfumesDataModel) {
        this.context = context;
        this.uaePerfumesDataModel = uaePerfumesDataModel;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageViewPerfumesItem;
        public TextView Tv_pricePerfumesItem,TV_NamePerfumesItem;


        public CustomViewHolder(View view) {
            super(view);

            ImageViewPerfumesItem = (ImageView) view.findViewById(R.id.ImageView_reycleView_perfumes_ListItem);
            Tv_pricePerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_price_perfumes_ListItem);
            TV_NamePerfumesItem = (TextView) view.findViewById(R.id.Tv__reycleView_name_perfumes_ListItem);

        }
    }

    @NonNull
    @Override
    public UAEPerfumesAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_perfumes_list_item,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int position) {

        UAEPerfumesDataModel perfumesDataModel =uaePerfumesDataModel.get(position);
        customViewHolder.ImageViewPerfumesItem.setImageResource(perfumesDataModel.getImageViewPerfumes());
        customViewHolder.TV_NamePerfumesItem.setText(perfumesDataModel.getNamePerfumes());
        customViewHolder.Tv_pricePerfumesItem.setText(perfumesDataModel.getPricePerfumes());
    }

    @Override
    public int getItemCount() {
        return uaePerfumesDataModel.size();
    }
}
