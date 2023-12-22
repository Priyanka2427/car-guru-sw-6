package com.carsguide.pages;

import com.carsguide.browserfactory.ManageBrowser;
import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy (xpath = "//a[@class = 'uhf-top']")
    List<WebElement> buyAndSellTopMenu;

    @CacheLookup
    @FindBy (xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[1]")
    WebElement searchCarsLink;

    @CacheLookup
    @FindBy (xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[2]")
    WebElement usedCarLink;


    @CacheLookup
    @FindBy(xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[4]")
    WebElement findADealerOption;

    public void selectBuyAndSellTopMenu(String option) {
        for (WebElement e : buyAndSellTopMenu) {
            mouseHoverToElement(e);
            break;
        }
        log.info("Mouse hovering on " + option + " : " + buyAndSellTopMenu.toString());
    }

    public void clickOnSearchCarsLink() {
        clickOnElement(searchCarsLink);
        log.info("Clicking on search cars option in buy + sell menu : " + searchCarsLink.toString());
    }

    public void clickOnUsedCarLink() {
        clickOnElement(usedCarLink);
        log.info("Clicking on used option in buy + sell menu : " + usedCarLink.toString());
    }

    public void clickOnFindADealerOption() {
        clickOnElement(findADealerOption);
        log.info("Clicking on find a dealer option in buy + sell menu : " + findADealerOption.toString());
    }

}




