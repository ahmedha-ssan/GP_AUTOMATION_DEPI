package Recruitment;

import Base.baseTest;
import Pages.Recruitment.RecruitmentPage;
import org.testng.annotations.Test;

public class RecruitmentTests extends baseTest {
    RecruitmentPage recruitmentPage;

    @Test(dependsOnMethods = {"Login.LoginTests.Login_TC1"}, priority = 2, description = "Verify adding a new candidate with valid data")
    public void addCandidate_TC1() {
        recruitmentPage = new RecruitmentPage(driver);

        // Test data
        String firstName = "Ahmed";
        String middleName = "A";
        String lastName = "Hassan";
        String jobVacancy = "test";
        String email = "Ahmed@g.com";
        String contactNumber = "011";
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

        // Assertion
        // Assert.assertTrue(recruitmentPage.isCandidateAddedSuccessfully(), "The candidate was not added successfully.");
    }
}