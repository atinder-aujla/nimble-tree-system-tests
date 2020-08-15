package com.firebaseapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By emailTextbox = By.name("email");
    private final By passwordTextbox = By.name("password");
    private final By signinButton = By.xpath("//button[text()=' Sign in ']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String baseUrl) {
        driver.get(baseUrl + "/login");
    }

    public void login(String email, String password) {
        driver.findElement(emailTextbox).sendKeys(email);
        driver.findElement(passwordTextbox).sendKeys(password);
        driver.findElement(signinButton).click();
    }

    public void isSigninButtonDisplayed() {
        driver.findElement(signinButton).isDisplayed();
    }
}
