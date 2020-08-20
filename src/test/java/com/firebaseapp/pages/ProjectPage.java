package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Atinder
 */
public class ProjectPage extends PagesBase {

    private String pageEndpoint = "project";

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public  void verifyPageUrl() {
        getWebDriverWait().until(ExpectedConditions.urlToBe(TestConfig.BASE_URL + pageEndpoint));
    }
}
