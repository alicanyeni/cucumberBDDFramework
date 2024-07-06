package stepDefinitaions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinition {
    HerokuappPage herokuappPage = new HerokuappPage();

    @And("Add Element butonuna tiklar")
    public void addElementButonunaTiklar() {
        herokuappPage.addButton.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButton, 3);
    }

    @And("Delete butonununu gorunur oldugunu test eder")
    public void deleteButonununuGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }

    @Then("Delete butonuna tiklar")
    public void deleteButonunaTiklar() {
        herokuappPage.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertTrue(herokuappPage.deleteList.isEmpty());
    }
}
