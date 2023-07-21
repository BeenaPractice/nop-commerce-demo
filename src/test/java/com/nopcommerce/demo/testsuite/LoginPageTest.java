package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
        //    1.LoginPageTest
        //    Inside LoginPageTest class create following testmethods
    //1.userShouldNavigateToLoginPageSuccessFully().
    @Test
    public void userShouldNavigateTOLoginPageSuccessfully() {
        //    Click on login link
        homePage.clickOnLoginLink();
        //    verify that "Welcome, Please Sign In!" message display
        loginPage.verifyWelcomeText();
    }

        //2. verifyTheErrorMessageWithInValidCredentials().
    @Test
    public void verifyTheErrorMessageWithInValidCredentials() {
        //    Click on login link
        homePage.clickOnLoginLink();
        //    Enter EmailId
        loginPage.enterEmail();
        //    Enter Password
        loginPage.enterPassword();
        //    Click on Login Button
        loginPage.clickOnLoginButton();
        //    Verify that the Error message
        loginPage.verifyErrorMessage();
    }
    //3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        //    Click on login link
        homePage.clickOnLoginLink();
        //    Enter EmailId
        loginPage.enterEmail();
        //    Enter Password
        loginPage.enterPassword();
        //    Click on Login Button
        loginPage.clickOnLoginButton();
        //    Verify that LogOut link is display

    }
        //4. VerifyThatUserShouldLogOutSuccessFully()
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        //    Click on login link
        homePage.clickOnLoginLink();
        //    Enter EmailId
        loginPage.enterEmail();
        //    Enter Password
        loginPage.enterPassword();
        //    Click on Login Button
        loginPage.clickOnLoginButton();
        //    Click on LogOut Link

        //    Verify that LogIn Link Display

    }

}
