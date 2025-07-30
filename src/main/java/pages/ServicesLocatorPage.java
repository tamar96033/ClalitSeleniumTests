package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesLocatorPage extends BasePage{

    private By pharmaciesTab = By.id("pharmacies");
    private By checkboxOpenNow = By.id("checkbox10");
    private By searchButton = By.className("btn btn-lg btn-success btn-text-icon sefersherut-search-btn");
    private By listPharmacies = By.id("search_results_list");

    public ServicesLocatorPage(WebDriver driver) {
        super(driver);
    }

    public void clickPharmacyTab(){
        click(pharmaciesTab);
    }

    public void checkOpenNow(){
        click(checkboxOpenNow);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public boolean isPharmacyNow(){
        try {
            getText(listPharmacies);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
