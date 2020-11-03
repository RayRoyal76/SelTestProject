import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SelTest {

    WebDriver driver;
    GoogleHomePage googleHomePage;

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rayvon/OneDrive/Documents/selenium/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        googleHomePage = new GoogleHomePage (driver);

    }
    @Test
    void testSearch() {
       googleHomePage.searchNinjaTurtles();
    }
    @Test
    void testAbout(){
    // driver.findElement(googleHomePage.about).click();
    googleHomePage.clickOnAbout();

    }
    @AfterClass
    void tearDown(){
        driver.close();
    }

}
