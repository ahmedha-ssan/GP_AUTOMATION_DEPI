package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    //init my web driver
    WebDriver driver;

    //define my locators
    By userName = By.name("username");
    By Password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    //constructor to int the driver
    public LoginPage(WebDriver drive) {
        this.driver = drive;
    }

    public void userNameField(String username) {
        WebElement userNameElement = driver.findElement(userName);
        userNameElement.clear();
        userNameElement.sendKeys(username);
    }

    public void passwordField(String password) {
        WebElement passwordElement = driver.findElement(Password);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void loginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }
}
