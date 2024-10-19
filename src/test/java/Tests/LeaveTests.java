package Tests;

import Base.baseTest;
import Pages.LeavePage;
import Data.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LeaveTests extends baseTest {

    @Test(description = "Verify submitting a leave request without selecting a leave type and dates")
    public void submitLeaveRequestWithoutRequiredFields_TC1(){
        LeavePage leavePage = new LeavePage(driver);

        leavePage.navigateToLeaveModule();
        leavePage.navigateToApplyTab();

        // Intentionally skipping the leave type selection
        // Entering invalid/empty dates
        leavePage.enterFromDate("");  // Empty From Date
        leavePage.enterToDate("");    // Empty To Date
        leavePage.enterComments("Testing without required fields.");
        leavePage.clickApplyButton(1);

        // Assuming the application shows an error message if required fields are empty
        // You should change this according to your application's actual error message
        String actualErrorMsg = leavePage.isErrorMessageDisplayed();
        System.out.print(actualErrorMsg);
        String expectedErrorMsg = "Required"; // Adjust as per actual implementation

        // Assert that the correct error message is displayed
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg, "Error message not displayed as expected when required fields are missing.");
    }

    @Test(description = "Verify submitting a leave request with valid data", dataProvider = "LeaveTestData", dataProviderClass = TestData.class)
    public void submitLeaveRequest_TC2(String leaveType, String fromDate, String toDate, String partialDays, String comments){
        LeavePage leavePage = new LeavePage(driver);

        leavePage.navigateToLeaveModule();
        leavePage.navigateToApplyTab();
        leavePage.selectLeaveType(leaveType);

        leavePage.enterFromDate(fromDate);
        //leavePage.enterToDate(toDate);
        leavePage.enterComments(comments);
        //leavePage.clickApplyButton();
        //leavePage.enterPartialDays(partialDays);

        leavePage.clickApplyButton(2);

        // Assert the existence of the success message after submitting a leave request
        String actualMSG = leavePage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while submitting a leave request");
    }
}
