package com.usama.finalyear.services;

public interface Inventory {
    void increment (long itemId, int count);

    void decrement (long itemId, int count);
}
