package com.usama.finalyear.domain;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;


public class RackTest {
    @Test
    public void canSetRackNameAndNo() {
        Rack rack = new Rack();
        rack.setRackNo("a1");
        assertEquals("a1",rack.getRackNo());
    }
}


