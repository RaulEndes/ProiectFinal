package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SauceLabsBackpackOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SauceLabsBackpackOrderTests extends BasePage {
    private SauceLabsBackpackOrder sauceLabsBackpackOrder;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        sauceLabsBackpackOrder = new SauceLabsBackpackOrder(driver);


    }

    @Test
    public void BuySauceLabsBackpack(){

        sauceLabsBackpackOrder.EnterUserNameInTheField();
        sauceLabsBackpackOrder.EnterCorrectPassword();
        sauceLabsBackpackOrder.ClickOnLogInButton();
        sauceLabsBackpackOrder.AddToCartSauceLabsBackpack();
        sauceLabsBackpackOrder.ClickOnShoppingCart();
        sauceLabsBackpackOrder.ClickOnCheckoutButton();
        sauceLabsBackpackOrder.EnterFirstNameInTheField();
        sauceLabsBackpackOrder.EnterLastNameInTheField();
        sauceLabsBackpackOrder.EnterZipCodeInTheField();
        sauceLabsBackpackOrder.ClickOnContinueButton();
        sauceLabsBackpackOrder.ClickOnFinishButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));



    }

}