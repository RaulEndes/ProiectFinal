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

public class LogInTest extends BasePage {
    private LogInPage logInPage;




    @BeforeMethod
    public void setUp() {
        super.setUp();
        logInPage= new LogInPage(driver);


        }

        //Test 1 : Test login
        @Test
    public void LogInWithValidData(){

    logInPage.EnterUserNameInTheField();
    logInPage.EnterCorrectPassword();
    logInPage.ClickOnLogInButton();

    String ExpectedTitle = "Swag Labs";
    String ActualTitle = driver.getTitle();
    if(ExpectedTitle.equals(ActualTitle)){
        System.out.println("Test 1 successful");
    }}




    }









