package netflix.tests;

import netflix.basetest.BaseTest;
import netflix.pages.NetflixHomePage;
import netflix.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test
    public void invalidLoginTest() {
        NetflixHomePage homePage = new NetflixHomePage(driver);
        SignInPage signInPage = new SignInPage(driver);

        homePage.navigateToHomePage();
        homePage.clickSignIn();
        signInPage.enterEmail("invalid@test.com");
        signInPage.enterPassword("wrongpassword");
        signInPage.clickSignIn();

        Assert.assertTrue(signInPage.getErrorMessage().contains("incorrect"),
                "Error message does not contain 'incorrect'");
    }
}
