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


}