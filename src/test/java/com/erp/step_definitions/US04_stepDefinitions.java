package com.erp.step_definitions;

import com.erp.pages.InventoryManagerPage;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    InventoryManagerPage inventoryManager = new InventoryManagerPage();


    @Given("user should be able to log in as an Inventory Manager")
    public void user_should_be_able_to_log_in_as_an_inventory_manager() {
        loginPage.login(ConfigurationReader.getProperty("inventory.manager.username"),ConfigurationReader.getProperty("inventory.manager.password"));
    }
    @Then("verify user is logged as {string}")
    public void verify_user_is_logged_as(String string) {
        Assert.assertEquals(string,inventoryManager.inventoryManagerButton.getText());
    }

    @Then("verify Inventory manager has access to {int} modules")
    public void verify_inventory_manager_has_access_to_modules(Integer int1) {
        Assert.assertEquals(int1,Integer.valueOf(inventoryManager.mainModules.size()));
    }


}
