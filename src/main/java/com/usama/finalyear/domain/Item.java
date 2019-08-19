package com.usama.finalyear.domain;

public class Item {
    private Stock stock;
    private Category category;
    private Price price;
    private Rack rack;
    private Company company;
    private long id;
    

    private String name;
    public Item(){

    }

    public Item(String name) {
       this.name = name;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName(){
        return this.name;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price)
    {
        this.price = price;

    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }
    public Company getCompanyName () {
          return company;

    }
    public void setCompany(Company company)

    {
        this.company=company;

    }
}
