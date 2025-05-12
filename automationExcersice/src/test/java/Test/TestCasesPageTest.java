package Test;

import Pages.HomePage;
import Pages.TestCasesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestCasesPageTest {

    WebDriver driver;
    HomePage homePage;
    TestCasesPage testCasesPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();  
        driver.get("http://automationexercise.com"); 

        homePage = new HomePage(driver);
        testCasesPage = new TestCasesPage(driver);
    }

    @Test
    public void testTestCasesPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

        Assert.assertTrue(homePage.isHomePageVisible()); 

        homePage.clickTestCasesButton(); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(testCasesPage.getTestCasesHeader()));  
        Assert.assertTrue(testCasesPage.isTestCasesPageVisible()); 
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();  
        }
    }
}
