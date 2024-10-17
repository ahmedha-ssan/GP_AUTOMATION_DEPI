package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RecruitmentPage {
    WebDriver driver;
    WebDriverWait wait;

    //define my locators
    By recruitmentModule = By.xpath("//span[text()='Recruitment']");
    By candidatesTab = By.xpath("//a[contains(text(),'Candidates')]");
    By addButton = By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]\n");
    By firstNameField = By.name("firstName");
    By middleNameField = By.name("middleName");
    By lastNameField = By.name("lastName");
    By jobVacancyDropdown = By.xpath("//div[contains(text(),'-- Select --')]");
    By emailField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");//
    By contactNumberField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    By resumeUploadField = By.xpath("//input[@type='file']");
    By keywordsField = By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"Enter comma seperated words...\"]");
    By noteField = By.xpath("//textarea[@placeholder=\"Type here\"]");
    By checkButton = By.xpath("//label[contains(text(),'Consent to keep data')]");
    By saveButton = By.xpath("//button[@type=\"submit\"]");

    // Constructor
    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

    // Navigate to Recruitment module
    public RecruitmentPage navigateToRecruitment() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(recruitmentModule)).click();
        return this;
    }

    // Navigate to Candidates tab
    public RecruitmentPage clickOnCandidatesTab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(candidatesTab)).click();
        return this;
    }

    // Click Add button
    public RecruitmentPage clickAddButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addButton)).click();
        return this;
    }

    // select a vacancy from the dropdown list
    public void selectVacancy(){
        // Click the dropdown to open the options
        WebElement dropDown = driver.findElement(jobVacancyDropdown);
        dropDown.click();

        // Wait for the dropdown options to become visible
        By vacancyOption = By.xpath("//span[contains(text(),\"Senior Support Specialist\")]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(vacancyOption));
        // Click on the specific vacancy option
        WebElement option = driver.findElement(vacancyOption);
        option.click();
    }
    // Method to enter the date of application
    public void enterDateOfApplication(String date) {
        WebElement dateField = driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
        dateField.sendKeys(Keys.CONTROL + "a");
        dateField.sendKeys(Keys.DELETE);
        dateField.sendKeys(date); // Ensure the format is "yyyy-mm-dd"
    }
    // use of the robot to upload the resume
    public RecruitmentPage uploadResumeWithRobot(String resumePath) {
        // Find the file upload button and click it to open the file chooser
        WebElement webElement = driver.findElement(resumeUploadField);
        webElement.click();

        // Use Robot to upload the file
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(2000);

            // Convert the file path to a char array
            StringSelection filePath = new StringSelection(resumePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

            // Press Control
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            //Press V button
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to confirm the upload
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
        return this;
    }


    // Fill Candidate Details
    public RecruitmentPage enterCandidateDetails(String firstName, String middleName, String lastName,
                                                 String jobVacancy, String email, String contactNumber,
                                                 String resumePath, String keywords, String applicationDate, String note) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        driver.findElement(middleNameField).sendKeys(middleName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(contactNumberField).sendKeys(contactNumber);
        //Can use Robot or path directly that will be the XPATH if we use robot //div[contains(text(),'No file selected')]
        //uploadResumeWithRobot(resumePath);
        selectVacancy();
        driver.findElement(resumeUploadField).sendKeys(resumePath);
        enterDateOfApplication(applicationDate);
        driver.findElement(keywordsField).sendKeys(keywords);
        driver.findElement(noteField).sendKeys(note);
        driver.findElement(checkButton).click();
        return this;
    }

    // Click Save button
    public RecruitmentPage clickSaveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).click();
        return this;
    }

}