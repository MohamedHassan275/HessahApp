package com.mohmedhassan.hessahapp.OudAndAlbukhur;

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

public class OudAdapter extends RecyclerView.Adapter<OudAdapter.CustomViewHolder> {

    Context context;
    ArrayList<OudDataModel> oudDataModels;

    public OudAdapter(Context context, ArrayList<OudDataModel> oudDataModels) {
        this.context = context;
        this.oudDataModels = oudDataModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageViewOudItem;
        public TextView Tv_priceOudItem,TV_NameOudItem;


        public CustomViewHolder(View view) {
            super(view);

            ImageViewOudItem = (ImageView) view.findViewById(R.id.ImageView_reycleView_oud_ListItem);
            Tv_priceOudItem = (TextView) view.findViewById(R.id.Tv__reycleView_price_oud_ListItem);
            TV_NameOudItem = (TextView) view.findViewById(R.id.Tv__reycleView_name_oud_ListItem);



        }
    }


    @NonNull
    @Override
    public OudAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_oud_list_item,viewGroup,false);
        return new OudAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OudAdapter.CustomViewHolder customViewHolder, int position) {

        OudDataModel oudDataModel = oudDataModels.get(position);
        customViewHolder.ImageViewOudItem.setImageResource(oudDataModel.getImageViewOud());
        customViewHolder.Tv_priceOudItem.setText(oudDataModel.getPriceOud());
        customViewHolder.TV_NameOudItem.setText(oudDataModel.getNameOud());

    }

    @Override
    public int getItemCount() {
        return oudDataModels.size();
    }
}
