package com.usama.finalyear.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTests {

    @Test
    public void canSetItemName(){
        Item item = new Item("Shampoo");
        assertEquals("Shampoo",item.getItemName());
    }
    @Test
    public void canSetPrices(){
        Item lifeboy = new Item("lifeboy");

        Price price = new Price();
        price.setHoleSalePrice(10);
        price.setEndPrice(15);
        price.setRetailPrice(20);

        lifeboy.setPrice(price);

        assertEquals(15, lifeboy.getPrice().getEndPrice());
    }
    @Test
    public void canCheckStock(){
        Item faceWash = new Item("faceWash");
        Stock stock = new Stock();
        stock.setMinimumStock(15);
        stock.setCurrentStock(2);
        faceWash.setStock(stock);
        assertEquals(2,faceWash.getStock().getCurrentStock());
    }
    // bhai mobile k koi update ho rahi thi restart ho rha ...............
    @Test
    public void cancheckRackNo$RackCatagory(){
        Item item = new Item("item");
        Rack rack = new Rack ();
        Category category = new Category();
        category.setCategoryName("Cosmetics");
        rack.setRackNo("A1");
        rack.setRackCategory(category);
        item.setRack(rack);
        assertEquals("A1",item.getRack().getRackNo());
    }
    @Test
    public void canCheckCategory(){
    Item item = new Item("item");
    Category category = new Category();
    category.setCategoryName("generalitems");
    item.setCategory(category);
    assertEquals("generalitems",item.getCategory().getCategoryName());
    }

}