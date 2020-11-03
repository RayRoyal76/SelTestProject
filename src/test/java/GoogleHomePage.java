import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    // field that represents the search bar
      WebDriver driver;
    // objects
    // By searchBar = By.name("q");
    @FindBy(name = "q")
     WebElement searchBar;
    // By about = By.xpath("//div/div/a");
    @FindBy(xpath = "//div/div/a")
     WebElement about;

    // constructor with dependency injection
    public GoogleHomePage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    // action
    public void clickOnAbout(){
        about.click();
    }
    public void searchNinjaTurtles(){
        searchBar.sendKeys("Ninja Turtles", Keys.ENTER);

    }


}
