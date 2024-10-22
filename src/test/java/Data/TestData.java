package Data;

import org.testng.annotations.DataProvider;

public class TestData {
    //Test Data used for login test cases
    @DataProvider(name = "LoginTestData")
    public Object[][] LoginTestData() {
        return new Object[][]{
                {
                        "Admin"
                        ,"admin123"
                },
        };
    }

//    @DataProvider(name = "adminTestData")
//    public Object[][] adminTestData() {
//        return new Object[][]{
//                {
//                        "hanan hendawy"
//                        ,"hanan"
//                        ,"ASD@123"
//                        ,"ASD@123"
//
//                },
//        };//
//    }
    //Test Data used for Recruitment test cases
    @DataProvider(name = "RecruitmentTestData")
    public Object[][] RecruitmentTestData() {
        return new Object[][]{
                {
                    "Ahmed"
                        ,"Abdelhamid"
                        ,"Hassan"
                        ,"Ahmed@gmail.com"
                        ,"01128793499"
                        ,"C:\\Users\\ammod\\Downloads\\YAT235.pdf"
                        ,"|","2024-10-10"
                        ,"I'm the best person for that vacancy"
                },
        };
    }
    //Test Data used for Claim test cases
    @DataProvider(name = "ClaimTestData")
    public Object[][] ClaimTestData() {
        return new Object[][]{
                {
                        "2024-10-13"
                        ,"222"
                        ,"Transportation expense for meeting"
                },
        };
    }
    @DataProvider(name = "EditEmployeeData")
    public Object[][] EditEmployeeData() {
        return new Object[][]{
                {
                        "0364","Nancy","Yousery"
                },
        };
    }

    @DataProvider(name = "ResetPasswordData")
    public Object[][] ResetPasswordData() {
        return new Object[][]{
                {
                        "Admin"
                },
        };
    }
    @DataProvider(name = "LeaveTestData")
    public Object[][] getLeaveTestData() {
        return new Object[][]{
                {"CAN - FMLA", "2024-11-01", "2024-11-10", "Start Day Only", "Vacation with family"},
        };
    }

    @DataProvider(name = "PerformanceTestData")
    public Object[][] PerformanceTestData() {
        return new Object[][]{
                {
                        "a"  // partial employee name
                },
        };
    }

    @DataProvider(name = "SideBarTestData")
    public Object[][] SideBarTestData() {
        return new Object[][]{
                {
                        "PIM"  // partial employee name
                },
        };
    }

    @DataProvider(name = "jobtitleData")
    public Object[][] adminTestData() {
        return new Object[][]{
                {
                        "AAAAA Software Tester"
                        ,"Manual Testing and Automation testing"
                        ,"C:\\depi\\automation_project\\JobSpecification.pdf"
                        ,"My task is done"

                },
        };
    }


    @DataProvider(name = "searchData")
    public Object[][] adminsearchData() {
        return new Object[][]{
                {
                        "Admin"
                        ,""


                },
        };
    }

    @DataProvider(name = "addpost")
    public Object[][] addpost() {
        return new Object[][]{
                {
                        "helllooooooo"

                },
        };
    }

}