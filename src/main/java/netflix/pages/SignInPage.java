package netflix.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private By emailField = By.id("id_userLoginId");
    private By passwordField = By.id("id_password");
    private By signInButton = By.xpath("//button[@type='submit']");
    private By errorMessage = By.xpath("//div[contains(@class, 'ui-message-contents')]");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
