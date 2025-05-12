package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasesPage {

    WebDriver driver;

    private By testCasesHeader = By.xpath("//h2[text()='Test Cases']"); 

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTestCasesPageVisible() {
        WebElement header = driver.findElement(testCasesHeader);
        return header.isDisplayed();  
    }

    public By getTestCasesHeader() {
        return testCasesHeader;
    }
}
