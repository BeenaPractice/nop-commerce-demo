package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy()
    WebElement allMenu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy()
    WebElement nopCommerceLogo;
    @CacheLookup
    @FindBy()
    WebElement myAccountLink;
    @CacheLookup
    @FindBy()
    WebElement logoutLink;

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        mouseHoverToElement(registerLink);
        clickOnElement(registerLink);
    }
    public void clickOnComputer(){
        clickOnElement(computer);
    }

}
