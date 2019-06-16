package com.mohmedhassan.hessahapp.HomeScreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.mohmedhassan.hessahapp.R;

import java.util.ArrayList;

public class AlbukhurAdapter extends RecyclerView.Adapter<AlbukhurAdapter.CustomViewHolder> {

    Context context;
    ArrayList<AlbukhurDataModel> dataModels;

    public AlbukhurAdapter(Context context, ArrayList<AlbukhurDataModel> dataModels) {
        this.context = context;
        this.dataModels = dataModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {


        public ImageView Image_Albukhur;
        public TextView Title, Price;
        public RatingBar ratingBar;

        public CustomViewHolder(View view) {
            super(view);

            Image_Albukhur = (ImageView) view.findViewById(R.id.Recycle_image_albuhur);
            Title = (TextView) view.findViewById(R.id.tv_Recycle_price_albukhur);
            Price = (TextView) view.findViewById(R.id.tv_Recycle_price_albukhur);
            ratingBar = (RatingBar) view.findViewById(R.id.Recycle_ratingBar_albukhur);

            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(), HomeScreenDetailsActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });*/


        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reycle_albukhur_item, viewGroup, false);
        return new AlbukhurAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int position) {

        AlbukhurDataModel dataModel = dataModels.get(position);

        customViewHolder.Image_Albukhur.setImageResource(dataModel.getImageView());
        customViewHolder.Title.setText(dataModel.getTitle());
        customViewHolder.Price.setText(dataModel.getPrice());
        customViewHolder.ratingBar.setRating((float) dataModel.getRating());

    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }
}
