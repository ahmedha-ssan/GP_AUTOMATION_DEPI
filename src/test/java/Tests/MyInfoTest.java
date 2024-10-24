package Tests;

import Base.baseTest;
import Pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyInfoTest extends baseTest {

    @Test(priority = 0)
    public void EditInfo_TC1() {
        myInfoPage = new MyInfoPage(driver);
        myInfoPage.navigateToMyInfo();
        myInfoPage.enterDateOfBirth("2024-10-13");
       // myInfoPage.selectNationality();
        myInfoPage.clickSaveButton1();
    }
    @Test(description = "Assert that success message is displayed", dependsOnMethods = {"EditInfo_TC1"})
    public void AssertSuccessMessageDisplayed() {
        String actualMSG = myInfoPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Updated";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while Editing");
    }
    @Test(priority = 1)
    public void AddAttachment_TC2(){
        myInfoPage = new MyInfoPage(driver);
        myInfoPage.navigateToMyInfo();
        myInfoPage.clickAddButton();
        myInfoPage.enterResumeFile("C:\\Users\\Nancy\\Downloads\\Nancy Yousery cv.pdf");
        myInfoPage.clickSaveButton2();
    }
    @Test(description = "Assert that success message is displayed",dependsOnMethods = {"AddAttachment_TC2"})
    public void AssertSuccessMessageDisplayed2() {
        String actualMSG = myInfoPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while Editing");
    }


}


