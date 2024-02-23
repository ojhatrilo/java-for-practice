package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import rahulshettyacademy.pageobjects.*;

import java.time.Duration;
import java.util.List;

public class StandAloneApplication {
    public static void main(String[] args) throws InterruptedException {
        String productName = "ZARA COAT 3";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        LandingPage page = new LandingPage(driver);
        page.goTo();
        page.loginApplication("livewire@gmail.com","Admin@123");
        ProductCatalogue productCatalogue = new ProductCatalogue(driver);
        List<WebElement>products =productCatalogue.getProductList();
        productCatalogue.addProductToCart(productName);
        productCatalogue.goToCartPage();

        CartPage cartPage = new CartPage(driver);
        Boolean match = cartPage.VerifyProductDisplay(productName);
        Assert.assertTrue(match);
       
        CheckoutPage checkoutPage = cartPage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();

        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ODER."));
        driver.close();



    }
}
