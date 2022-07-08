package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDef {
    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on Etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
    }

    @Then("User sees title {string}")
    public void user_sees_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }


    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        etsyPage.searchBtn.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String keyWord) {
        etsyPage.searchBox.sendKeys(keyWord);
        etsyPage.searchBtn.click();
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
}
