package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementPage {

    private String pageEndpoint = "user-management";

    private WebDriver driver;

    public UserManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyPageUrl() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, TestConfig.WAIT_TIME_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.urlToBe(TestConfig.BASE_URL + pageEndpoint));
    }

}
