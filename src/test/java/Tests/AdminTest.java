package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.AdminPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends baseTest {



    @Test(description = "Verify search for user", dataProvider = "searchData", dataProviderClass = TestData.class)
    public void searchUser_TC1( String username, String empname) throws InterruptedException {
        adminPage = new AdminPage(driver);
        adminPage.navigateToAdmin();
        adminPage.setUsers_option();
        adminPage.addusername(username);
        adminPage.selectrole();
        adminPage.addemployename(empname);
        adminPage.selectstatus();
        adminPage.clickSearchButton();

    }

    @Test(description = "Verify adding a new job title", dataProvider = "jobtitleData", dataProviderClass = TestData.class,dependsOnMethods = "searchUser_TC1")
    public void addjobtitle_TC2(String JobTitle, String JobDescription, String resumeFilePath, String note) throws InterruptedException {
        adminPage = new AdminPage(driver);
        adminPage.navigateToAdmin();
        adminPage.setJobtitles_option();
        adminPage.clickAddButton();
        adminPage.addJobTitle(JobTitle);
        adminPage.addJobdescription(JobDescription);
        adminPage.enterResumeFile(resumeFilePath);
        adminPage.enterNote(note);
        adminPage.clickSaveButton();


}


    @Test(description = "assertion ",dependsOnMethods = "addjobtitle_TC2")
    public void assertion() throws InterruptedException {

        String actualMSG = adminPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while adding a new job title");

    }


}
