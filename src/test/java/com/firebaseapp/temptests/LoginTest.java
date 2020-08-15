package com.firebaseapp.temptests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    String baseUrl = "https://coherent-tree.firebaseapp.com/";
    String homePage = "home";
    String loginPage = "login";

    private WebDriver driver;

    @BeforeTest
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(baseUrl + loginPage);
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.name("button")).click();
        driver.findElement(By.xpath("//h2[text()='Dashboard']")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test
    public void logoutTest() throws InterruptedException {
        loginTest();
        driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Logout ']")).click();
        driver.findElement(By.xpath("//button[text()=' Sign in ']")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test
    public void homePageElements() throws InterruptedException {
        driver.get(baseUrl + homePage);
        Thread.sleep(2000);
        driver.findElement(By.className("navbar-brand")).isDisplayed();
        driver.findElement(By.className("carousel-control-prev")).isDisplayed();
        driver.findElement(By.xpath("//p[text()=' Get your product testing done with the power of crowd ']")).isDisplayed();
        driver.findElement(By.xpath("//p[text()='LOGIN NOW...']")).isDisplayed();
        driver.findElement(By.xpath("//p[text()=' Subscribe for Crowd testing services (Pay per test execution) for your Company Projects ']")).isDisplayed();
        driver.findElement(By.xpath("//h2[text()='Contact Us']")).isDisplayed();
        Thread.sleep(2000);
    }

}
