package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class RadioButtonPage {

    public RadioButtonPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//label[text()='Yes']")
    public WebElement yesRadioBtn;
    @FindBy(xpath = "//label[@for='impressiveRadio']")
    public WebElement impressiveRadioBtn;

    public RadioButtonPage clickYesRadioBtn(){
        yesRadioBtn.click();
        return this;
    }
    public RadioButtonPage clickImpressiveRadioBtn(){
        impressiveRadioBtn.click();
        return this;
    }
}
