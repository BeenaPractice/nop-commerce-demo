package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy()
    WebElement sortBy;
    @CacheLookup
    @FindBy()
    WebElement display;
    @CacheLookup
    @FindBy()
    WebElement selectProductList;

    public String getTextFromDesktop() {
        return getTextFromElement(desktopsText);
    }

    public void verifyTextDesktop(){
        String expectedDesktopText = "Desktops";
        Assert.assertTrue(expectedDesktopText.equals(getTextFromDesktop()));
    }
}
