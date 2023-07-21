package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy()
    WebElement noteBooksLink;
    @CacheLookup
    @FindBy()
    WebElement softwareLink;
    @CacheLookup
    @FindBy(css = "div[class='picture'] img[title='Show details for Build your own computer']")
    WebElement buildYourOwnComputer;

    public String getTextFromComputer(){
        return getTextFromElement(computersText);
    }
    public void verifyTextComputer(){
        String expectedComputerText = "Computers";
        Assert.assertTrue(expectedComputerText.equals(getTextFromComputer()));
    }
    public void clickOnDesktopLink(){
        clickOnElement(desktopsLink);
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }

}
