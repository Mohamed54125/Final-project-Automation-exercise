package selenuimtest.automationExcersice;


import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomePageTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomePageTitle() {
        String actualTitle = homePage.getPageTitle();
        Assert.assertEquals(actualTitle, "Automation Exercise");
    }

    @Test
    public void testClickSignupLogin() {
        homePage.clickSignupLogin();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/login"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
