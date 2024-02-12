package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {
    WebDriver driver = Driver.getDriver();
   WebElementHelper webElementHelper = new WebElementHelper();

    public ModalDialogsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button [@id='showSmallModal']")
    public WebElement smallModalBtn;
    @FindBy(xpath = "//button [@id='showLargeModal']")
    public WebElement largeModalBtn;
    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement smallModalText;
    @FindBy(xpath = "//div[@class='modal-body']/p")
    public WebElement largeModalText;
    @FindBy(xpath = "//button[@id='closeSmallModal']")
    public WebElement smallModalCloseBtn;
    @FindBy(xpath = "//button[@id='closeLargeModal']")
    public WebElement largeModalCloseBtn;
    public ModalDialogsPage clickSmallModalBtn(){
        webElementHelper.click(smallModalBtn);
        return this;
    }
    public ModalDialogsPage clickLargeModalBtn(){
        webElementHelper.click(largeModalBtn);
        return this;
    }
    public ModalDialogsPage clickSmallModalCloseBtn(){
        webElementHelper.click(smallModalCloseBtn);
        return this;
    }
    public ModalDialogsPage clickLargeModalCloseBtn(){
        webElementHelper.click(largeModalCloseBtn);
        return this;
    }

}
