package com.firebaseapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationDashboardPage {

    private long webDriverWaitTimeInSeconds = 5;
    private String pageEndpoint = "automation-dashboard";

    private final WebDriver driver;

    public AutomationDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyPageUrl(String baseUrl) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, webDriverWaitTimeInSeconds);
        webDriverWait.until(ExpectedConditions.urlToBe(baseUrl + pageEndpoint));
    }
}
