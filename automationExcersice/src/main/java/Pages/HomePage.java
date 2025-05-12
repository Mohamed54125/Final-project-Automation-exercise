package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    private By homeBtn = By.xpath("//a[contains(text(),'Home')]");
    private By loginButton = By.xpath("//a[text()='Login']");
    private By contactUsButton = By.xpath("//a[text()='Contact Us']");

    public By homePageHeader = By.xpath("//h1[text()='Welcome to our store']"); 
    private By testCasesButton = By.linkText("Test Cases");

    

    public void clickTestCasesButton() {
        driver.findElement(testCasesButton).click();
    }

    public void openRegisterationPage() {
        driver.findElement(signupLoginBtn).click();
    }

    public String getHomeBtnText() {
        return driver.findElement(homeBtn).getText();
    }

    public void logout() {
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }

    public void clickContactUs() {
        driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
    }

    public void openLoginPage() {
        driver.findElement(loginButton).click();
    }

    public void clickContactUsButton() {
        driver.findElement(contactUsButton).click();
    }

    public boolean isHomePageVisible() {
        return driver.findElement(homePageHeader).isDisplayed();
    }

    private By getInTouch = By.xpath("//h2[contains(text(), 'GET IN TOUCH')]");
    public boolean isGetInTouchVisible() {
        return driver.findElement(getInTouch).isDisplayed();
    }
}
