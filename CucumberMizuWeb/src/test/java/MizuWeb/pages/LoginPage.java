package MizuWeb.pages;

import MizuWeb.utils.ConfReader;
import MizuWeb.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "js-policy-close")
    public WebElement cookieCloseButton;
    @FindBy(id = "EmailLogin")
    public WebElement emailField;
    @FindBy(id = "Password")
    public WebElement passwordField;
    @FindBy(className = "login__btn")
    public WebElement loginButton;

    public void navigateToLoginPage(String arg0) {
        Driver.get().get(ConfReader.get("baseURI") + arg0);
    }

    public void closeCookie() {
        cookieCloseButton.click();
    }

    public void loginWithData(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

        loginButton.click();
    }
}