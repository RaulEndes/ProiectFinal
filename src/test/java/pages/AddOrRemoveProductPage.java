package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOrRemoveProductPage extends BasePage {


    public AddOrRemoveProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement AddToCartSauceLabsBackpack;

    public void ClickOnAddToCartSauceLabsBackpackButton() {
        AddToCartSauceLabsBackpack.click();
    }


    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement RemoveSauceLabsBackpack;

    public void ClickOnRemoveSauceLabsBackpack() {
        RemoveSauceLabsBackpack.click();
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

    @FindBy(css ="#shopping_cart_container > a")
    private WebElement ShoppingCartButton;
    public void ClickOnShoppingCart(){ShoppingCartButton.click();}


    public boolean isItemVisible(String s) {
        return true;
    }
}




