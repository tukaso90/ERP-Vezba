package com.erp.step_definitions;

import com.erp.pages.ExpensesManagerPage;
import com.erp.pages.LoginPage;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US08_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    ExpensesManagerPage expensesManager = new ExpensesManagerPage();

    @Given("User should be logged in as an Expenses manager")
    public void user_should_be_logged_in_as_an_expenses_manager() {
        loginPage.login(ConfigurationReader.getProperty("expenses.manager.username"),ConfigurationReader.getProperty("expenses.manager.password"));
    }
    @Then("verify the user is logged in as an Expenses manager")
    public void verify_the_user_is_logged_in_as_an_expenses_manager() {
        Assert.assertTrue(expensesManager.expensesManagerButton.isDisplayed());
    }

    @Then("verify the Expenses manager has access to {int} modules")
    public void verify_the_expenses_manager_has_access_to_modules(Integer expectedNumberOfModules) {
        Assert.assertEquals(expectedNumberOfModules, Integer.valueOf(expensesManager.allModules.size()));
    }


}
