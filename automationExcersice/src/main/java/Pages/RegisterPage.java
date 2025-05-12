package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By newUserMessage = By.xpath("//h2[text()='New User Signup!']");
    private By nameInput = By.name("name");
    private By emailInput = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[text()='Signup']");

    private By enterAccountInfoHeader = By.xpath("//b[text()='Enter Account Information']");
    private By passwordInput = By.id("password");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");

    private By newsletter = By.id("newsletter");
    private By offers = By.id("optin");

    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");

    private By createAccountBtn = By.xpath("//button[text()='Create Account']");
    private By accountCreatedMsg = By.xpath("//b[text()='Account Created!']");
    private By continueBtn = By.xpath("//a[text()='Continue']");
    private By loggedInAs = By.xpath("//a[contains(text(),'Logged in as')]");
    private By deleteAccountBtn = By.xpath("//a[text()='Delete Account']");
    private By accountDeletedMsg = By.xpath("//b[text()='Account Deleted!']");

    public void fillSignupForm(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(signupBtn).click();
    }

    public void fillAccountInfo() {
        driver.findElement(passwordInput).sendKeys("Test@1234");
        driver.findElement(days).sendKeys("10");
        driver.findElement(months).sendKeys("May");
        driver.findElement(years).sendKeys("2000");

        driver.findElement(newsletter).click();
        driver.findElement(offers).click();

        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(company).sendKeys("Automation Co");
        driver.findElement(address1).sendKeys("123 Street");
        driver.findElement(address2).sendKeys("Apartment 4");
        driver.findElement(country).sendKeys("United States");
        driver.findElement(state).sendKeys("California");
        driver.findElement(city).sendKeys("LA");
        driver.findElement(zipcode).sendKeys("90001");
        driver.findElement(mobileNumber).sendKeys("1234567890");

        driver.findElement(createAccountBtn).click();
    }

    public boolean isAccountCreatedVisible() {
        return driver.findElement(accountCreatedMsg).isDisplayed();
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public boolean isLoggedIn() {
        return driver.findElement(loggedInAs).isDisplayed();
    }

    public void deleteAccount() {
        driver.findElement(deleteAccountBtn).click();
    }

    public boolean isAccountDeleted() {
        return driver.findElement(accountDeletedMsg).isDisplayed();
    }
}
