package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By locatingServiceLocator = By.id("ClalitNewMaster_QuickLinksUC_rptQuickLinks_ctl04_nav_item_link");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void touchServiceLocator(){
    click(locatingServiceLocator);
    }
}
