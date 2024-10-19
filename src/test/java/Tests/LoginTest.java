package Tests;
import Base.baseTest;
import Data.TestData;
import org.testng.annotations.Test;


public class LoginTest extends baseTest {
    @Test
    public void testLogout() {
        // Perform logout
        loginPage.clickDropdown();
        loginPage.logout();
    }
    @Test (dependsOnMethods = {"testLogout"},dataProvider = "ResetPasswordData", dataProviderClass = TestData.class)
    public void ForgotPassword_TC2(String username) {
        loginPage.clickForgotPassword();
        loginPage.usernameforgetfield(username);
        loginPage.resetPassword();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset";
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.contains(expectedUrl) : "Logout failed";
    }
}


