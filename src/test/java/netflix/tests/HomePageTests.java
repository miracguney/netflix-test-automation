package netflix.tests;


import netflix.basetest.BaseTest;
import netflix.pages.NetflixHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void verifyHomePageLoad() {
        NetflixHomePage homePage = new NetflixHomePage(driver);
        homePage.navigateToHomePage();
        Assert.assertTrue(homePage.isSignInButtonVisible(), "Home page did not load correctly.");
    }
}
