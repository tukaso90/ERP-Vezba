package com.erp.step_definitions;

import com.erp.pages.POSManagerPage;
import com.erp.pages.RepairsPage;
import com.erp.pages.SalesManagerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_stepDefinitions {

    POSManagerPage pos_Manager_Page = new POSManagerPage();
    SalesManagerPage sales_Manager_Page = new SalesManagerPage();
    RepairsPage repairs = new RepairsPage();

    @When("user clicks on the Repairs button as a POS manager")
    public void user_clicks_on_the_repairs_button_as_a_pos_manager() {
    pos_Manager_Page.repairsButton.click();
    }
    @Then("user should be able to see {int} columns for the repairs orders as a POS manager")
    public void user_should_be_able_to_see_columns_for_the_repairs_orders_as_a_pos_manager(Integer expectedOrdersNum) {
        Assert.assertEquals(expectedOrdersNum, Integer.valueOf(repairs.repairsOrders.size()));
    }




    @When("user clicks on the Repairs button as a sales manager")
    public void user_clicks_on_the_repairs_button_as_a_sales_manager() {
        sales_Manager_Page.repairsButton.click();
    }
    @Then("user should be able to see {int} columns for the repairs orders as a sales manager")
    public void user_should_be_able_to_see_columns_for_the_repairs_orders_as_a_sales_manager(Integer expectedOrdersNum) {
        Assert.assertEquals(expectedOrdersNum,Integer.valueOf(repairs.repairsOrders.size()));
    }


}
