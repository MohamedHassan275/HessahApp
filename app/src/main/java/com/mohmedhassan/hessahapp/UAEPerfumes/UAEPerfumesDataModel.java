package com.mohmedhassan.hessahapp.UAEPerfumes;

public class UAEPerfumesDataModel {

    int ImageViewPerfumes;
    String NamePerfumes,PricePerfumes;

    public UAEPerfumesDataModel(int imageViewPerfumes, String namePerfumes, String pricePerfumes) {
        ImageViewPerfumes = imageViewPerfumes;
        NamePerfumes = namePerfumes;
        PricePerfumes = pricePerfumes;
    }

    public int getImageViewPerfumes() {
        return ImageViewPerfumes;
    }

    public String getNamePerfumes() {
        return NamePerfumes;
    }

    public String getPricePerfumes() {
        return PricePerfumes;
    }
}
