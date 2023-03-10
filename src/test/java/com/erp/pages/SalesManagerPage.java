package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesManagerPage {
    public SalesManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[.='SalesManager23']")
    public WebElement salesManagerButton;

    @FindBy (xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement salesButton;

    @FindBy(className = "o_column_sortable")
    public List<WebElement>quotations;

    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement repairsButton;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> mainModules;

}
