package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class InMemoryItemRepositoryTest {

    @After
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
    @Ignore
    public void whenItemHaveAnIdSaveMethodshouldNotAssignNewId(){
        Item item = new Item();
        InMemoryitemRepository itemrepository = new InMemoryitemRepository();
        item.setId(10);
        Item savedItem = itemrepository.save(item);
        assertEquals(10,savedItem.getId());
    }

    @Test
    @Ignore
    public void sameItemShouldNotSaveTwice(){
        Item item = new Item();
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.save(item);
        assertEquals(1,itemRepository.findAll().size());
    }
}

