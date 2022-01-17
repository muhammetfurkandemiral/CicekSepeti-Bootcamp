package MizuWeb.pages;

import MizuWeb.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "js-subheader-close")
    public WebElement addressFocusCloseButton;
    @FindBy(xpath = "(//span[@class='user-menu__title'])[3]")
    public WebElement accountText;

    public void closeAddressFocus() {
        addressFocusCloseButton.click();
    }

    public void verifyText(String arg0) {
        String expected = arg0.toLowerCase();
        String actual = accountText.getText().toLowerCase();

        assertEquals(expected, actual);
    }
}