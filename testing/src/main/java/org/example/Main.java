package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Staff\\Ojha file\\testing\\chromedriver.exe");// invoking the chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// this is for time delay
        driver.get("https://rahulshettyacademy.com/locatorspractice/");// Acessing the web page url
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");// sending values to the url
        driver.findElement(By.name("inputPassword")).sendKeys("hello@123");//sennding values to the url
        driver.findElement(By.className("signInBtn")).click();// Click action is performed
//        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//getting the error of the text
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//        Thread. sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
        Thread. sleep(1000);

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();




    }
}