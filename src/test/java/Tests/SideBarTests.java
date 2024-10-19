package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.SideBarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SideBarTests extends baseTest {

    @Test(description = "Verify the search functionality in the sidebar",dataProvider = "SideBarTestData", dataProviderClass = TestData.class)
    public void testSidebarSearch(String searchText) {
        sideBarPage = new SideBarPage(driver);

        // Perform a search in the sidebar
        sideBarPage.search(searchText);
        // Verify that the search term is displayed correctly in the search field
        boolean isSearchDisplayed = sideBarPage.isSearchTermDisplayed(searchText);
        Assert.assertTrue(isSearchDisplayed, "The search term was not displayed as expected.");
    }
}
