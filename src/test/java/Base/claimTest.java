package Base;

import Pages.RecruitmentPage;
import Pages.claimPage;
import org.testng.annotations.Test;

public class claimTest extends baseTest {
    claimPage ClaimPage;

    @Test(description = "Verify adding a new expense claim with valid data")
    public void addExpenseClaimTest() throws InterruptedException {
        ClaimPage = new claimPage(driver);

        // Test data
        //String expenseType = "Transport";
        String date = "2024-10-13";
        String amount = "222";
        String note = "Transportation expense for meeting";

//        // Test steps
//        ClaimPage.navigateToClaims()
//                .clickMyClaims()
//                .clickViewDetails()
//                .clickAddExpense()
//                .fillExpenseDetails(date, amount, note)
//                .clickSave();
        ClaimPage.navigateToClaims();
        ClaimPage.clickMyClaims();
        ClaimPage.clickViewDetails();
        ClaimPage.clickAddExpense();
        ClaimPage.fillExpenseDetails(date, amount, note);
        ClaimPage.clickSave();

        // Submit the expense
       //ClaimPage.wait(1000000);
        ClaimPage.clickSubmit();
    }
}