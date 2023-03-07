package com.erp.step_definitions;

import com.erp.pages.POSManagerPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US03_stepDefinitions {

    POSManagerPage pos_Manager_Page = new POSManagerPage();

    @Then("user logged in as a POS manager should be abele to see {int} modules")
    public void user_logged_in_as_a_pos_manager_should_be_abele_to_see_modules(Integer int1) {

    Assert.assertEquals(int1,Integer.valueOf(pos_Manager_Page.mainModules.size()));
    //it shows 23 elements because there is more button as well

    }



}
