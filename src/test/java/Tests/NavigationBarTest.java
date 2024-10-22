package Tests;

import Base.baseTest;
import Pages.ClaimPage;
import Pages.NavigationBarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarTest extends baseTest {

    @Test(description = "Verify Functionality of About Button")
    public void AboutButtonTest() {

        navigationBarPage.clickDropDownButton();
        navigationBarPage.clickAboutButton();
        //navigationBarPage.clickCloseAboutButton();
    }
    @Test(description = "Assert About button work",dependsOnMethods = {"AboutButtonTest"})
    public void AssertAboutButtonTest() {
        String actualMSG = navigationBarPage.AssertAboutButton();
        String expectedMSG = "OrangeHRM";
        Assert.assertEquals(actualMSG, expectedMSG, "assert fail we are not in the support tap");
    }

    @Test(description = "Verify Functionality of Support Button")
    public void SupportButtonTest() {
        navigationBarPage.clickCloseAboutButton();
        navigationBarPage.clickDropDownButton();
        navigationBarPage.clickSupportButton();
    }
    @Test(description = "Assert support button work",dependsOnMethods = {"SupportButtonTest"})
    public void AssertSupportButtonTest() {
        String actualMSG = navigationBarPage.AssertSupportButton();
        String expectedMSG = "Getting Started with OrangeHRM";
        Assert.assertEquals(actualMSG, expectedMSG, "assert fail we are not in the support tap");
    }

    @Test(description = "Verify the Upgrade button opens a new tab with the correct URL")
    public void testUpgradeButtonOpensNewTab() {

        navigationBarPage.clickUpgradeButton();
        navigationBarPage.switchToNewTab();

        // Get the current URL in the new tab
        String actualUrl = navigationBarPage.getCurrentUrl();
        String expectedUrl = "https://orangehrm.com/open-source/upgrade-to-advanced";

        // Verify the URL
        Assert.assertEquals(actualUrl, expectedUrl, "The Upgrade button did not open the correct URL.");
    }

}
