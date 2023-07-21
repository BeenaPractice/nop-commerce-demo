package com.nopcommerce.demo.testsuite;
/*
3. ComputerPageTest
Inside ComputerPageTest class create following testmethods



 */

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

//    1. verifyUserShouldNavigateToComputerPageSuccessfully()
    @Test(enabled = false)
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //    Click on Computer tab
        homePage.clickOnComputer();
        //    Verify "Computer" text
        computerPage.verifyTextComputer();

    }
    @Test(enabled = false)
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //    Click on Computer tab
        homePage.clickOnComputer();
        //    Click on Desktops link
        computerPage.clickOnDesktopLink();
        //    Verify "Desktops" text
        desktopsPage.verifyTextDesktop();

    }
//    3. VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
//       String hdd, String os, String software)
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor,String ram, String hdd, String os, String software) throws InterruptedException {
    //(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        //    Click on Computer tab
        homePage.clickOnComputer();
        //    Click on Desktops link
        computerPage.clickOnDesktopLink();
        //    Click on product name "Build your own computer"
        Thread.sleep(2000);

        computerPage.clickOnBuildYourOwnComputer();
        //    Select processor "processor"
        //    Select RAM "ram"
        //    Select HDD "hdd"
        //    Select OS "os"
        //    Select Software "software"
        buildYourOwnComputerPage.buildYourOwnComputer(processor, ram, hdd, os, software);
        //    Click on "ADD TO CART" Button
        Thread.sleep(3000);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        //    Verify message "The product has been added to your shopping cart"
        //
    }

}
