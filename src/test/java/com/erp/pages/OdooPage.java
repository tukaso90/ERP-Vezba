package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OdooPage {
    public OdooPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1")
    public WebElement odooTitle;

    @FindBy(xpath = "//main//h2")
    public List<WebElement> mainDocuments;



}
