package Tests;
import Base.baseTest;
import Data.TestData;
import Pages.EmployeeListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeEditTest extends baseTest {

    @Test(dataProvider = "EditEmployeeData", dataProviderClass = TestData.class)
    public void testEditEmployeeDetails(String id,String Username,String lastname) {
        employeeListPage = new EmployeeListPage(driver);

        employeeListPage.navigateToPIM();
        employeeListPage.selectemploymentid(id);
        employeeListPage.clickSearchButton();
        employeeListPage.selecteditButton();
        employeeListPage.usernamefeild(Username);
        employeeListPage.lastnamefeild(lastname);
        employeeListPage.SaveButtonn();
        String actualMSG = employeeListPage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Updated";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while Editing");
    }
}
