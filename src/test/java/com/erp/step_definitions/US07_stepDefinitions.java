package com.erp.step_definitions;

import com.erp.pages.Events_CRM_managerPage;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US07_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    Events_CRM_managerPage crm = new Events_CRM_managerPage();

    @Given("User should be logged in as an Event manager")
    public void user_should_be_logged_in_as_an_event_manager() {
       loginPage.login(ConfigurationReader.getProperty("crm.manager.username"),ConfigurationReader.getProperty("crm.manager.password"));
    }

    @Then("verify the user is logged in as an Event manager")
    public void verify_the_user_is_logged_in_as_an_event_manager() {
        Assert.assertTrue(crm.crmManagerButton.isDisplayed());
    }
    @Then("verify the Event manager has access to {int} modules")
    public void verify_the_event_manager_has_access_to_modules(Integer int1) {
        Assert.assertEquals(int1,Integer.valueOf(crm.allModules.size()));
    }

}
