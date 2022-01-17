package MizuWeb.step_defs;

import MizuWeb.pages.PersonalizatonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalizationPageSteps {
    PersonalizatonPage personalizatonPage = new PersonalizatonPage();

    @When("I click {string} button")
    public void iClickButton(String buttonText) {
        personalizatonPage.clickAddToCart(buttonText);
    }

    @And("I write {string} on text box")
    public void iWriteOnTextbox(String pText) {
        personalizatonPage.writeText(pText);
    }

    @And("I upload any images to my computer")
    public void iUploadAnyImagesToMyComputer() {
        personalizatonPage.uploadImage();
    }

    @And("I confirm design")
    public void iValidateText() {
        personalizatonPage.validateDesign();
    }

    @Then("I should see the number of products in the basket as 1")
    public void iShouldSeeTheNumberOfProductsInTheBasketAs() {
        personalizatonPage.verifyCart();
    }
}