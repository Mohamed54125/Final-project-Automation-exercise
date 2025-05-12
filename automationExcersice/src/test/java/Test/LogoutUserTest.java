package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;

public class LogoutUserTest extends TestBase {

    @Test(priority = 3)
    public void logoutUserSuccessfully() {
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);

        Assert.assertEquals(home.getHomeBtnText(), "Home");

        home.openRegisterationPage();

        Assert.assertTrue(driver.getPageSource().contains("Login to your account"));

        String email = "mondy123@gmail.com";
        String password = "Test@1234";
        login.enterEmailAndPassword(email, password);

        login.clickLoginButton();

        Assert.assertTrue(login.isLoggedInAsUserVisible());

        home.logout();

        Assert.assertTrue(driver.getPageSource().contains("Login to your account"));
    }
}
