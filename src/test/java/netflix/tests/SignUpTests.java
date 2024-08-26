package netflix.tests;

import netflix.basetest.BaseTest;
import netflix.pages.NetflixHomePage;
import netflix.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

    @Test
    public void verifySignUpPageNavigation() {
        NetflixHomePage homePage = new NetflixHomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.navigateToHomePage();
        homePage.clickSignUp();
        signUpPage.enterEmail("test@test.com");
        signUpPage.clickContinue();

        Assert.assertTrue(driver.getCurrentUrl().contains("signup"), "Failed to navigate to Sign Up page.");
    }
}
