package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void sep(){
        System.out.println("hi");

    }
    @BeforeTest
    public void june(){
        System.out.println("hi everyone");
    }
    @AfterTest
    public void guest(){
        System.out.println("hello guest");
    }

}
