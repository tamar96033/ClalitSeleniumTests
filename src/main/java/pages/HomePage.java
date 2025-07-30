package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By locatingServiceLocator = By.id("ClalitNewMaster_QuickLinksUC_rptQuickLinks_ctl04_nav_item_link");
    private By searchIcon = By.xpath("//a[contains(@class, 'btn-search')]");
    private By inputSearch = By.id("ClalitNewMaster_ClalitSearchBoxUC_mainSearchField");
    private By searchButton = By.id("searchButton");
    private By inputSearchByIcon = By.id("search_results_list");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void touchServiceLocator(){
        click(locatingServiceLocator);
    }

    public void openTopSearch(){
        click(searchIcon);
    }

    public void searchFor(String text){
        type(inputSearch, text);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public boolean searchResultsExist(){
        try{
            getText(inputSearch);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
