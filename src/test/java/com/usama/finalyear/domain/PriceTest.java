package com.usama.finalyear.domain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
