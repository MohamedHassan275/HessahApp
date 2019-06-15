package com.mohmedhassan.hessahapp.HomeScreen;

public class DataModel {

    int ImageView,Price;
    String Descrabtion;
    double Rating;



    public DataModel(int imageView, String descrabtion, int price, double rating) {
        ImageView = imageView;
        Descrabtion = descrabtion;
        Price = price;
        Rating = rating;
    }

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDescrabtion() {
        return Descrabtion;
    }

    public void setDescrabtion(String descrabtion) {
        Descrabtion = descrabtion;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }
}
