package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Atinder
 */
public class ProjectPage {

    private String pageEndpoint = "project";

    private WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyPageUrl() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, TestConfig.WAIT_TIME_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.urlToBe(TestConfig.BASE_URL + pageEndpoint));
    }
}
