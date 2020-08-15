package com.firebaseapp.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApiKeyTests extends TestsBase {

    @BeforeMethod
    public void login() {
        getLoginPage().open(baseUrl);
        getLoginPage().login("test@test.com", "Test@123");
    }

    @Test
    public void showKeyTest() throws InterruptedException {
        getDashboardPage().clickCoherentDroplist();
        getDashboardPage().clickShowKeyLinktext();
        getDashboardPage().isApiKeyTextDisplayed();
    }

}
