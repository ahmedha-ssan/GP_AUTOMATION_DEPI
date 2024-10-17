package Base;

import Data.loginData;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.ITestResult;

import java.time.Duration;

public class baseTest {
    protected WebDriverWait wait;
    protected WebDriver driver;
    protected LoginPage loginPage;
    By userName = By.name("username");

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        String username = loginData.USERNAME;
        String password = loginData.PASSWORD;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        loginPage.userNameField(username)
                .passwordField(password)
                .loginButton();
        }


//
//    @AfterMethod
//    public void screenShot(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                Utils utils = new Utils();
//                utils.takeScreenshot(driver);
//            } catch (Exception exception) {
//                System.out.println(exception.toString());
//            }
//        }
//    }


//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}

