package com.usama.finalyear.domain;
import org.junit.Test;
import  static org.junit.Assert.*;

public class CompanyTest {
    @Test
    public void canSetcompantname(){
        Company company =new Company();
        company.setCompanyName("pepsi");
        assertEquals("pepsi",company.getCompanyName());
    }

}
