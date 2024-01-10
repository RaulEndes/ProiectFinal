package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsBackpackOrder extends BasePage {


    public SauceLabsBackpackOrder(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement AddToCartSauceLabsBackpackButton;

    public void AddToCartSauceLabsBackpack() {
        AddToCartSauceLabsBackpackButton.click();
    }

    @FindBy(id = "shopping_cart_container")
    private WebElement ShoppingCartContainer;

    public void ClickOnShoppingCart() {
        ShoppingCartContainer.click();
    }

    @FindBy(css = "#checkout")
    private WebElement CheckoutButton;

    public void ClickOnCheckoutButton() {
        CheckoutButton.click();
    }

    @FindBy(id = "first-name")
    private WebElement FirstNameField;

    public void EnterFirstNameInTheField() {
        FirstNameField.sendKeys("First Name");
    }

    @FindBy(id = "last-name")
    private WebElement LastNameField;

    public void EnterLastNameInTheField() {
        LastNameField.sendKeys("Last Name");
    }

    @FindBy(id = "postal-code")
    private WebElement ZipCodeField;

    public void EnterZipCodeInTheField() {
        ZipCodeField.sendKeys("12345");
    }

    @FindBy(id = "continue")
    private WebElement ContinueButton;

    public void ClickOnContinueButton() {
        ContinueButton.click();
    }

    @FindBy(id = "user-name")
    private WebElement UserStandardName;

    public void EnterUserNameInTheField() {
        UserStandardName.sendKeys("standard_user");
    }


    @FindBy(css = "#password")
    private WebElement Password;

    public void EnterCorrectPassword() {
        Password.sendKeys("secret_sauce");
    }


    @FindBy(id = "login-button")
    private WebElement LogInButton;

    public void ClickOnLogInButton() {
        LogInButton.click();
    }


    @FindBy(css = "#finish")
    private WebElement FinishButton;

    public void ClickOnFinishButton() {
        FinishButton.click();
    }

}
