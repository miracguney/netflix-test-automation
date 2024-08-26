package netflix.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NetflixHomePage extends BasePage {
    private By signInButton = By.xpath("//a[contains(text(), 'Sign In')]");
    private By signUpButton = By.xpath("//a[contains(text(), 'Sign Up')]");

    public NetflixHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        driver.get("https://www.netflix.com/");
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void clickSignUp() {
        driver.findElement(signUpButton).click();
    }

    public boolean isSignInButtonVisible() {
        return driver.findElement(signInButton).isDisplayed();
    }
}
