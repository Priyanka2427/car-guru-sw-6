package com.carsguide.pages;

import com.carsguide.browserfactory.ManageBrowser;
import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h1[@class = 'h1Text search--title']")
    WebElement productPageTitle;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='noResultsContent--h1Text']")
    WebElement errorMsg;

    public String getTitleOfThePage() {
        log.info("Getting title of the page and verifying the make name : " + productPageTitle.toString());
        return getTextFromElement(productPageTitle);
    }

    public String getErrorMessage() {
        log.info("Getting error message when criteria was not matching: " + errorMsg.toString());
        return getTextFromElement(errorMsg);
    }

    public boolean isTitleAvailable() {
        try {
            productPageTitle.getText();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
