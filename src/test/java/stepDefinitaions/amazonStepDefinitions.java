package stepDefinitaions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {
    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @When("user searches for iphone")
    public void user_searches_for_iphone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user tests results include iphone")
    public void user_tests_results_include_iphone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
