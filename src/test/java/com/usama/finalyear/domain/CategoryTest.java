package com.usama.finalyear.domain;
import org.junit.Test;
import  static org.junit.Assert.*;

public class CategoryTest {
    @Test
    public void canSetCategoryName() {
        Category category = new Category();
        category.setCategoryName("giftItems");
        assertEquals("giftItems",category.getCategoryName());
    }
}
