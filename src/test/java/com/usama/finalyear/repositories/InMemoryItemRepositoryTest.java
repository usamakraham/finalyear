package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InMemoryItemRepositoryTest {

    @AfterEach
    public void resetStatic(){
        InMemoryitemRepository.n=1;
    }

    @Test
    public void canretriveNewItem(){
        Item item = new Item ();
        InMemoryitemRepository itemrepository = new InMemoryitemRepository ();
        itemrepository.save(item);

        List<Item> list = itemrepository.findAll();
        assertEquals(1,list.size());
    }

    @Test
    public void saveItemShouldHaveId1(){
        Item item = new Item ();
        InMemoryitemRepository itemrepository = new InMemoryitemRepository ();
        Item savedItem = itemrepository.save(item);
        assertEquals(1,savedItem.getId());
    }

    @Test
    public void saveItemShouldHaveIds(){
        Item item1 = new Item ();
        Item item2 = new Item ();

        InMemoryitemRepository itemrepository = new InMemoryitemRepository ();
        Item savedItem1 = itemrepository.save(item1);
        assertEquals(1,savedItem1.getId());

        Item savedItem2 = itemrepository.save(item2);
        assertEquals(2,savedItem2.getId());
    }
    @Test
    public void whenItemHaveAnIdSaveMethodshouldNotAssignNewId(){
        Item item = new Item("fair and lovly");
        InMemoryitemRepository itemrepository = new InMemoryitemRepository();
        item.setId(100);
        Item savedItem = itemrepository.save(item);
        assertEquals(100,savedItem.getId());
    }

    @Test

    public void sameItemShouldNotSaveTwice(){
        Item item = new Item();
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.save(item);
        assertEquals(1,itemRepository.findAll().size());
    }
    @Test
    @Disabled
    public void itemFindById(){
        Item item = new Item( "Abc");
        Item item1 = new Item("acc2");
        item.setId(10);
        item1.setId(20);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item1);
        itemRepository.save(item1);
      //  item.getItemName();
        Optional<Item> optionalItem = itemRepository.findById(10);
        assertTrue(optionalItem.isPresent());
        Item itemFromDb = optionalItem.get();
        assertEquals("Abc",itemFromDb.getItemName());
    }

    //todo save one item, findbyid with id 10, assertFalse(optionalItem.isPresent)

}

