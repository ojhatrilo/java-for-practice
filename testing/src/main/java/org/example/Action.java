package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector(".gLFyf"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().contextClick().build().perform();

    }
}
