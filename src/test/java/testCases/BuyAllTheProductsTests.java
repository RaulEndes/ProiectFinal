package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.BuyAllTheProducts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BuyAllTheProductsTests extends BasePage {
    private BuyAllTheProducts buyAllTheProducts;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        buyAllTheProducts = new BuyAllTheProducts(driver);


    }

    @Test
    public void BuySauceLabsBackpack() {

        buyAllTheProducts.EnterUserNameInTheField();
        buyAllTheProducts.EnterCorrectPassword();
        buyAllTheProducts.ClickOnLogInButton();
        buyAllTheProducts.AddToCartTestAllTheThingsTShirtRed();
        buyAllTheProducts.AddToCartSauceLabsBikeLight();
        buyAllTheProducts.AddToCartSauceLabsBoltTShirt();
        buyAllTheProducts.AddToCartSauceLabsFleeceJacket();
        buyAllTheProducts.AddToCartSauceLabsOnesie();
        buyAllTheProducts.AddToCartSauceLabsBackpack();
        buyAllTheProducts.ClickOnShoppingCart();
        buyAllTheProducts.ClickOnCheckoutButton();
        buyAllTheProducts.EnterFirstNameInTheField();
        buyAllTheProducts.EnterLastNameInTheField();
        buyAllTheProducts.EnterZipCodeInTheField();
        buyAllTheProducts.ClickOnContinueButton();
        buyAllTheProducts.ClickOnFinishButton();


        String actualResult = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));


    }

}