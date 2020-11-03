import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
    WebDriver driver;
    @FindBy(name = "email")
    WebElement emailOrPhoneNumberBar;
    @FindBy(xpath = "//div/div/a")
    WebElement createAPage;


    public FacebookHomePage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnCreateAPage(){
        createAPage.click();
    }
    public void emailLogin(){
        emailOrPhoneNumberBar.sendKeys("443551212", Keys.ENTER);
    }



}
