package testCases;

import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogInPage;
import pages.LogOut;

import javax.xml.transform.Result;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import static pages.BasePage.driver;

public class LogOutTests extends BasePage {
    private LogOut logOut;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        logOut = new LogOut(driver);


    }

    @Test
    public void logOutTest()  {
        logOut.EnterUserNameInTheField();
        logOut.EnterCorrectPassword();
        logOut.ClickOnLogInButton();
        logOut.ClickOnBurgerMenuButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        //String actualResult = driver.findElement(By.id("login-button")).getText();
        //System.out.println(actualResult);
        //Assert.assertTrue(actualResult.contains("Login"));


    }
    }
