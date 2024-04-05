package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtertest {
    public static void main(String[] args) {

// TODO Auto-generated method stub



        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

        //1 results

        List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).

                collect(Collectors.toList());

        //1 result
//        System.out.println(veggies.size());
        Assert.assertEquals(veggies.size(), filteredList.size());

//        List<String> list = Arrays.asList("Alex", "Brian", "Charles");
//
//        list.forEach(System.out::println);



    }



}



