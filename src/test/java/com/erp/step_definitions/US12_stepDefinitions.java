package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.POSManagerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    POSManagerPage posManagerPage = new POSManagerPage();

    @When("the user puts correct {string} and {string}")
    public void the_user_puts_correct_and(String string, String string2) {
       loginPage.login(string,string2);
    }
    @Then("user should see {string} on the profile page")
    public void user_should_see_on_the_profile_page(String string) {
        Assert.assertEquals(string,posManagerPage.confirmationButton.getText());
    }


}
