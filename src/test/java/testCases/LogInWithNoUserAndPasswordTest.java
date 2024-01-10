package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LogInPage;

public class LogInWithNoUserAndPasswordTest extends BasePage {
    private LogInPage logInPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        logInPage = new LogInPage(driver);

    }

    @Test
    public void LogInWithWrongPassword(){

   logInPage.EnterNoUserNameInTheField();
   logInPage.EnterNoCorrectPassword();
   logInPage.ClickOnLogInButton();

        String ActualError = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        String ExpectedError = "Epic sadface: Username is required";
        Assert.assertTrue(ActualError.contains("Epic sadface: Username is required"));
        System.out.println("Test 3 successful");

}}