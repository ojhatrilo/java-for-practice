package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","D:\\Staff\\Ojha file\\testing\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]
//
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//
//
//
//        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().to("https://rahulshettyacademy.com");

        driver.navigate().back();

        driver.navigate().forward();

    }
}
