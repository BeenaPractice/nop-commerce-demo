package com.nopcommerce.demo.pages;
/*
Inside RegisterPageTest class create following testmethods



 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton;
    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDropDown;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
            @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;
    public String getMessageRegisterText(){
        return getTextFromElement(registerText);
    }

public void verifyRegisterText(){
    String expectedTextRegister = "Register";
    Assert.assertTrue(expectedTextRegister.equals(getMessageRegisterText()));
}

public void clickOnRegisterButton(){
        clickOnElement(registerButton);
}
    public String getMessageFirsNameError(){
        return getTextFromElement(firstNameErrorMessage);
    }

    public void verifyFirstNameIsRequired(){
        String expected = "First name is required.";
        Assert.assertTrue(expected.equals(getMessageFirsNameError()));
    }
    public String getMessageLastNameError(){
        return getTextFromElement(lastNameErrorMessage);
    }

    public void verifyLastNameIsRequired(){
        String expected = "Last name is required.";
        Assert.assertTrue(expected.equals(getMessageLastNameError()));
    }
    public String getMessageFromEmailError(){
        return getTextFromElement(emailErrorMessage);
    }

    public void verifyEmailIsRequired(){
        String expected = "Email is required.";
        Assert.assertTrue(expected.equals(getMessageFromEmailError()));
    }
    public String getMessageFromPasswordError(){
        return getTextFromElement(passwordErrorMessage);
    }

    public void verifyPasswordIsRequired(){
        String expected = "Password is required.";
        Assert.assertTrue(expected.equals(getMessageFromPasswordError()));
    }
    public String getMessageFromConfirmPasswordError(){
        return getTextFromElement(confirmPasswordErrorMessage);
    }

    public void verifyConfirmPasswordIsRequired(){
        String expected = "Password is required.";
        Assert.assertTrue(expected.equals(getMessageFromConfirmPasswordError()));
    }
    public void selectGenderFemale(){
        clickOnElement(femaleRadioButton);
    }
    public void enterFirstName(){
        sendTextToElement(firstName,"Prime");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Testing");
    }
    public void selectBirthDay(){
        selectByVisibleTextFromDropDown(dateOfBirthDropDown,"9");
    }
    public void selectBirthMonth(){
        selectByVisibleTextFromDropDown(dateOfBirthDropDown,"May");
    }
    public void selectBirthYear(){
        selectByVisibleTextFromDropDown(birthYear,"2001");
    }
    public void enterEmail(){
        sendTextToElement(email,"bhuro@gmail.com");
    }
    public void enterPassword(){
        sendTextToElement(password,"Alp123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"Alp123");
    }
    public String getMessageAfterRegister(){
        return getTextFromElement(registrationCompleted);
    }
    public void verifyMessageRegistrationCompleted(){
        String expectedRegisterMessage = "Your registration completed";
        Assert.assertTrue(expectedRegisterMessage.equals(getMessageAfterRegister()));
    }











}
