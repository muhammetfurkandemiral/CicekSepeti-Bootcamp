package MizuWeb.step_defs;

import MizuWeb.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        loginPage.navigateToLoginPage(arg0);
    }

    @When("I close the cookies notification")
    public void iCloseTheCookiesNotification() {
        loginPage.closeCookie();
    }

    @And("I logged with the following data:")
    public void iLoggedWithTheFollowingData(DataTable dt) {
        List<Map<String, String>> rows = dt.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            loginPage.loginWithData(columns.get("email"), columns.get("password"));
        }
    }
}