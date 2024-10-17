package Base;

import Pages.RecruitmentPage;
import org.testng.annotations.Test;

public class recruitmentTests extends baseTest {
    RecruitmentPage recruitmentPage;

    @Test(description = "Verify adding a new candidate with valid data")
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
}