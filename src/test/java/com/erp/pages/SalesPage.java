package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//thead//input")
    public WebElement quotationCheckbox;

    @FindBy(xpath = "//tbody//input")
    public List<WebElement> allCheckboxes;




}
