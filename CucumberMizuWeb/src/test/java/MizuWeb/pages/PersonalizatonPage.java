package MizuWeb.pages;

import MizuWeb.utils.Driver;
import MizuWeb.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalizatonPage {
    public PersonalizatonPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "dynamicText0")
    public WebElement personalizationTextbox;
    @FindBy(className = "custom-image__img-container--placeholder")
    public WebElement uploadButton;
    @FindBy(className = "js-customize-confirmation-label")
    public WebElement confirmDesign;
    @FindBy(className = "js-user-menu-cart-quantity")
    public WebElement countOfCart;

    public void clickAddToCart(String buttonText) {
        By Button = By.xpath("//span[text()='" + buttonText + "']");
        Helpers.clickWithButtonText(Button).click();
    }

    public void writeText(String personalizationText) {
        personalizationTextbox.sendKeys(personalizationText);
    }

    public void uploadImage() {
        uploadButton.click();
        String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\cicek-sepeti-var-var.png";
        WebElement frame = Driver.get().switchTo().activeElement();
        frame.sendKeys(imagePath);
    }

    public void validateDesign() {
        confirmDesign.click();
    }

    public void verifyCart() {
        int cartCount = Integer.parseInt(countOfCart.getText());

        Assert.assertTrue(cartCount > 0);
    }
}