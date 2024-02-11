package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ButtonsPage {
    WebElementHelper webElementHelper = new WebElementHelper();
    Actions actions = new Actions(Driver.getDriver());

    public ButtonsPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="doubleClickBtn")
    public WebElement WebElementDoubleClickMeBtn;
    @FindBy(xpath="//button [@id='rightClickBtn']")
    public WebElement WebElementRightClickMeBtn;
    @FindBy(xpath="//button [text()='Click Me']")
    public WebElement WebElementClickMeBtn;

    public ButtonsPage doubleClickBtn(){
        webElementHelper.doubleClick(WebElementDoubleClickMeBtn);
        return this;
    }
    public ButtonsPage rightClickBtn(){
        webElementHelper.rightClick(WebElementRightClickMeBtn);
        return this;
    }
    public ButtonsPage clickBtn(){
        webElementHelper.click(WebElementClickMeBtn);
        return this;
    }
}
