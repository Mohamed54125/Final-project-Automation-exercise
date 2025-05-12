package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;

public class LoginUserTest extends TestBase {

    @Test(priority = 2)
    public void loginUserSuccessfully() throws InterruptedException {
        HomePage home = new HomePage(driver);
        RegisterPage register = new RegisterPage(driver);
        LoginPage login = new LoginPage(driver);

        Assert.assertEquals(home.getHomeBtnText(), "Home");

        home.openRegisterationPage();
        Assert.assertTrue(driver.getPageSource().contains("New User Signup!"));

        String name = "Test User";
        String email = "mondy123@gmail.com";
        String password = "Test@1234";

        register.fillSignupForm(name, email);

        if (driver.getPageSource().contains("Email Address already exist!")) {
            System.out.println("⚠️ الإيميل مستخدم بالفعل، جاري تسجيل الدخول...");
            home.openRegisterationPage();
            login.enterEmailAndPassword(email, password);
            login.clickLoginButton();
        } else {
            register.fillAccountInfo();
            Assert.assertTrue(register.isAccountCreatedVisible());
            register.clickContinue();
        }

        Assert.assertTrue(login.isLoggedInAsUserVisible());

        login.deleteAccount();
        Assert.assertTrue(login.isAccountDeletedMessageVisible());
        login.clickContinue();
    }
}
