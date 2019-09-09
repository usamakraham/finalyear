
package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryitemRepository implements ItemRepositories {
    static int n = 1;

    private List<Item> list = new ArrayList<Item>();

    public Item save(Item item) {

        if (!list.contains(item)) {
            if (item.getId() == 0) {
                item.setId(n);
                n = n + 1;
            }
            list.add(item);
        }
        return item;
    }

    public List<Item> findAll() {
        List<Item> filterdList = new ArrayList<Item>();
        for(int i=0 ;i<list.size();i++)
        {
            Item item = list.get(i);
            if(item.isDeleted() == false){
                filterdList.add(item);
            }

        }
        return filterdList;
    }

    public Optional<Item> findById(long id) {
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (id == item.getId()) //item.getId());
            {
                if(item.isDeleted())
                {
                    return Optional.empty();
                }
                else {
                    return Optional.of(item);
                }

            }

        }
        return Optional.empty();
    }

    public boolean deletepermanently(long id) {
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (item.getId() == id) {
                list.remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean delete(long id) {
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (item.getId() == id) {

                item.setdeleted(true);
                return true;
            }
        }
        return false;
    }

}
