package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;

    //define my locators
    By adminModule = By.xpath("//span[text()='Admin']");
    By user_managment_Tab = By.xpath("//span[contains(text(),'User Management ')]");
    // By user_DropDown = By.xpath("//a[contains(text(),'Candidates')]");

    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

/////

    //div[@class='oxd-select-text oxd-select-text--active']
    By UserRoleField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
    By Employee_NameField = By.xpath("//input[@placeholder=\"Type for hints...\"]");

    By StatusField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
    By UsernameField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    By PasswardField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By ConfirmUsernameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    By saveButton = By.cssSelector("  button[type='submit']\n");


    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    // Navigate to Users module
    public AdminPage navigateToAdmin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(adminModule)).click();
        return this;
    }
    // Navigate to Candidates tab
    public AdminPage clickOnUsesrsTab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(user_managment_Tab)).click();
        return this;
    }

    public AdminPage clickAddButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addButton)).click();
        return this;
    }


    public AdminPage enterUsersDetails(String User_Role, String Employee_Name, String Status,
                                       String Username, String Password, String ConfirmPassword)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        //wait.until(ExpectedConditions.visibilityOfElementLocated(UserRoleField)).sendKeys(User_Role);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Employee_NameField)).sendKeys(Employee_Name);

        driver.findElement(UserRoleField).sendKeys(User_Role);
        driver.findElement(Employee_NameField).sendKeys(Employee_Name);
        driver.findElement(StatusField).sendKeys(Status);
        driver.findElement(UsernameField).sendKeys(Username);
//        wait.until(ExpectedConditions.elementToBeClickable(jobVacancyDropdown)).click();
//        By jobVacancyOption = By.xpath("//div[contains(text(),'Senior QA Lead')]"); // Ensure this matches your expected option
//        wait.until(ExpectedConditions.visibilityOfElementLocated(jobVacancyOption)).click();

        driver.findElement(PasswardField).sendKeys(Password);
        driver.findElement(ConfirmUsernameField).sendKeys(ConfirmPassword);


        //use Robot class with Keypress and keyrelease
//
//        WebElement webElement= driver.findElement(resumeUploadField);
//
//        webElement.sendKeys(resumePath);







//        WebElement date = driver.findElement(dateOfApplicationField);
//        date.clear();
        //date.sendKeys(applicationDate);
        return this;
    }
    public AdminPage clickSaveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).click();
        return this;
    }
}
