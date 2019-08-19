package com.usama.finalyear.domain;

public class Price {
   private int HoleSalePrice;
   private int RetailPrice;
   private int EndPrice;

    public int getHoleSalePrice() {
        return HoleSalePrice;
    }

    public void setHoleSalePrice(int holeSalePrice) {
       this.HoleSalePrice = holeSalePrice;
    }

    public int getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.RetailPrice = retailPrice;
    }

    public int getEndPrice() {
        return EndPrice;
    }

    public void setEndPrice(int endPrice) {
       this.EndPrice = endPrice;
    }
}
