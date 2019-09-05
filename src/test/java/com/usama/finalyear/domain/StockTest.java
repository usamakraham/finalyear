package com.usama.finalyear.domain;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;


public class StockTest {
    @Test
    public void canSetStock() {
        Stock stock  = new Stock();
        stock.setMinimumStock(11);
        stock.setCurrentStock(4);
        assertEquals(11,stock.getMinimumStock());
    }
}
