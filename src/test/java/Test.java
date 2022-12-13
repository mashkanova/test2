import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test {
    private WebDriver driver;
    private MainPage mainPage;
    private AddPage addPage;
    private BagPage bagPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @org.testng.annotations.Test
    public void AccessoriesInfoTest() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        addPage = mainPage.addIphone();


        addPage.addToBag();

        bagPage = addPage.reviewBag();
        Assert.assertTrue(true);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        driver = null;
    }
}
