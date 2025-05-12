package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegisterPage;

public class RegisterUserTest extends TestBase {

    @Test(priority = 1)
    public void registerUserSuccessfully() throws InterruptedException {
        HomePage home = new HomePage(driver);
        RegisterPage register = new RegisterPage(driver);

        Assert.assertEquals(home.getHomeBtnText(), "Home");

        home.openRegisterationPage();
        Thread.sleep(1000); 

        Assert.assertTrue(driver.getPageSource().contains("New User Signup!"));

        String uniqueEmail = "mondy" + System.currentTimeMillis() + "@gmail.com";
        register.fillSignupForm("Mondy Tester", uniqueEmail);

        Assert.assertTrue(driver.getPageSource().contains("Enter Account Information"));

        register.fillAccountInfo();

        Assert.assertTrue(register.isAccountCreatedVisible());

        register.clickContinue();

        Assert.assertTrue(register.isLoggedIn());

        register.deleteAccount();

        Assert.assertTrue(register.isAccountDeleted());

        register.clickContinue();
    }
}
