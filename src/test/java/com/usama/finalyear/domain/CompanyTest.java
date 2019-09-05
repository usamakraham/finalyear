package com.usama.finalyear.domain;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {
    @Test
    public void canSetcompantname(){
        Company company =new Company();
        company.setCompanyName("pepsi");
        assertEquals("pepsi",company.getCompanyName());
    }

}
