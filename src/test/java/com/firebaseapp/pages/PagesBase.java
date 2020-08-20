package com.firebaseapp.pages;

import com.firebaseapp.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagesBase {

    protected WebDriver driver;

    protected PagesBase(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriverWait getWebDriverWait() {
        return new WebDriverWait(driver, TestConfig.WAIT_TIME_IN_SECONDS);
    }

}
