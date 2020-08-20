package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Atinder
 */
public class UserManagementPage extends PagesBase {

    private String pageEndpoint = "user-management";

    public UserManagementPage(WebDriver driver) {
        super(driver);
    }

    public  void verifyPageUrl() {
        getWebDriverWait().until(ExpectedConditions.urlToBe(TestConfig.BASE_URL + pageEndpoint));
    }

}
