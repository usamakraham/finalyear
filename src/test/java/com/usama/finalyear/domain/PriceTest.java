package com.usama.finalyear.domain;

import org.junit.Test;
import static org.junit.Assert.*;
public class PriceTest {
    @Test
    public void canCheckPrices(){
        Price price = new Price();
        price.setHoleSalePrice(10);
        price.setEndPrice(25);
        price.setRetailPrice(30);
        assertEquals(30,price.getRetailPrice());
    }
}
