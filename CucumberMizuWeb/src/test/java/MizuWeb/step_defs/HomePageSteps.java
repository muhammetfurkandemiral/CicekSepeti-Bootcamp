package MizuWeb.step_defs;

import MizuWeb.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @And("I close address focus on home page")
    public void iCloseAddressFocusOnHomePage() {
        homePage.closeAddressFocus();
    }

    @Then("I should see {string} on home page")
    public void iShouldSeeOnHomePage(String arg0) {
        homePage.verifyText(arg0);
    }
}