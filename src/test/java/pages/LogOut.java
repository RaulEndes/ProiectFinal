package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut  extends BasePage {


    public LogOut(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    private WebElement UserStandardName;

    public void EnterUserNameInTheField(){UserStandardName.sendKeys("standard_user");}

    @FindBy(css = "#password")
    private WebElement Password;

    public void EnterCorrectPassword(){Password.sendKeys("secret_sauce");}

    @FindBy(id = "login-button")
    private WebElement LogInButton;

    public void ClickOnLogInButton(){LogInButton.click();}


    @FindBy(id = "react-burger-menu-btn")

    private WebElement BurgerMenuButton;
    public void ClickOnBurgerMenuButton(){
        BurgerMenuButton.click();
    }

    @FindBy(id = "logout_sidebar_link")
    private WebElement LogOutButton;
    public void ClickOnLogOutButton(){
        LogOutButton.click();
    }

    @FindBy(id = "inventory_sidebar_link")
    private WebElement AllItemsButton;
    public void ClickOnAllItemsButton(){
        AllItemsButton.click();
    }





}