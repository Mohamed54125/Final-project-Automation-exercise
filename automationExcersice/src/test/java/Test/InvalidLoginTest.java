package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

public class InvalidLoginTest extends TestBase {

    @Test(priority = 3)
    public void loginWithInvalidCredentials() throws InterruptedException {
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);

        Assert.assertEquals(home.getHomeBtnText(), "Home");

        home.openRegisterationPage();

        Assert.assertTrue(driver.getPageSource().contains("Login to your account"));

        String invalidEmail = "wrongemail@example.com";
        String invalidPassword = "WrongPassword123";
        login.enterEmailAndPassword(invalidEmail, invalidPassword);

        login.clickLoginButton();

        Assert.assertTrue(driver.getPageSource().contains("Your email or password is incorrect!"));
    }
}
