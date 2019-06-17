package com.mohmedhassan.hessahapp.OudAndAlbukhur;

public class OudDataModel {

    int ImageViewOud;
    String NameOud,PriceOud;

    public OudDataModel(int imageViewOud, String nameOud, String priceOud) {
        ImageViewOud = imageViewOud;
        NameOud = nameOud;
        PriceOud = priceOud;
    }

    public int getImageViewOud() {
        return ImageViewOud;
    }

    public String getNameOud() {
        return NameOud;
    }

    public String getPriceOud() {
        return PriceOud;
    }
}
