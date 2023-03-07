package com.erp.step_definitions;

import com.erp.pages.SalesManagerPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US09_stepDefinitions {

    SalesManagerPage sales_Manager_Page = new SalesManagerPage();


    @Then("verify the sales manager has access to {int} modules")
    public void verify_the_sales_manager_has_access_to_modules(Integer expectedNumberOfModules) {

        Assert.assertEquals(expectedNumberOfModules, Integer.valueOf(sales_Manager_Page.mainModules.size()));

    }


}
