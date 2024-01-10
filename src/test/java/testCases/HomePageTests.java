package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomePageTests extends BasePage {
    private HomePage homePage;




    @BeforeMethod
    public void setUp() {
        super.setUp();
        homePage= new HomePage(driver);


    }

    @Test
    public void FacebookButtonTest(){

        homePage.EnterUserNameInTheField();
        homePage.EnterCorrectPassword();
        homePage.ClickOnLogInButton();
        homePage.ClickFacebookButton();
        driver.get("https://www.facebook.com/saucelabs");
        if(driver.getCurrentUrl().startsWith("https://www.facebook.com/saucelabs"))
            System.out.println("Success");
        else
            System.out.println("Failure");

    }


    @Test
    public void TweeterButtonTest(){
        homePage.EnterUserNameInTheField();
        homePage.EnterCorrectPassword();
        homePage.ClickOnLogInButton();
        homePage.ClickOnTweeterButton();
        driver.get("https://twitter.com/saucelabs");
        if(driver.getCurrentUrl().startsWith("https://twitter.com/saucelabs"))
            System.out.println("Success");
        else
            System.out.println("Failure");

    }

    @Test
    public void LinkedinButtonTest(){
        homePage.EnterUserNameInTheField();
        homePage.EnterCorrectPassword();
        homePage.ClickOnLogInButton();
        homePage.ClickOnLinkedinButton();
        driver.get("https://www.linkedin.com/company/sauce-labs/");
        if(driver.getCurrentUrl().startsWith("https://www.linkedin.com/company/sauce-labs/"))
            System.out.println("Success");
        else
            System.out.println("Failure");

    }



}