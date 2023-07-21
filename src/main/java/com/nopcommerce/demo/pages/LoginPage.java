package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;

    public String getTextFromWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void verifyWelcomeText(){
        String expectedWelcomeText = "Welcome, Please Sign In!";
        Assert.assertTrue(expectedWelcomeText.equals(getTextFromWelcomeText()));
    }
    public void enterEmail() {
        clickOnElement(email);
        sendTextToElement(email, "prime123@gmail.com");
    }
        public void enterPassword(){
            clickOnElement(password);
            sendTextToElement(password,"prime123");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextFromErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void verifyErrorMessage(){
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        Assert.assertTrue(expectedErrorMessage.equals(getTextFromErrorMessage()));

    }
}
