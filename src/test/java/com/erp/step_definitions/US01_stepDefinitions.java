package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.POSManagerPage;
import com.erp.pages.SalesManagerPage;
import com.erp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

public class US01_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    POSManagerPage pos_Manager_Page = new POSManagerPage();
    SalesManagerPage sales_Manager_Page = new SalesManagerPage();

    @Given("user should be able to log in as a POS manager")
    public void user_should_be_able_to_log_in_as_a_pos_manager() {
        loginPage.login(ConfigurationReader.getProperty("pos.manager.username"),ConfigurationReader.getProperty("pos.manager.password"));
    }
    @Then("the user should be able to see {string} on the screen")
    public void the_user_should_be_able_to_see_on_the_screen(String string) {
        Assert.assertEquals(string,pos_Manager_Page.posManagerButton.getText());
    }
    @When("user clicks on the Sales button")
    public void user_clicks_on_the_sales_button() {
        pos_Manager_Page.salesButton.click();
    }
    @Then("the user should be able to see {int} quotations on the page")
    public void the_user_should_be_able_to_see_quotations_on_the_page(Integer int1) {

        Assert.assertEquals(int1, Integer.valueOf(pos_Manager_Page.quotations.size()));
    }




    @Given("user should be able to log in as a sales manager")
    public void user_should_be_able_to_log_in_as_a_sales_manager() {
        loginPage.login(ConfigurationReader.getProperty("sales.manager.username"),ConfigurationReader.getProperty("sales.manager.password"));
    }
    @Then("user should be able to see {string} on the screen")
    public void user_should_be_able_to_see_on_the_screen(String string) {
        Assert.assertEquals(string,sales_Manager_Page.salesManagerButton.getText());
    }
    @When("the user clicks on the Sales button")
    public void the_user_clicks_on_the_sales_button() {
        sales_Manager_Page.salesButton.click();
    }
    @Then("the user should be able to see the {int} quotations on the page")
    public void the_user_should_be_able_to_see_the_quotations_on_the_page(Integer int1) {

        Assert.assertEquals(int1,Integer.valueOf(sales_Manager_Page.quotations.size()));


    }
}
