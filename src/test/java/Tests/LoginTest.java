package Tests;
import Base.baseTest;
import Data.TestData;
import Pages.AdminPage;
import Pages.RecruitmentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginTest extends baseTest {

    @Test(description = "login with valid test data",dataProvider = "LoginTestData", dataProviderClass = TestData.class)
    public void Login_TC1(String username, String password){
        loginPage.userNameField(username);
        loginPage.passwordField(password);
        loginPage.loginButton();
    }
}


