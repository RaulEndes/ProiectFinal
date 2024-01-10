package testCases;

import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogInPage;

import javax.xml.transform.Result;
import static pages.BasePage.driver;

public class LogInWithWrongPasswordTest extends BasePage {
    private LogInPage logInPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        logInPage = new LogInPage(driver);

    }
    //Test 2 : Login with wrong password
    @Test
    public void LogInWithWrongPassword(){

        logInPage.EnterCorrectPassword();
        logInPage.EnterWrongPassword();
        logInPage.ClickOnLogInButton();

        String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        String ExpectedError = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(ActualError.contains("Epic sadface:"));
        System.out.println("Test 2 successful");
    }


}