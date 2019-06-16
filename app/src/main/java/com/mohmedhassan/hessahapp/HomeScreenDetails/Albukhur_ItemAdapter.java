package com.mohmedhassan.hessahapp.HomeScreenDetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohmedhassan.hessahapp.HomeScreen.AlbukhurAdapter;
import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class Albukhur_ItemAdapter extends RecyclerView.Adapter<Albukhur_ItemAdapter.CustomViewHolder> {

    Context context;
    ArrayList<Albukhur_Item_DataModel> albukhur_item_dataModels;

    public Albukhur_ItemAdapter(Context context, ArrayList<Albukhur_Item_DataModel> albukhur_item_dataModels) {
        this.context = context;
        this.albukhur_item_dataModels = albukhur_item_dataModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageViewListItem;
        public TextView Tv_NameListItem, Tv_DetailsListItem, Tv_priceListItem;


        public CustomViewHolder(View view) {
            super(view);

            ImageViewListItem = (ImageView) view.findViewById(R.id.ImageViewListItem);
            Tv_NameListItem = (TextView) view.findViewById(R.id.Tv_NameListItem);
            Tv_DetailsListItem = (TextView) view.findViewById(R.id.Tv_DetailsListItem);
            Tv_priceListItem = (TextView) view.findViewById(R.id.Tv_priceListItem);


        }
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_albuckur_details_list_item, viewGroup, false);
        return new Albukhur_ItemAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int position) {

        Albukhur_Item_DataModel albukhur_item_dataModel = albukhur_item_dataModels.get(position);

        customViewHolder.ImageViewListItem.setImageResource(albukhur_item_dataModel.getImageViewHome());
        customViewHolder.Tv_NameListItem.setText(albukhur_item_dataModel.getName());
        customViewHolder.Tv_DetailsListItem.setText(albukhur_item_dataModel.getDetails());
        customViewHolder.Tv_priceListItem.setText(albukhur_item_dataModel.getPrice());
    }

    @Override
    public int getItemCount() {
        return albukhur_item_dataModels.size();
    }
}
