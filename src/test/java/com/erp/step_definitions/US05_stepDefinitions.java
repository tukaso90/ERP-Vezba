package com.erp.step_definitions;

import com.erp.pages.POSManagerPage;
import com.erp.pages.PointOfSalePage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US05_stepDefinitions {

    POSManagerPage pos_Manager_Page = new POSManagerPage();
    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    @When("user should be able to click Point of Sale button")
    public void user_should_be_able_to_click_point_of_sale_button() {
        pos_Manager_Page.pointOfSaleButton.click();
    }

    @When("user clicks on the order list on the Point of Sale page")
    public void user_clicks_on_the_order_list_on_the_point_of_sale_page() {
        pointOfSalePage.orderButton.click();
    }

    @Then("user should be able to check the Order reference")
    public void user_should_be_able_to_check_the_order_reference() {
        pointOfSalePage.orderRefCheckBox.click();
    }

    @Then("all the orders should be checked")
    public void all_the_orders_should_be_checked() {
        for (WebElement eachCheckBox : pointOfSalePage.allCheckBoxes) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }
    }

    @When("user clicks on the Action dropdown")
    public void user_clicks_on_the_action_dropdown() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pointOfSalePage.actionButton));

        pointOfSalePage.actionButton.click();
    }

    @Then("Action drop down button should have {int} options")
    public void action_drop_down_button_should_have_options(Integer int1) {
        Assert.assertEquals(int1, Integer.valueOf(pointOfSalePage.actionButtonDropdownList.size()));
    }

    @Then("the dropdown should contain listed elements")
    public void the_dropdown_should_contain_listed_elements(List<String> expectedList) {
        pointOfSalePage.actionButton.click();

        List<String> actionButtonDropdownListString = new ArrayList<>();

        for (WebElement eachElement : pointOfSalePage.actionButtonDropdownList) {
            actionButtonDropdownListString.add(eachElement.getText());
        }

        System.out.println(actionButtonDropdownListString);

        Assert.assertEquals(expectedList,actionButtonDropdownListString);

    }

}