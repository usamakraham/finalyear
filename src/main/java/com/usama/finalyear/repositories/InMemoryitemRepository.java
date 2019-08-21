
package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryitemRepository implements ItemRepositories {
    static int n = 1;

    private List<Item> list = new ArrayList<Item>();

    public Item save(Item item) {
       //  for (int n=1;n<=list.size();n++) {


             item.setId(n);
             list.add(item);
             n = n + 1;
       //  }
        return item;

    }

    public List<Item> findAll() {
        return list;
    }

    public Optional<Item> findById(long id) {
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (id == item.getId()) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
