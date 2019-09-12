package com.usama.finalyear.repositories;

import com.usama.finalyear.domain.Item;
//import com.usama.finalyear.services.InMemoryInventory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryItemRepositoryTest {

    @AfterEach
    public void resetStatic(){
        InMemoryitemRepository.testRest();
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
    public void itemFindById(){
        Item item = new Item( "Abc");
        Item item1 = new Item("acc2");
        item.setId(10);
        item1.setId(20);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.save(item1);
      //  item.getItemName();
        Optional<Item> optionalItem = itemRepository.findById(10);
        assertTrue(optionalItem.isPresent());

        Item itemFromDb = optionalItem.get();
        assertEquals("Abc",itemFromDb.getItemName());
    }

    //todo save one item, findbyid with id 10, assertFalse(optionalItem.isPresent)
      @Test
    public void findByIdAndtoDoassertFalse(){

        Item item4 = new Item ("perfume");
        item4.setId(40);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item4);
        Optional<Item>optionalItem = itemRepository.findById(60);
         // item4.getItemName();
        assertFalse(optionalItem.isPresent());

     }
     @Test
    public void deleteparmantanItemByItsId(){
        Item item = new Item ();
        item.setId(30);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.deletepermanently(30);
        Optional<Item>optionalItem= itemRepository.findById(30);
        assertFalse(optionalItem.isPresent());


     }

     @Test
    public void saveTwoItemsAnddeletepermantOneItem(){
        Item item = new Item();
        Item item2 = new Item();
        item.setId(25);
        item2.setId(35);
        InMemoryitemRepository itemRepository =new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.save(item2);
        itemRepository.deletepermanently(35);
        itemRepository.findAll().size();
         Optional<Item>optionalItem= itemRepository.findById(25);
         assertTrue(optionalItem.isPresent());
     }
     @Test
    public void canNotsaveitemAndDeleteParmanatOneItem(){

        Item item =new Item();
        item.setId(45);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.deletepermanently(45);
         Optional<Item>optionalItem= itemRepository.findById(45);
         assertFalse(optionalItem.isPresent());
     }
    @Test
    public void deleteanItemByItsId(){
        Item item = new Item ();
        item.setId(30);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.delete(30);
        Optional<Item>optionalItem= itemRepository.findById(30);
        assertFalse(optionalItem.isPresent());
    }

    @Test
    public void saveTwoItemsAndRemoveOne(){
        Item item = new Item();
        Item item2 = new Item();
        item.setId(25);
        item2.setId(35);
        InMemoryitemRepository itemRepository =new InMemoryitemRepository();
        itemRepository.save(item);
        itemRepository.save(item2);
        itemRepository.delete(35);
        itemRepository.findAll().size();
        Optional<Item>optionalItem= itemRepository.findById(25);
        assertTrue(optionalItem.isPresent());
    }
    @Test
    public void canNotsaveitemAndRemoveOneItem(){

        Item item =new Item();
        item.setId(45);
        InMemoryitemRepository itemRepository = new InMemoryitemRepository();
        itemRepository.delete(45);
        Optional<Item>optionalItem= itemRepository.findById(45);
        assertFalse(optionalItem.isPresent());





    }
}

