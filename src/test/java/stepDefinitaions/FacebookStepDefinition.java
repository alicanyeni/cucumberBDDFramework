package stepDefinitaions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepDefinition {


    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String expectedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(expectedUrl));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer waitTime) {
        ReusableMethods.waitFor(waitTime);
    }

    @When("Url in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String actualWord) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(actualWord));
    }

    @When("User closed page")
    public void user_closed_page() {
        Driver.quitDriver();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananURL) {
        Driver.getDriver().get(ConfigReader.getProperty(arananURL));
    }

    @When("Url in {string} oldugunu test eder")
    public void urlInOldugunuTestEder(String istenenURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenURL));
    }
}
