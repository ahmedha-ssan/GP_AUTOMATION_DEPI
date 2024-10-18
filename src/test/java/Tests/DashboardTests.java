package Tests;

import Base.baseTest;
import Pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTests extends baseTest {
    @Test
    public void testDashboardHeaderDisplayed() {
        dashboardPage = new DashboardPage(driver);
        // Verify that the dashboard header is displayed correctly
        String headerText = dashboardPage.getDashboardHeader();
        Assert.assertEquals(headerText, "Dashboard", "Dashboard header is incorrect");
    }

    @Test
    public void testWidgetInteractivity() {
        dashboardPage = new DashboardPage(driver);
        // Verify interactive elements within the widgets
        dashboardPage.clickExpandCollapseWidget();
    }

    @Test
    public void testIsWidgetExpanded() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickExpandCollapseWidget();
        boolean isExpanded = dashboardPage.isWidgetExpanded();
        Assert.assertTrue(isExpanded, "The widget should be expanded.");
    }
}
