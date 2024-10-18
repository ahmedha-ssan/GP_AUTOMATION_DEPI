package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.AdminPage;
import Pages.RecruitmentPage;
import org.testng.annotations.Test;

public class AdminTest extends baseTest {

    @Test(description = "Verify adding a new user with valid data", dataProvider = "adminTestData", dataProviderClass = TestData.class)
    public void adduser_TC1(String Employee_Name, String Username, String Password, String confirmPassword){
        adminPage = new AdminPage(driver);
        adminPage.navigateToAdmin();
        adminPage.clickOnUsersTab();
//        adminpage.clickAddButton();
//        recruitmentPage.enterFirstName(firstName);
//        recruitmentPage.enterMiddleName(middleName);
//        recruitmentPage.enterLastName(lastName);
//        recruitmentPage.selectVacancy();
//        recruitmentPage.enterEmail(email);
//        recruitmentPage.enterContactNumber(contactNumber);
//        // recruitmentPage.enterResumeFile(resumeFilePath);
//        recruitmentPage.enterKeywords(keywords);
//        recruitmentPage.enterDateOfApplication(applicationDate);
//        recruitmentPage.enterNote(note);
//        recruitmentPage.enterCheckButton();
//        recruitmentPage.clickSaveButton();

        // Assert the existence of the success message after adding a new candidate
//        String actualMSG = recruitmentPage.isSuccessMessageDisplayed();
//        String expectedMSG = "Success\nSuccessfully Saved";
//        Assert.assertEquals(actualMSG, expectedMSG, "Error message while adding a new candidate");
    }


}