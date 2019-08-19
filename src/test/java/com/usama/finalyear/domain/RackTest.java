package com.usama.finalyear.domain;
import org.junit.Test;
import  static org.junit.Assert.*;


public class RackTest {
    @Test
    public void canSetRackNameAndNo() {
        Rack rack = new Rack();
        rack.setRackNo("a1");
        assertEquals("a1",rack.getRackNo());
    }
}


