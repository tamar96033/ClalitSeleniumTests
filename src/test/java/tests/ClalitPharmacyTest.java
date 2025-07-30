package tests;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.ServicesLocatorPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClalitPharmacyTest {

    private WebDriver webDriver;
    private HomePage homePage;
    private ServicesLocatorPage servicesLocatorPage;

    @BeforeAll
    public void setup(){
            webDriver = new EdgeDriver();
            webDriver.manage().window().maximize();
            webDriver.get("https://www.clalit.co.il/he/Pages/default.aspx");
            homePage = new HomePage(webDriver);
            servicesLocatorPage = new ServicesLocatorPage(webDriver);
    }

    @Test
    public void stageOne(){
        homePage.touchServiceLocator();
        servicesLocatorPage.clickPharmacyTab();
        servicesLocatorPage.checkOpenNow();
        servicesLocatorPage.clickSearchButton();
        Assert.assertTrue(servicesLocatorPage.isPharmacyNow());

        homePage.openTopSearch();
        homePage.searchFor("בתי מרקחת");
        homePage.clickSearchButton();
        Assert.assertTrue(homePage.searchResultsExist());

        webDriver.quit();
    }
}
