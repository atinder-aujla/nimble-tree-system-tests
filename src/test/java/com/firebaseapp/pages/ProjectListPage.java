package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Atinder
 */
public class ProjectListPage extends PagesBase {

    private String pageEndpoint = "analytics/project-list";

    public ProjectListPage(WebDriver driver) {
        super(driver);
    }

    public  void verifyPageUrl() {
        getWebDriverWait().until(ExpectedConditions.urlToBe(TestConfig.BASE_URL + pageEndpoint));
    }

}
