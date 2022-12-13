package com.ultimateqa.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButtonOnLoginPage;
    @CacheLookup
    @FindBy(xpath = "//li[@class='form-error__list-item']")
    WebElement errorMessage;

    public void clickOnSignInButton() {
        CustomListeners.test.log(Status.PASS, "Click on Sign In Button ");

        clickOnElement(signInButton);
    }

    public void enterEmailId(String email) {
        CustomListeners.test.log(Status.PASS,"Enter Email " + email);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Email " + password);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS, "Click on Sign In Button ");
        clickOnElement(signInButtonOnLoginPage);
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS,"Error message occurred " );

        return getTextFromElement(errorMessage);

    }

}
