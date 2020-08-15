package com.firebaseapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    private final By microTaskServicesText = By.className("navbar-brand");
    private final By microTaskServicesHeader = By.className("carousel-control-prev");
    private final By productTestingText = By.xpath("//p[text()=' Get your product testing done with the power of crowd ']");
    private final By loginNowButton = By.xpath("//p[text()='LOGIN NOW...']");
    private final By subscribeText = By.xpath("//p[text()=' Subscribe for Crowd testing services (Pay per test execution) for your Company Projects ']");
    private final By contactUsText = By.xpath("//h2[text()='Contact Us']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String baseUrl) {
        driver.get(baseUrl + "/home");
    }

    public void isMicroTaskServicesTextDisplayed() {
        driver.findElement(microTaskServicesText).isDisplayed();
    }

    public void isMicroTaskServicesHeaderDisplayed() {
       driver.findElement(microTaskServicesHeader).isDisplayed();
    }

    public void isProductTestingTextDisplayed() {
        driver.findElement(productTestingText).isDisplayed();
    }

    public void isLoginNowButtonDisplayed() {
        driver.findElement(loginNowButton).isDisplayed();
    }

    public void isSubscribeTextDisplayed() {
        driver.findElement(subscribeText).isDisplayed() ;
    }

    public void isContactUsTextDisplayed() {
        driver.findElement(contactUsText).isDisplayed();
    }
}
