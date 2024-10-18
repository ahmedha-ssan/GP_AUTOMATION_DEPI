package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    By expandCollapseWidget = By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']");
    By PIMContent = By.xpath("//span[text()='PIM']"); // Update the selector as per your HTML

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashboardHeader() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        return driver.findElement(dashboardHeader).getText();
    }
    public void clickExpandCollapseWidget() {
        driver.findElement(expandCollapseWidget).click();
    }

    public boolean isWidgetExpanded() {
        driver.findElement(expandCollapseWidget).click();
        // Check if the widget content is visible
        WebElement content = driver.findElement(PIMContent);
        return content.getText().equals("PIM");
    }
}
