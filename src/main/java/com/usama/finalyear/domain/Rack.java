package com.usama.finalyear.domain;

public class Rack {
   private String RackNo;
   private Category RackCategory;

    public String getRackNo() {
        return RackNo;
    }

    public void setRackNo(String rackNo) {
        RackNo = rackNo;
    }

    public Category getRackCategory() {
        return RackCategory;
    }

    public void setRackCategory(Category rackCategory) {
       this.RackCategory = rackCategory;
    }
}
