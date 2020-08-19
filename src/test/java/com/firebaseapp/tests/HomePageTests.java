package com.firebaseapp.tests;

import org.testng.annotations.Test;

/**
 * @author Atinder
 */
public class HomePageTests extends TestsBase {

    @Test
    public void homePageElementsExistenceTest() {
        getHomePage().open();
        getHomePage().isMicroTaskServicesTextDisplayed();
        getHomePage().isMicroTaskServicesHeaderDisplayed();
        getHomePage().isProductTestingTextDisplayed();
        getHomePage().isLoginNowButtonDisplayed();
        getHomePage().isSubscribeTextDisplayed();
        getHomePage().isContactUsTextDisplayed();
    }

}
