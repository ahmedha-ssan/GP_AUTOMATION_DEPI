import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class webDriver {
    public static void main(String[] args) {
        //Create web driver
        WebDriver driver = new ChromeDriver();

        //navigate to swag labs web site
        driver.navigate().to("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("app_logo"))));
//
//        FluentWait fluentWait = new FluentWait(driver);
//        fluentWait.withTimeout(Duration.ofSeconds(10));
//        fluentWait.pollingEvery(Duration.ofSeconds(10));
//        fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("title"))));
//
//        driver.findElement(By.xpath("//div[contains(text(),\"Swag Labs\")]"));
    }
}
