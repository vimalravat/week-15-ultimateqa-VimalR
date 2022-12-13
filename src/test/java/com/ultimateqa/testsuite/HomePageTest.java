package com.ultimateqa.testsuite;


import com.ultimateqa.pages.HomePage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    @Test (groups = {"smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.setNavigateToLoginPageWithClick();
        String expectedText = "Welcome Back!";
         String actualText = homePage.getWelcomeText();
          Assert.assertEquals(actualText, expectedText, "Message not displayed");

    }}

