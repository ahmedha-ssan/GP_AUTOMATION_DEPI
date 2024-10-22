package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuzzPage {


    WebDriver driver;
    WebDriverWait wait;

    //define my locators
    By buzzModule=By.xpath("//span[text()='Buzz']");
    By captionpost=By.xpath("    //div[@class=\"oxd-buzz-post oxd-buzz-post--active\"]//textarea[@class=\"oxd-buzz-post-input\"]");
    By postButton=By.xpath("//button[@type=\"submit\"]");
    By todeleteButton=By.xpath(" (//li[@class='']//button[@class=\"oxd-icon-button\"])[1]");
    By delete=By.xpath("(//li[@class=\"orangehrm-buzz-post-header-config-item\"])[1] ");
    By yesDelete=By.xpath("    //button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]\n ");
    By successMSG=By.xpath("//div[@id='oxd-toaster_1']/div/div");

    // Constructor
    public BuzzPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToBuzz() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.findElement(buzzModule).click();
    }


    public void addCaptionPost(String caption) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addCaptionElement = driver.findElement(captionpost);
        addCaptionElement.clear(); // Clear any existing text if needed
        addCaptionElement.sendKeys(caption);
    }
    public void clickpost() {
        WebElement addButtonElement = driver.findElement(postButton);
        addButtonElement.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    public void todelete() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(200));

        WebElement todeleteElement = driver.findElement(todeleteButton);
        todeleteElement.click();
    }

    public void clickdelete() {
        WebElement deleteElement = driver.findElement(delete);
        deleteElement.click();
    }

    public void clickyesdelete() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement yesdeleteElement = driver.findElement(yesDelete);
        yesdeleteElement.click();
    }

    public String isSuccessMessageDisplayed() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement msg = driver.findElement(successMSG);
        return msg.getText();
    }



}
