package com.firebaseapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Atinder
 */
public class DashboardPage {

    private final WebDriver driver;

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
        this.driver = driver;
    }

    public void isDashboardTextDisplayed() {
        driver.findElement(dashboardText).isDisplayed();
    }

    public void clickCoherentDroplist() {
        driver.findElement(coherentDroplist).click();
    }

    public void clickLogoutLinktext() { driver.findElement(logoutLinktext).click();}

    public void clickShowKeyLinktext() {driver.findElement(showKeyLinktext).click(); }

    public void isApiKeyTextDisplayed() {driver.findElement(apiKeyText).isDisplayed();}

    public void clickProjectLinktext() { driver.findElement(projectLinktext).click();}

    public void clickUserManagementLinktext() { driver.findElement(userManagementLinktext).click(); }

    public void clickAllUsersLinktext() { driver.findElement(allUsersLinktext).click();}

    public void clickAnalyticsLinktext() { driver.findElement(analyticsLinktext).click(); }

    public void clickAutomationLinktext() { driver.findElement(automationLinktext).click(); }

}
