package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;
import java.util.List;
import java.util.Optional;

public interface ItemRepositories {
    Item save(Item Item);
    List<Item> findAll();
    Optional<Item> findById(long id);
    boolean deletepermanently(long id);
    boolean delete(long id);
}