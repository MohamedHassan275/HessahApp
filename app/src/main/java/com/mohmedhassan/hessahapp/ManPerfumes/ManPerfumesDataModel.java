package com.mohmedhassan.hessahapp.ManPerfumes;

public class ManPerfumesDataModel {

    int ImageView_ManPerfumes;
    String Name_ManPerfumes,Price_ManPerfumes;

    public ManPerfumesDataModel(int imageView_ManPerfumes, String name_ManPerfumes, String price_ManPerfumes) {
        ImageView_ManPerfumes = imageView_ManPerfumes;
        Name_ManPerfumes = name_ManPerfumes;
        Price_ManPerfumes = price_ManPerfumes;
    }

    public int getImageView_ManPerfumes() {
        return ImageView_ManPerfumes;
    }

    public String getName_ManPerfumes() {
        return Name_ManPerfumes;
    }

    public String getPrice_ManPerfumes() {
        return Price_ManPerfumes;
    }
}
