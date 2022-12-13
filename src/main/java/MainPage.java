import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://www.carhartt-wip.com/en";
    WebDriver driver;

    @FindBy(xpath = "//article[@class='standard-promo-item']")
    private WebElement buyButton;
    @FindBy(xpath = "//article[@productid='I026177_89_XX']")
    private WebElement jacketButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public AddPage addIphone(){
        buyButton.click();
        jacketButton.click();
        return new AddPage(driver);


    }
}
