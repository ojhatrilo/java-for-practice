package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invoking {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.className("gLFyf")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("java.org");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);



    }
}
