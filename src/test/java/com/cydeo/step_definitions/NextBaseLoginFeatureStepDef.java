package com.cydeo.step_definitions;

import com.cydeo.pages.CrmPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class NextBaseLoginFeatureStepDef {
    CrmPage crmPage = new CrmPage();

    @Given("User is on the login page of CRM")
    public void user_is_on_the_login_page_of_crm() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbase.url"));
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

        crmPage.loginNextBase(credentials.get("username"), credentials.get("password"));
    }

    @Then("User should see CRM24 homepage")
    public void user_should_see_crm24_homepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }
}
