package Recruitment;

import Base.baseTest;
import Pages.RecruitmentPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class RecruitmentTests extends baseTest {
    RecruitmentPage recruitmentPage;

    @Test(priority = 1)
    public void addCandidate_TC1() {
        recruitmentPage = new RecruitmentPage(driver);

        // Test data
        String firstName = "Ahmed";
        String middleName = "A";
        String lastName = "Hassan";
        String jobVacancy = "test";
        String email = "Ahmed@g.com";
        String contactNumber = "011";
        String resumePath = "path/to/ahmedHassanCV.pdf"; // Replace with the actual path
        String keywords = "|";
        String applicationDate = "2024-10-10";
        String note = "I'm the best person for that vacancy";

        // Test steps
        recruitmentPage.navigateToRecruitment()
                .clickOnCandidatesTab()
                .clickAddButton()
                .enterCandidateDetails(firstName, middleName, lastName, jobVacancy, email, contactNumber,
                        resumePath, keywords, applicationDate, note)
                .uploadResumeWithRobot(resumePath)
                .clickSaveButton();

        // Assertion
        //Assert.assertTrue(recruitmentPage.isCandidateAddedSuccessfully(), "The candidate was not added successfully.");
    }

}
