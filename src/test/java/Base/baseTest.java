package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class baseTest {
    protected WebDriverWait wait;
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
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

