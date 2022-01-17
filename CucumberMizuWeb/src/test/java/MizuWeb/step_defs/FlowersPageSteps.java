package MizuWeb.step_defs;

import MizuWeb.pages.FlowerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FlowersPageSteps {
    FlowerPage flowerPage = new FlowerPage();

    @And("I sorted it from {string} on menu pages")
    public void iSortedItFromOnMenuPages(String priceCriteria) {
        flowerPage.sortWith(priceCriteria);
    }

    @Then("I should see prices sorted from high to low")
    public void iShouldSeePricesSortedFromHighToLow() {
        flowerPage.validateSorting();
    }
}
