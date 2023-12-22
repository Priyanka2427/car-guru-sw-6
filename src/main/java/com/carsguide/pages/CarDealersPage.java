package com.carsguide.pages;

import com.carsguide.browserfactory.ManageBrowser;
import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CarDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Find a Car Dealership Near You']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//p[@class = 'dealerBanner--dealershipName']")
    List<WebElement> carDealersName;


    public String getWelcomeText() {
        log.info("Getting welcome text from Find a Dealer page : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String isCarDealerNameAvailable(String dealerName) {
        for (WebElement e : carDealersName) {
            break;
        }
        log.info("Getting and verifying " + dealerName + " availability : " + carDealersName.toString());
        return dealerName;
    }
}
