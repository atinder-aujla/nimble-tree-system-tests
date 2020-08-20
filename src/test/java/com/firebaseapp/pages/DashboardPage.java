package com.firebaseapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Atinder
 */
public class DashboardPage extends PagesBase {

    private final By dashboardText = By.xpath("//h2[text()='Dashboard']");
    private final By coherentDroplist = By.xpath("//a[@data-toggle='dropdown']");
    private final By logoutLinktext = By.xpath("//a[text()='Logout ']");
    private final By showKeyLinktext = By.xpath("//a[text()= 'Show Key ']");
    private final By apiKeyText = By.xpath("//h2[@class= 'swal2-title']");
    private final By projectLinktext = By.xpath("//h2[text()= 'Project']");
    private final By userManagementLinktext = By.xpath("//h2[text()= 'User Management']");
    private final By allUsersLinktext = By.xpath("//h2[text()= 'All Users']");
    private final By analyticsLinktext = By.xpath("//h2[text()='Analytics']");
    private final By automationLinktext = By.xpath("//h2[text()='Automation']");

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public boolean isDashboardTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(dashboardText)).isDisplayed();
    }

    public void clickCoherentDroplist() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(coherentDroplist)).click();
    }

    public void clickLogoutLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(logoutLinktext)).click();
    }

    public void clickShowKeyLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(showKeyLinktext)).click();
    }

    public boolean isApiKeyTextDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(apiKeyText)).isDisplayed();}

    public void clickProjectLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(projectLinktext)).click();
    }

    public void clickUserManagementLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(userManagementLinktext)).click();
    }

    public void clickAllUsersLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(allUsersLinktext)).click();
    }

    public void clickAnalyticsLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(analyticsLinktext)).click();
    }

    public void clickAutomationLinktext() {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(automationLinktext)).click();
    }

}
