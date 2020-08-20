package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Atinder
 */
public class LoginPage extends PagesBase {

    private final By emailTextbox = By.name("email");
    private final By passwordTextbox = By.name("password");
    private final By signinButton = By.xpath("//button[text()=' Sign in ']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(TestConfig.BASE_URL + "/login");
    }

    public void login(String email, String password) {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(emailTextbox)).sendKeys(email);
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(passwordTextbox)).sendKeys(password);
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(signinButton)).click();
    }

    public boolean isSigninButtonDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(signinButton)).isDisplayed();
    }
}
