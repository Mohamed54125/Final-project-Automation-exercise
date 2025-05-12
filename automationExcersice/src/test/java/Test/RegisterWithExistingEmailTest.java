package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.RegisterPage;

public class RegisterWithExistingEmailTest extends TestBase {

    @Test(priority = 4)
    public void registerWithExistingEmail() {
        HomePage home = new HomePage(driver);
        RegisterPage register = new RegisterPage(driver);

        Assert.assertEquals(home.getHomeBtnText(), "Home");

        home.openRegisterationPage();

        Assert.assertTrue(driver.getPageSource().contains("New User Signup!"));

        String name = "Test User";
        String existingEmail = "mondy123@gmail.com"; 
        register.fillSignupForm(name, existingEmail);


        Assert.assertTrue(driver.getPageSource().contains("Email Address already exist!"));
    }
}
