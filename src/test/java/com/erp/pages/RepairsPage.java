package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage {
    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "o_column_sortable")
    public List<WebElement> repairsOrders;

    @FindBy(xpath = "//thead//input")
    public WebElement quotationCheckbox;

    @FindBy(xpath = "//tbody//input")
    public List<WebElement> allCheckboxes;



}
