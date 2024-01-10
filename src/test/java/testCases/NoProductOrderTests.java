package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.NoProductOrder;
import pages.SauceLabsBackpackOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NoProductOrderTests extends BasePage {
    private NoProductOrder noProductOrder;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        noProductOrder  = new NoProductOrder(driver);


    }

    @Test
    public void NoProductInCartAndCheckout(){

        noProductOrder.EnterUserNameInTheField();
        noProductOrder.EnterCorrectPassword();
        noProductOrder.ClickOnLogInButton();
        noProductOrder.ClickOnShoppingCart();
        noProductOrder.ClickOnCheckoutButton();
        noProductOrder.EnterFirstNameInTheField();
        noProductOrder.EnterLastNameInTheField();
        noProductOrder.EnterZipCodeInTheField();
        noProductOrder.ClickOnContinueButton();
        noProductOrder.ClickOnFinishButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));





    }



    }

