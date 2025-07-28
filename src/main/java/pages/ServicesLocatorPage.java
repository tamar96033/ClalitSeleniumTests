package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesLocatorPage extends BasePage{

    private By pharmaciesTab = By.id("pharmacies");
    private By checkboxOpenNow = By.id("checkbox10");

    public ServicesLocatorPage(WebDriver driver) {
        super(driver);
    }

    public void clickPharmacyTab(){
        click(pharmaciesTab);
    }

    public void checkOpenNow(){
        click(checkboxOpenNow);
    }
}
