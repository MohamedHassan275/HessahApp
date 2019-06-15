package com.mohmedhassan.hessahapp.HomeScreen;

public class DataModel {

    int ImageView,Price;
    String Title;
    double Rating;



    public DataModel(int imageView, String Title, int price, double rating) {
        ImageView = imageView;
        Title = Title;
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

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }
}
