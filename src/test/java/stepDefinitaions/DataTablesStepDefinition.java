package stepDefinitaions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatabasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinition {
    DatabasePage databasePage = new DatabasePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("Kullanici {string} linkine gider")
    public void kullaniciLinkineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici new butonuna tiklar")
    public void kullaniciNewButonunaTiklar() {
        databasePage.newButton.click();
    }

    @And("Kullanici Name bolumune {string} girer")
    public void kullaniciNameBolumuneGirer(String name) {
        databasePage.firstName.sendKeys(name, Keys.TAB);
    }

    @And("Kullanici LastName bolumune {string} girer")
    public void kullaniciLastNameBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB).sendKeys(lastName).perform();
    }

    @And("Kullanici position bolumune {string} yazar")
    public void kullaniciPositionBolumuneYazar(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("Kullanici office bolumune {string} yazar")
    public void kullaniciOfficeBolumuneYazar(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("Kullanici extension bolumune {string} yazar")
    public void kullaniciExtensionBolumuneYazar(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("Kullanici startDate bolumune {string} yazar")
    public void kullaniciStartDateBolumuneYazar(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("Kullanici salary bolumune {string} yazar")
    public void kullaniciSalaryBolumuneYazar(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Kullanici create butonuna tiklar")
    public void kullaniciCreateButonunaTiklar() {
        databasePage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String name) {
        databasePage.searchInput.sendKeys(name);
    }

    @And("Name alanında {string} oldugunu kontrol eder")
    public void nameAlanındaOldugunuKontrolEder(String name) {
        Assert.assertTrue(databasePage.createControl.getText().contains(name));
    }
}
