package com.firebaseapp.tests;

import com.firebaseapp.config.TestConfig;
import com.firebaseapp.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestsBase {

    protected WebDriver driver;

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected DashboardPage dashboardPage;
    protected ProjectPage projectPage;
    protected UserManagementProjectListPage userManagementProjectListPage;
    protected UserManagementPage userManagementPage;
    protected ProjectListPage projectListPage;
    protected AutomationDashboardPage automationDashboardPage;

    @BeforeTest
    public static void beforeAllTests() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeEachTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TestConfig.WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterEachTest() {
        if (driver != null) {
            driver.quit();
        }
        clearPageObjects();
    }

    protected HomePage getHomePage() {
        if(null == homePage) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    protected LoginPage getLoginPage() {
        if(null == loginPage) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    protected ProjectPage getProjectPage() {
        if(null == projectPage) {
            projectPage = new ProjectPage(driver);
        }
        return projectPage;
    }

    protected DashboardPage getDashboardPage() {
        if(null == dashboardPage) {
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
    }

    protected ProjectListPage getProjectListPage() {
        if(null == projectListPage) {
            projectListPage = new ProjectListPage(driver);
        }
        return projectListPage;
    }

    protected UserManagementPage getUserManagementPage() {
        if(null == userManagementPage) {
            userManagementPage = new UserManagementPage(driver);
        }
        return userManagementPage;
    }

    protected UserManagementProjectListPage getUserManagementProjectListPage() {
        if(null == userManagementProjectListPage) {
            userManagementProjectListPage = new UserManagementProjectListPage(driver);
        }
        return userManagementProjectListPage;
    }

    protected AutomationDashboardPage getAutomationDashboardPage() {
        if(null == automationDashboardPage) {
            automationDashboardPage = new AutomationDashboardPage(driver);
        }
        return automationDashboardPage;
    }

    private void clearPageObjects() {
        loginPage = null;
        homePage = null;
        dashboardPage = null;
        projectPage = null;
        userManagementProjectListPage = null;
        userManagementPage = null;
        projectListPage = null;
        automationDashboardPage = null;
    }

}
