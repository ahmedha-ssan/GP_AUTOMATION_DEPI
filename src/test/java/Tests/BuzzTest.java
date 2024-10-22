package Tests;
import Base.baseTest;
import Data.TestData;
import Pages.BuzzPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuzzTest extends baseTest {

    @Test(description = "Verify adding a new post", dataProvider = "addpost", dataProviderClass = TestData.class)
    public void addpost_TC1( String captionpost) throws InterruptedException {
        buzzpage =new BuzzPage(driver);
        buzzpage.navigateToBuzz();
        buzzpage.addCaptionPost(captionpost);
        buzzpage.clickpost();


    }
    @Test(description = "assertion",dependsOnMethods = "addpost_TC1")
    public void assertion( ) throws InterruptedException {

        String actualMSG = buzzpage.isSuccessMessageDisplayed();
        String expectedMSG = "Success\nSuccessfully Saved";
        Assert.assertEquals(actualMSG, expectedMSG, "Error message while adding a new post");

    }

    @Test(description = "Verify delete  post",dependsOnMethods = "assertion")
    public void deletepost_TC2( ) throws InterruptedException {
        buzzpage =new BuzzPage(driver);
       // buzzpage.navigateToBuzz();
        buzzpage.todelete();
        buzzpage.clickdelete();
        buzzpage.clickyesdelete();






    }

}
