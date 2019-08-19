package com.usama.finalyear.repositories;
//import com.usama.finalYear.domain.Item;
import com.usama.finalyear.repositories.InMemoryitemRepository;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class InMemoryItemRepositoryTest {
    @Test
    public void canretriveNewItem(){
        Item item = new Item ();
        InMemoryitemRepository itemrepository = new InMemoryitemRepository ();
        itemrepository.save(item);

        List<Item> list = itemrepository.findAll();
        assertEquals(1,list.size());

    }
}

