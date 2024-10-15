package Pages.Recruitment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class RecruitmentLocators {
    WebDriver driver;
    //define my locators
    By recruitmentModule = By.xpath("//span[text()='Recruitment']");
    By candidatesTab = By.xpath("//a[contains(text(),'Candidates')]");
    By addButton = By.xpath(" //i[@class=\"oxd-icon bi-plus oxd-button-icon\"]\n");
    By firstNameField = By.name("firstName");
    By middleNameField = By.name("middleName");
    By lastNameField = By.name("lastName");
    By jobVacancyDropdown = By.xpath("//div[contains(text(),'-- Select --')]");
    By emailField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");////div[@data-v-957b4417]/input[@class='oxd-input oxd-input--active' and @placeholder='Type here']
    By contactNumberField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    By resumeUploadField = By.xpath("//div[contains(text(),'No file selected')]");
    By keywordsField = By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"Enter comma seperated words...\"]");
    By dateOfApplicationField = By.xpath("//input[@placeholder=\"yyyy-dd-mm\"]");
    By noteField = By.xpath("//textarea[@placeholder=\"Type here\"]");
    By checkButton = By.xpath("    //label[contains(text(),'Consent to keep data')]");
    By saveButton = By.xpath("//button[@type=\"submit\"]");

}
