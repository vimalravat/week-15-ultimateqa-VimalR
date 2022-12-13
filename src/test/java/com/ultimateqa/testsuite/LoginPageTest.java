package com.ultimateqa.testsuite;

import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        loginPage = new LoginPage();
    }


    @Test (groups = {"sanity","regression"})

    public void verifyTheErrorMessage() {


        loginPage.clickOnSignInButton();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("test123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");
    }

}


