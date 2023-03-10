package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExpensesManagerPage {
    public ExpensesManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> allModules;

    @FindBy(xpath = "//span[.='ExpensesManager23']")
    public WebElement expensesManagerButton;




}
