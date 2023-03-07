package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Events_CRM_managerPage {

   public Events_CRM_managerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='EventsCRMManager23']")
    public WebElement crmManagerButton;

   @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> allModules;


}
