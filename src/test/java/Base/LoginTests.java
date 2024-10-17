package Base;
import Data.loginData;
import Pages.AdminPage;
import Pages.RecruitmentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTests extends baseTest{
    By userName = By.name("username");
    RecruitmentPage recruitmentPage;
    AdminPage adminPage;

//
//    @Test(priority = 0)
//    public void Login_TC1(){
//        String username = loginData.USERNAME;
//        String password = loginData.PASSWORD;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
//        loginPage.userNameField(username)
//                .passwordField(password)
//                .loginButton();
//    }

    @Test(priority = 1, description = "Verify adding a new candidate with valid data")
    public void addCandidate_TC1() throws InterruptedException {
        recruitmentPage = new RecruitmentPage(driver);

        // Test data
        String firstName = "Ahmed";
        String middleName = "Abdelhamid";
        String lastName = "Hassan";
        String jobVacancy = "Automation Engineer";
        String email = "Ahmed@g.com";
        String contactNumber = "01128793499";
        String resumePath = "C:\\Users\\ammod\\Downloads\\YAT235.pdf"; // Replace with the actual path
        String keywords = "|";
        String applicationDate = "2024-10-10";
        String note = "I'm the best person for that vacancy";

        // Test steps
        recruitmentPage.navigateToRecruitment()
                .clickOnCandidatesTab()
                .clickAddButton()
                .enterCandidateDetails(firstName, middleName, lastName, jobVacancy, email, contactNumber,
                        resumePath, keywords, applicationDate, note)
                .clickSaveButton();
    }

//    @Test(priority = 2, description = "Verify adding a new user with valid data")
//    public void addUser_TC1() {
//        adminPage = new AdminPage(driver);
//
//        // Test data
//        String User_Role = "ESS";
//        String Employee_Name = "Ram Nandha Doe";
//        String Status = "Enabled";
//        String Username = "Hanan";
//        String Password = "Hanan@Hanan123";
//        String ConfirmPassword = "Hanan@Hanan123"; // Replace with the actual path
//
//        // Test steps
//        adminPage.navigateToAdmin()
//                .clickOnUsesrsTab()
//                .clickAddButton()
//                .enterUsersDetails(User_Role, Employee_Name, Status, Username, Password, ConfirmPassword)
//                .clickSaveButton();
//
//        // Assertion
//        // Assert.assertTrue(recruitmentPage.isCandidateAddedSuccessfully(), "The candidate was not added successfully.");
//    }


}


