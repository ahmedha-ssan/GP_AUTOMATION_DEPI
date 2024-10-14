package Login;
import Base.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.time.Duration;


public class LoginTests extends baseTest{
    By userName = By.name("username");

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"Admin", "admin123"},  // Valid credentials
//                {"InvalidUser", "admin123"},  // Invalid username
//                {"Admin", "wrongPassword"},  // Invalid password
//                {"", ""}  // Empty username and password
        };
    }

    @Test(dataProvider = "loginData")
    public void Login_TC1(String username, String password){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        loginPage.userNameField(username)
                .passwordField(password)
                .loginButton();
    }
    
}



//    //Locators
//    By AssertLogin= By.xpath("//div[contains(text(),\"You logged into a secure area!\")]");
//    By LogoutButton =By.xpath("//a[@class = \"button secondary radius\"]");
//    By AssertLogout =By.xpath("//div[contains(text(),\"You logged out of the secure area!\")]");
//    //Elements
//    WebElement AssertLoginElement = driver.findElement(AssertLogin);
//    WebElement AssertLogoutElement = driver.findElement(AssertLogout);
//    WebElement LogoutButtonElement = driver.findElement(LogoutButton);







//    @Test(dependsOnMethods = {"Login_TC1"})
//    public void AssertLoginPage_TC2() {
//        String actualMSG = AssertLoginElement.getText();
//        String expectedMSG = "You logged into a secure area!\n" +
//                "×";
//        //Hard assertion
//        Assert.assertEquals(expectedMSG,actualMSG,"U r not authorized to access this page");
//    }
//
//    @Test(dependsOnMethods = {"AssertLoginPage_TC2"})
//    public void Logout_TC3() {
//        WebElement logoutButton = LogoutButtonElement;
//        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button should be visible on the page.");
//        logoutButton.click();
//    }
//
//    @Test(dependsOnMethods = {"Logout_TC3"})
//    public void AssertLogout_TC4() {
//        String actualMSG = AssertLogoutElement.getText();
//        String expectedMSG = "You logged out of the secure area!\n" +
//                "×";
//        Assert.assertEquals(expectedMSG,actualMSG,"U r not authorized to access this page");
//    }