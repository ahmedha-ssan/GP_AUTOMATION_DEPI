package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.ClaimPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClaimTest extends baseTest {

    @Test(description = "Verify adding a new expense claim with valid data",dataProvider = "ClaimTestData", dataProviderClass = TestData.class)
    public void addExpenseClaimTest(String date,String amount,String note) throws InterruptedException {
        claimPage = new ClaimPage(driver);

        claimPage.navigateToClaims();
        claimPage.clickMyClaims();
        claimPage.clickViewDetails();
        claimPage.clickAddExpense();
        claimPage.selectExpenseType();
        claimPage.enterDateOfApplication(date);
        claimPage.enterAmount(amount);
        claimPage.addNote(note);
        claimPage.clickSave();
        claimPage.clickSubmit();

        // Assert the existence of the success message after adding a new candidate
        String actualMSG = claimPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while adding a new candidate");
    }
}