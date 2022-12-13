package com.ultimateqa.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.customlisteners.CustomListeners;
import com.ultimateqa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement navigateToLoginPage;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome Back!')]")
    WebElement welcomeBackMessage;

public void setNavigateToLoginPageWithClick(){
    CustomListeners.test.log(Status.PASS, "Click on Log In Button ");
    clickOnElement(navigateToLoginPage);

}
public String getWelcomeText(){
    CustomListeners.test.log(Status.PASS,"Get welcome text" );
    return getTextFromElement(welcomeBackMessage);
}




}
