package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;

    //define my locators
    By adminModule = By.xpath("//span[text()='Admin']");
    By user_managment_Tab = By.xpath("//span[contains(text(),'User Management ')]");
    By users_choice = By.xpath("    //a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Users')]");
    //a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Users')]

    By addButton = By.xpath("    //a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Users')]");

/////

    //div[@class='oxd-select-text oxd-select-text--active']
    By UserRoleDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
    By UserRolechoice = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");


    By Employee_NameField = By.xpath("//input[@placeholder=\"Type for hints...\"]");

    By StatusField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
    By UsernameField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    By PasswardField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By ConfirmUsernameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    By saveButton = By.cssSelector("  button[type='submit']\n");


    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAdmin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.findElement(adminModule).click();
    }

    public void clickOnUsersTab() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement usermanagmenttab_Element = driver.findElement(user_managment_Tab);
        usermanagmenttab_Element.click();
        WebElement userschoice_Element = driver.findElement(users_choice);
        userschoice_Element.click();

    }




}