package Tests;

import Base.baseTest;
import Pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTests extends baseTest {

    @Test
    public void testDashboardHeaderDisplayed() {
        // Verify that the dashboard header is displayed correctly
        String headerText = dashboardPage.getDashboardHeader();
        Assert.assertEquals(headerText, "Dashboard", "Dashboard header is incorrect");
    }

    @Test
    public void testWidgetInteractivity() {
        // Verify interactive elements within the widgets
        dashboardPage.clickExpandCollapseWidget();
    }

    @Test
    public void testIsWidgetExpanded() {
        dashboardPage.clickExpandCollapseWidget();
        boolean isExpanded = dashboardPage.isWidgetExpanded();
        Assert.assertTrue(isExpanded, "The widget should be expanded.");
    }

    @Test
    public void testTimeAtWorkWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isTimeAtWorkWidgetDisplayed(), "Time at Work widget is not displayed");
    }
    @Test
    public void testMyActionsWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isMyActionsWidgetDisplayed(), "My Actions widget is not displayed");
    }

    @Test
    public void testQuickLaunchWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isQuickLaunchWidgetDisplayed(), "Quick Launch widget is not displayed");
    }

    @Test
    public void testBuzzLatestPostsWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isBuzzLatestPostsWidgetDisplayed(), "Buzz Latest Posts widget is not displayed");
    }

    @Test
    public void testEmployeesOnLeaveTodayWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isEmployeesOnLeaveTodayWidgetDisplayed(), "Employees on Leave Today widget is not displayed");
    }

    @Test
    public void testEmployeeDistributionBySubUnitWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isEmployeeDistributionBySubUnitWidgetDisplayed(), "Employee Distribution by Sub Unit widget is not displayed");
    }

    @Test
    public void testEmployeeDistributionByLocationWidgetDisplayed() {
        Assert.assertTrue(dashboardPage.isEmployeeDistributionByLocationWidgetDisplayed(), "Employee Distribution by Location widget is not displayed");
    }

}
