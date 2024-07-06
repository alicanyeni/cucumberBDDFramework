package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {

    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@onClick='addElement()']")
    public WebElement addButton;
    @FindBy(xpath = "//*[@class='added-manually']")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[@onClick='deleteElement()']")
    public List<WebElement> deleteList;
}
