package Tests;

import Base.baseTest;
import Data.TestData;
import Pages.MaintenancePage;
import org.testng.annotations.Test;

public class MaintenanceDownloadTests extends baseTest {
    MaintenancePage maintenancePage;

    @Test(priority = 1, description = "Verify employee data download",
            dataProvider = "PerformanceTestData", dataProviderClass = TestData.class)
    public void downloadEmployeeData_TC1(String employeeName) {
        maintenancePage = new MaintenancePage(driver);


        maintenancePage.navigateToMaintenance();


        maintenancePage.loginToMaintenance("admin123");


        maintenancePage.clickAccessRecords();


        maintenancePage.inputEmployeeName(employeeName);

        maintenancePage.searchEmployee();

        maintenancePage.downloadData();
    }
}


