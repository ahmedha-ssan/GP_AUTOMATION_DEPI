package Tests;

import Base.baseTest;
import Pages.RecruitmentPage;
import Data.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentTests extends baseTest {

    @Test(description = "Verify adding a new candidate with valid data", dataProvider = "RecruitmentTestData", dataProviderClass = TestData.class)
    public void addCandidate_TC1(String firstName, String middleName, String lastName, String email, String contactNumber, String resumeFilePath, String keywords, String applicationDate, String note){
        recruitmentPage = new RecruitmentPage(driver);

        recruitmentPage.navigateToRecruitment();
        recruitmentPage.clickOnCandidatesTab();
        recruitmentPage.clickAddButton();
        recruitmentPage.enterFirstName(firstName);
        recruitmentPage.enterMiddleName(middleName);
        recruitmentPage.enterLastName(lastName);
        recruitmentPage.selectVacancy();
        recruitmentPage.enterEmail(email);
        recruitmentPage.enterContactNumber(contactNumber);
        recruitmentPage.enterResumeFile(resumeFilePath);
        recruitmentPage.enterKeywords(keywords);
        recruitmentPage.enterDateOfApplication(applicationDate);
        recruitmentPage.enterNote(note);
        recruitmentPage.enterCheckButton();
        recruitmentPage.clickSaveButton();

        // Assert the existence of the success message after adding a new candidate
        String actualMSG = recruitmentPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while adding a new candidate");
    }
}
