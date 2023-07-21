package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        //    Click on Register Link
        homePage.clickOnRegisterLink();

        //    Verify "Register" text
        registerPage.verifyRegisterText();
    }

 //   @Test
//    2. verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
//    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
//        //    Click on Register Link
//        homePage.clickOnRegisterLink();
//        //    Click on "REGISTER" button
//        registerPage.clickOnRegisterButton();
//        //    Verify the error message "First name is required."
//        registerPage.verifyFirstNameIsRequired();
//        //    Verify the error message "Last name is required."
//        registerPage.verifyLastNameIsRequired();
//        //    Verify the error message "Email is required."
//        registerPage.verifyEmailIsRequired();
//        //    Verify the error message "Password is required."
//        registerPage.verifyPasswordIsRequired();
//        //    Verify the error message "Password is required."
//        registerPage.verifyConfirmPasswordIsRequired();
//    }
////    2. VerifyThatUserShouldCreateAccountSuccessfully()
//    @Test
//    public void  VerifyThatUserShouldCreateAccountSuccessfully() {
//        //    Click on Register Link
//        homePage.clickOnRegisterLink();
//        //    Select gender "Female"
//        registerPage.selectGenderFemale();
//        //    Enter firstname
//        registerPage.enterFirstName();
//        //    Enter lastname
//        registerPage.enterLastName();
//        //    Select day
//        registerPage.selectBirthDay();
//        //    Select month
//        registerPage.selectBirthMonth();
//        //    Select year
//        registerPage.selectBirthYear();
//        //    Enter email
//        registerPage.enterEmail();
//        //    Enter password
//        registerPage.enterPassword();
//        //    Enter Confirm Password
//        registerPage.enterConfirmPassword();
//        //    Click on "REGISTER" button
//        registerPage.clickOnRegisterButton();
//        //    Verify message "Your registration completed"
//        registerPage.verifyMessageRegistrationCompleted();
//    }
}
