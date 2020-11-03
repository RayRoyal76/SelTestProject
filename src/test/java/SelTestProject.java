import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelTestProject {

    FacebookHomePage facebookHomePage;
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rayvon/OneDrive/Documents/selenium/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        facebookHomePage = new FacebookHomePage(driver);

    }
    @Test
    void testLogin(){
        facebookHomePage.emailLogin();
    }
    @Test
    void testCreateAPage(){
        facebookHomePage.clickOnCreateAPage();
    }
    @AfterClass
    void teardown(){
        driver.close();
    }

}
