package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.PerformancePage;
import org.testng.annotations.Test;

public class PerformanceTests extends baseTest {
    PerformancePage performancePage;

    // Test method using DataProvider to fetch the partial employee name
    @Test(priority = 1, description = "Verify login and searching for a performance review", dataProvider = "PerformanceTestData", dataProviderClass = TestData.class)
    public void searchPerformanceReview_TC1(String partialEmployeeName) {

        performancePage = new PerformancePage(driver);

        performancePage.navigateToPerformance();
        performancePage.enterEmployeeName(partialEmployeeName);

        performancePage.selectEmployeeSuggestion();

       performancePage.clickSearchButton();
    }
}
