package com.firebaseapp.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestsBase {

    @Test
    public void loginTest() {
        getLoginPage().open();
        getLoginPage().login("test@test.com", "Test@123");
        getDashboardPage().isDashboardTextDisplayed();
    }

    @Test
    public void logoutTest() {
        loginTest();
        getDashboardPage().clickCoherentDroplist();
        getDashboardPage().clickLogoutLinktext();
        getLoginPage().isSigninButtonDisplayed();
    }
}
