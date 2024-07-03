package stepDefinitaions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
        amazonPage.ignoreCookie.click();
    }

    @When("user searches for iphone")
    public void user_searches_for_iphone() {
        amazonPage.searchBar.sendKeys("iphone", Keys.ENTER);
    }

    @Then("user tests results include iphone")
    public void user_tests_results_include_iphone() {
        Assert.assertTrue(amazonPage.resultText.getText().contains("iphone"));
    }

    @Then("user closed page")
    public void userClosedPage() {
        Driver.quitDriver();
    }

    @When("user searches for selenium")
    public void userSearchesForSelenium() {
        amazonPage.searchBar.sendKeys("selenium", Keys.ENTER);
    }

    @Then("user tests results include selenium")
    public void userTestsResultsIncludeSelenium() {
        Assert.assertTrue(amazonPage.resultText.getText().contains("selenium"));
    }

    @When("user searches for java")
    public void userSearchesForJava() {
        amazonPage.searchBar.sendKeys("java", Keys.ENTER);
    }

    @Then("user tests results include java")
    public void userTestsResultsIncludeJava() {
        Assert.assertTrue(amazonPage.resultText.getText().contains("java"));
    }

    @When("user searches for {string}")
    public void userSearchesFor(String searchValue) {
        amazonPage.searchBar.sendKeys(searchValue, Keys.ENTER);
    }

    @Then("user tests results include {string}")
    public void userTestsResultsInclude(String resultValue) {
        Assert.assertTrue(amazonPage.resultText.getText().contains(resultValue));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.searchBar.sendKeys(arananKelime, Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini kontrol eder")
    public void sonuclarinIcerdiginiKontrolEder(String dogrulananKelime) {
        Assert.assertTrue(amazonPage.resultText.getText().contains(dogrulananKelime));
    }
}
