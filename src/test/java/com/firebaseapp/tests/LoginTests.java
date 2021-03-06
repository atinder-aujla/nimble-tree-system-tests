package com.firebaseapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Atinder
 */
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
        Assert.assertTrue(getLoginPage().isSigninButtonDisplayed());
    }
}
