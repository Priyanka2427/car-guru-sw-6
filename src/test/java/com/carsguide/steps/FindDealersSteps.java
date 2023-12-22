package com.carsguide.steps;

import com.carsguide.pages.CarDealersPage;
import com.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {

    @And("I click Find a Dealer")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealerOption();
    }

    @Then("I navigate to car-dealers page")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealersPage().getWelcomeText(), "Find a Car Dealership Near You");
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerName) {
        Assert.assertEquals(new CarDealersPage().isCarDealerNameAvailable(dealerName), dealerName);
    }
}
