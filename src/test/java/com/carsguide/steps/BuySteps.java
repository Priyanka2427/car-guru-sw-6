package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarSearchPage;
import com.carsguide.pages.ProductPage;
import com.carsguide.pages.UsedCarSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnTab(String option) {
        new HomePage().selectBuyAndSellTopMenu(option);
    }

    @And("I click Search Cars link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();
    }

    @Then("I navigate to new and used car search page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().getWelcomeText(), "New & Used Car Search - carsguide");
    }

    @And("I select make {string}")
    public void iSelectMake(String makes) {
        new NewAndUsedCarSearchPage().selectMakesFromDropDown(makes);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModelsFromDropDown(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPriceFromDropDown(price);

    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        if (new ProductPage().isTitleAvailable()) {
            Assert.assertTrue(new ProductPage().getTitleOfThePage().contains(make));
        } else {
            Assert.assertEquals(new ProductPage().getErrorMessage(), "Sorry, there doesn't appear to be any cars available for this search!", "");
        }
    }

    @And("I click Used link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @Then("I navigate to Used Cars For Sale page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarSearchPage().getWelcomeTextForUsedCarSale(), "Used Cars For Sale");
    }
}
