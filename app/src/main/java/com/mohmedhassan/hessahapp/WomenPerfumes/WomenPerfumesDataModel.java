package com.mohmedhassan.hessahapp.WomenPerfumes;

public class WomenPerfumesDataModel {

    int ImageView_WomenPerfumes;
    String Name_WomenPerfumes,Price_WomenPerfumes;

    public WomenPerfumesDataModel(int imageView_WomenPerfumes, String name_WomenPerfumes, String price_WomenPerfumes) {
        ImageView_WomenPerfumes = imageView_WomenPerfumes;
        Name_WomenPerfumes = name_WomenPerfumes;
        Price_WomenPerfumes = price_WomenPerfumes;
    }

    public int getImageView_WomenPerfumes() {
        return ImageView_WomenPerfumes;
    }

    public String getName_WomenPerfumes() {
        return Name_WomenPerfumes;
    }

    public String getPrice_WomenPerfumes() {
        return Price_WomenPerfumes;
    }
}
