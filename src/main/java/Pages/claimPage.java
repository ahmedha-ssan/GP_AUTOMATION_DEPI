package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class claimPage {
    WebDriver driver;
    WebDriverWait wait;

    //Define my locators
    By claimModule = By.xpath("//span[text()='Claim']");
    By myClaimTap = By.xpath("//a[text()='My Claims']");

    By viewDetailsButton = By.xpath("(//button[normalize-space()='View Details'])[3]\n");
//  //button[@class="oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space"]

    By addExpenseButton = By.xpath("//button[@data-v-6a9dd8d1 and @type=\"button\"]//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]");
    By expenseTypeDropdown = By.xpath("//div[text()= '-- Select --']");
    By optExpenseDropDown = By.xpath("//span[text()= 'Fuel Allowance']");

    By dateField = By.xpath("//input[@placeholder=\"yyyy-dd-mm\"]");
    By amountField = By.xpath("//div[contains(@class, 'oxd-input-group') and .//label[text()='Amount']]//input[contains(@class, 'oxd-input--active')]");

    By noteField = By.xpath("//div[contains(@class, 'oxd-input-group oxd-input-field-bottom-space') and .//div[@class='oxd-input-group__label-wrapper'] and .//label[text()='Note']]//textarea");
    By saveButton = By.xpath("//button[@type=\"submit\"]");

    By submitButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-sm-button\"]");

    // Constructor
    public claimPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    // Navigate to Claims module
    public claimPage navigateToClaims() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(claimModule)).click();
        return this;
    }

    // Click My Claims button
    public claimPage clickMyClaims() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myClaimTap)).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(109));
        return this;
    }

    // Click View Details button
    public claimPage clickViewDetails() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewDetailsButton)).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return this;
    }

    // Click Add Expense button
    public claimPage clickAddExpense() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addExpenseButton)).click();
        return this;
    }

    // select a vacancy from the dropdown list
    public void selectExpenseType(){
        // Click the dropdown to open the options
        WebElement dropDown = driver.findElement(expenseTypeDropdown);
        dropDown.click();

        // Wait for the dropdown options to become visible
        By expenseTypeOption = optExpenseDropDown;
        wait.until(ExpectedConditions.visibilityOfElementLocated(expenseTypeOption));
        // Click on the specific vacancy option
        WebElement option = driver.findElement(expenseTypeOption);
        option.click();
    }

    // Method to enter the date of application
    public void enterDateOfApplication(String date) {
        WebElement dateFieldElement = driver.findElement(dateField);
        dateFieldElement.sendKeys(Keys.CONTROL + "a");
        dateFieldElement.sendKeys(Keys.DELETE);
        dateFieldElement.sendKeys(date); // Ensure the format is "yyyy-mm-dd"
    }

    // Fill Expense details
    public claimPage fillExpenseDetails(String date, String amount, String note) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(expenseTypeDropdown));
        //dropdown.sendKeys(expenseType);
        //driver.findElement(dateField).sendKeys(date);
        selectExpenseType();
        enterDateOfApplication(date);
        driver.findElement(amountField).sendKeys(amount);
        if (note != null && !note.isEmpty()) {
            driver.findElement(noteField).sendKeys(note);
        }
        return this;
    }
    // Click Save button
    public claimPage clickSave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).click();
        return this;
    }

    // Click Submit button
    public claimPage clickSubmit() throws InterruptedException {
        //Thread.sleep(Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        } catch (ElementClickInterceptedException e) {
            // Retry after waiting for any overlay to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-dialog-container-default")));
            wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        }
        return this;
    }
}