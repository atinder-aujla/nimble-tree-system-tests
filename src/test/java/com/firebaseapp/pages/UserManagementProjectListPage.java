package com.firebaseapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementProjectListPage {

    private long webDriverWaitTimeInSeconds = 5;
    private String pageEndpoint = "user-management-project-list";

    private WebDriver driver;


    public UserManagementProjectListPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyPageUrl(String baseUrl) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, webDriverWaitTimeInSeconds);
        webDriverWait.until(ExpectedConditions.urlToBe(baseUrl + pageEndpoint));
    }

}
