package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Atinder
 */
public class HomePage extends PagesBase {

    private final By microTaskServicesText = By.className("navbar-brand");
    private final By microTaskServicesHeader = By.className("carousel-control-prev");
    private final By productTestingText = By.xpath("//p[text()=' Get your product testing done with the power of crowd ']");
    private final By loginNowButton = By.xpath("//p[text()='LOGIN NOW...']");
    private final By subscribeText = By.xpath("//p[text()=' Subscribe for Crowd testing services (Pay per test execution) for your Company Projects ']");
    private final By contactUsText = By.xpath("//h2[text()='Contact Us']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(TestConfig.BASE_URL + "/home");
    }

    public boolean isMicroTaskServicesTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(microTaskServicesText)).isDisplayed();
    }

    public boolean isMicroTaskServicesHeaderDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(microTaskServicesHeader)).isDisplayed();
    }

    public boolean isProductTestingTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(productTestingText)).isDisplayed();
    }

    public boolean isLoginNowButtonDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(loginNowButton)).isDisplayed();
    }

    public boolean isSubscribeTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(subscribeText)).isDisplayed();
    }

    public boolean isContactUsTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(contactUsText)).isDisplayed();
    }
}
