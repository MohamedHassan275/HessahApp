package com.mohmedhassan.hessahapp.HomeScreenDetails;

public class Albukhur_Item_DataModel {

    int imageViewHome;
    String Name,Details,Price;

    public Albukhur_Item_DataModel(int imageViewHome, String name, String details, String price) {
        this.imageViewHome = imageViewHome;
        Name = name;
        Details = details;
        Price = price;
    }

    public int getImageViewHome() {
        return imageViewHome;
    }

    public void setImageViewHome(int imageViewHome) {
        this.imageViewHome = imageViewHome;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
