package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.AddOrRemoveProductPage;

public class AddOrRemoveProductTest extends BasePage {

    private AddOrRemoveProductPage addOrRemoveProductPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addOrRemoveProductPage = new AddOrRemoveProductPage(driver);
    }

    @Test

    public void AddProductToTheCart(){

        addOrRemoveProductPage.EnterUserNameInTheField();
        addOrRemoveProductPage.EnterCorrectPassword();
        addOrRemoveProductPage.ClickOnLogInButton();
        addOrRemoveProductPage.ClickOnAddToCartSauceLabsBackpackButton();
        addOrRemoveProductPage.ClickOnShoppingCart();

        boolean isItemVisible = addOrRemoveProductPage.isItemVisible("#item_0_title_link > div");
        Assert.assertTrue(isItemVisible, "Sauce Labs Bike Light is not visible in the shopping cart");
    }







    }





