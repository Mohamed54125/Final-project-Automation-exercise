package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailInput = By.xpath("//input[@data-qa='login-email']");
    private By passwordInput = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By loggedInAsUser = By.xpath("//a[contains(text(),'Logged in as')]");
    private By deleteAccountButton = By.xpath("//a[text()='Delete Account']");
    private By accountDeletedMessage = By.xpath("//b[text()='Account Deleted!']");
    private By continueButton = By.xpath("//a[text()='Continue']");

    private By loginErrorMessage = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");

    public void enterEmailAndPassword(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoggedInAsUserVisible() {
        return driver.findElement(loggedInAsUser).isDisplayed();
    }

    public void deleteAccount() {
        driver.findElement(deleteAccountButton).click();
    }

    public boolean isAccountDeletedMessageVisible() {
        return driver.findElement(accountDeletedMessage).isDisplayed();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public boolean isLoginErrorMessageVisible() {
        return driver.findElement(loginErrorMessage).isDisplayed();
    }
}
