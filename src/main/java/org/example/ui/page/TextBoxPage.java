package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebElementHelper webElementHelper = new WebElementHelper();

    public TextBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput;
    @FindBy(id = "currentAddress")
    public WebElement currentAddredsInput;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;
    @FindBy(id = "submit")
    public WebElement submitClick;


    public TextBoxPage fillUpFullName(String fullName){
        webElementHelper.sendKey(fullNameInput,fullName);
        return this;
    }
    public TextBoxPage fillUpEmail(String email){
        webElementHelper.sendKey(emailInput,email);
        return this;
    }
    public TextBoxPage fillUpCurrentAddress(String currentAddress){
        webElementHelper.sendKey(currentAddredsInput,currentAddress);
        return this;
    }
    public TextBoxPage fillUpPermanentAddress(String permanentAddress){
        webElementHelper.sendKey(permanentAddressInput,permanentAddress);
        return this;
    }
    public TextBoxPage clickSubmitBtn(){
        webElementHelper.click(submitClick);
        return this;
    }
}


