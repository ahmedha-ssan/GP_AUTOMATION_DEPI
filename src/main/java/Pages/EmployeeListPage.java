package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeeListPage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators
    ////button[@class="oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin"]
    By pimMenu = By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]"); // Navigate to PIM
    By employmentid = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active']");
    By searchButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\" ]");
    By editButton = By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[1]");
    //By MaritalStatus = By.xpath("(//div[contains(text(),'-- Select --')])[2]");
    By username=By.xpath("//input[@name=\"firstName\"]");
    By Lastname=By.xpath("//input[@name=\"lastName\"]");
    By SaveButton=By.xpath("(//button[@type=\"submit\"])[1]");
    By successMSG = By.xpath("//div[@id='oxd-toaster_1']/div/div");

    // Constructor to initialize WebDriver
    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to navigate to the PIM section
    public void navigateToPIM() {
        driver.findElement(pimMenu).click();
    }

    // Method to select Employment Status from the dropdown
    public void selectemploymentid(String status) {
        driver.findElement(employmentid).sendKeys(status);
    }

    // Method to click the search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    // Method to choose the first employee
    public void selecteditButton() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.findElement(editButton).click();
    }
    public void usernamefeild(String usernamee) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.findElement(username).sendKeys(usernamee);
    }
    public void lastnamefeild(String lastnamee) {
        driver.findElement(Lastname).sendKeys(lastnamee);
    }
    public void SaveButtonn() {
        driver.findElement(SaveButton).click();
    }
    public String isSuccessMessageDisplayed() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement msg = driver.findElement(successMSG);
        return msg.getText();
    }
}
