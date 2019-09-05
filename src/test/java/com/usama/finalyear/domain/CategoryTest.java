package com.usama.finalyear.domain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryTest {
    @Test
    public void canSetCategoryName() {
        Category category = new Category();
        category.setCategoryName("giftItems");
        assertEquals("giftItems",category.getCategoryName());
    }
}
