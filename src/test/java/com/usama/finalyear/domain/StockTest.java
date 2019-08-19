package com.usama.finalyear.domain;

import org.junit.Test;
import  static org.junit.Assert.*;


public class StockTest {
    @Test
    public void canSetStock() {
        Stock stock  = new Stock();
        stock.setMinimumStock(11);
        stock.setCurrentStock(4);
        assertEquals(11,stock.getMinimumStock());
    }
}
