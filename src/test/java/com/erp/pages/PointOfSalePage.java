package com.erp.pages;

import com.erp.utilities.Driver;
import io.netty.handler.codec.string.LineSeparator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSalePage {

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-action-id='663']")
    public WebElement orderButton;

    @FindBy(xpath = "//thead//input[@type='checkbox']")
    public WebElement orderRefCheckBox;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    public List<WebElement>allCheckBoxes;

    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement actionButton;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']//ul//li")
    public List<WebElement> actionButtonDropdownList;





}
