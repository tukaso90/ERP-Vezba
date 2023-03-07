package com.erp.step_definitions;

import com.erp.pages.OdooPage;
import com.erp.pages.POSManagerPage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class US06_stepDefinitions {

    POSManagerPage pos_Manager_Page = new POSManagerPage();
    OdooPage odo = new OdooPage();

    @When("user should be able to click on the profile button")
    public void user_should_be_able_to_click_on_the_profile_button() {
    pos_Manager_Page.posManagerButton.click();
    }
    @When("user should be able to click on the Documentation button from the dropdown")
    public void user_should_be_able_to_click_on_the_documentation_button_from_the_dropdown() {
        pos_Manager_Page.documentationButton.click();

    }

    @Then("the Odoo page should be opened in a new window")
    public void the_odoo_page_should_be_opened_in_a_new_window() {
        for (String eachHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(eachHandle);
            if (Driver.getDriver().getTitle().equals("Odoo Documentation — Odoo 16.0 documentation")){
                break;
            }
        }
    }

    @Then("user should verify the Odoo Documentation  message is displayed in a new window")
    public void user_should_verify_the_odoo_documentation_message_is_displayed_in_a_new_window() {

        Assert.assertTrue(odo.odooTitle.isDisplayed());

    }

    @Then("user should verify there are {int} main document topics")
    public void user_should_verify_there_are_main_document_topics(Integer int1) {
        Assert.assertEquals(int1, Integer.valueOf(odo.mainDocuments.size()));
    }

}
