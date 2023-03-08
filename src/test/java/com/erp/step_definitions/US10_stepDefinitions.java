package com.erp.step_definitions;

import com.erp.pages.POSManagerPage;
import com.erp.pages.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US10_stepDefinitions {

    SalesPage salesPage = new SalesPage();

    @When("user should be able to click on the top checkbox")
    public void user_should_be_able_to_click_on_the_top_checkbox() {
        salesPage.quotationCheckbox.click();
    }

    @Then("all checkboxes should be selected")
    public void all_checkboxes_should_be_selected() {

        for (WebElement eachCheckbox : salesPage.allCheckboxes) {
           Assert.assertTrue(eachCheckbox.isSelected());
        }

    }




}
