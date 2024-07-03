package stepDefinitaions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.security.Key;

public class BrcStepDefinition {
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @Then("Login yazisina tiklar")
    public void login_yazisina_tiklar() {
        brcPage.loginFirst.click();
    }

    @Then("Kullanici gecersiz username girer")
    public void kullanici_gecersiz_username_girer() {
        brcPage.username.sendKeys(ConfigReader.getProperty("wrongUserName"));
    }

    @Then("Kullanici gecersiz password girer")
    public void kullanici_gecersiz_password_girer() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPassword")).perform();
    }

    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("Kullanici giris yapamadigini test eder")
    public void kullanici_giris_yapamadigini_test_eder() {
        Assert.assertTrue(brcPage.loginControl.isDisplayed());
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }
}
