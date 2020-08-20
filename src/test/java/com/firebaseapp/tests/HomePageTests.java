package com.firebaseapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Atinder
 */
public class HomePageTests extends TestsBase {

    @Test
    public void homePageElementsExistenceTest() {
        getHomePage().open();
        Assert.assertTrue(getHomePage().isMicroTaskServicesTextDisplayed());
        Assert.assertTrue(getHomePage().isMicroTaskServicesHeaderDisplayed());
        Assert.assertTrue(getHomePage().isProductTestingTextDisplayed());
        Assert.assertTrue(getHomePage().isLoginNowButtonDisplayed());
        Assert.assertTrue(getHomePage().isSubscribeTextDisplayed());
        Assert.assertTrue(getHomePage().isContactUsTextDisplayed());
    }

}
