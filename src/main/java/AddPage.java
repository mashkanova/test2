import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@class='product-submit']")
    private WebElement addToBagButton;
    @FindBy(xpath = "//a[@title='Shopping cart']")
    private WebElement reviewBagButton;


    public AddPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void addToBag() throws InterruptedException {
        addToBagButton.click();
        Thread.sleep(2000);
    }

    public BagPage reviewBag(){
        reviewBagButton.click();
        return new BagPage(driver);
    }
}
