package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage  extends BasePage {


    public LogInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement UserStandardName;

    public void EnterUserNameInTheField(){UserStandardName.sendKeys("standard_user");
    }

    @FindBy(id = "user-name")
    private WebElement NoUserStandardName;

    public void EnterNoUserNameInTheField(){UserStandardName.sendKeys("");
    }
    @FindBy(id = "user-name")
    private WebElement WrongUserStandardName;

    public void EnterWrongUserNameInTheField(){UserStandardName.sendKeys("wrong_user");
    }

    @FindBy(css = "#password")
    private WebElement Password;

    public void EnterCorrectPassword(){Password.sendKeys("secret_sauce");}

    @FindBy(css = "#password")
    private WebElement NoPassword;

    public void EnterNoCorrectPassword(){Password.sendKeys("");}

    @FindBy(css = "#password")
    private WebElement WrongPassword;

    public void EnterWrongPassword(){Password.sendKeys("secret_sauce123");}


    @FindBy(id = "login-button")
    private WebElement LogInButton;

    public void ClickOnLogInButton(){LogInButton.click();}

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    private WebElement HomePageProductsText;

    @FindBy(css="#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement LogInErrorCode;






}