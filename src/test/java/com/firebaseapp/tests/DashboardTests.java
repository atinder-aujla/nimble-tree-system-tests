package com.firebaseapp.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTests extends TestsBase {

    @BeforeMethod
    public void login() {
        getLoginPage().open(baseUrl);
        getLoginPage().login("test@test.com", "Test@123");
    }

    @Test
    public void projectLinkTest() {
        getDashboardPage().clickProjectLinktext();
        getProjectPage().verifyPageUrl(baseUrl);
    }

    @Test
    public void userManagementLinkTest() {
        getDashboardPage().clickUserManagementLinktext();
        getUserManagementProjectListPage().verifyPageUrl(baseUrl);
    }

    @Test
    public void allUsersLinkTest() {
        getDashboardPage().clickAllUsersLinktext();
        getUserManagementPage().verifyPageUrl(baseUrl);
    }

    @Test
    public void analyticsLinkTest() {
        getDashboardPage().clickAnalyticsLinktext();
        getProjectListPage().verifyPageUrl(baseUrl);
    }

    @Test
    public void automationLinkTest() {
        getDashboardPage().clickAutomationLinktext();
        getAutomationDashboardPage().verifyPageUrl(baseUrl);
    }

}
