package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Invoking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.findElement(By.className("gLFyf")).click();
//        driver.findElement(By.className("gLFyf")).sendKeys("java.org");
//        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("45566");
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        String error = driver.findElement(By.cssSelector(".error")).getText();
        System.out.println(error);
        driver.findElement(By.linkText("Forgot your password?")).click();










    }
}
