package org.example.ui.page;

import org.example.demoqa.WebElementManager;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.FrameHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    FrameHelper frameHelper = new FrameHelper(Driver.getDriver());
    public FramePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//iframe[@id='frame1']")
    public WebElement iframe1;
    @FindBy(xpath = "//iframe[@id='frame2']")
    public WebElement iframe2;

    public FramePage switchToBigFrame(){
        frameHelper.switchToFrame(iframe1);
        return this;
    }
    public FramePage switchSmallFrame(){
        frameHelper.switchToFrame(iframe2);
        return this;
    }
    public FramePage switchToParentFrame(){
        frameHelper.switchToParentFrame();
        return this;
    }




}
