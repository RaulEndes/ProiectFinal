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
import pages.SortByHighToLow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortByHighToLowTests extends BasePage {
    private SortByHighToLow sortByHighToLow;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        sortByHighToLow = new SortByHighToLow(driver);


    }
    @Test
    public void sortByPriceHighToLow() {
        sortByHighToLow.EnterUserNameInTheField();
        sortByHighToLow.EnterCorrectPassword();
        sortByHighToLow.ClickOnLogInButton();

        List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> beforeFilterPriceList = new ArrayList<>();

        for (WebElement p : beforeFilterPrice) {
            beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (high to low)");

        List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> afterFilterPriceList = new ArrayList<>();

        for (WebElement p : afterFilterPrice) {
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        Collections.sort(beforeFilterPriceList, Collections.reverseOrder());



    }
}