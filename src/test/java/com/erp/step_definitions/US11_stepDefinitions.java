package com.erp.step_definitions;

import com.erp.pages.RepairsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_stepDefinitions {

    RepairsPage repairs = new RepairsPage();

    @When("user should be able to click on the top checkbox on Repairs page")
    public void user_should_be_able_to_click_on_the_top_checkbox_on_repairs_page() {
        repairs.quotationCheckbox.click();
    }
    @Then("all checkboxes should be selected on Repairs page")
    public void all_checkboxes_should_be_selected_on_repairs_page() {
        for (WebElement eachCheckbox : repairs.allCheckboxes) {
            Assert.assertTrue(eachCheckbox.isSelected());
        }
    }
}
