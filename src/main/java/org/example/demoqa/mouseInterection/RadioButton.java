package org.example.demoqa.mouseInterection;

import org.example.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.findElementByXpath;

public class RadioButton extends BaseTest {

    @Test (description = "click yes radio btn test", priority = 0)
    void click_yes_radio_btn_test(){
        openTheSite("https://demoqa.com/radio-button");
        actions.click(findElementByXpath("//label[text()='Yes']")).perform();
        Assert.assertEquals(findElementByXpath("//span[text()='Yes']").getText(), "Yes");
    }
    @Test (description = "click Impressive radio btn test", priority = 1)
    void click_Impressive_radio_btn_test(){
        openTheSite("https://demoqa.com/radio-button");
        actions.click(findElementByXpath("//label[text()='Impressive']")).perform();
        Assert.assertEquals(findElementByXpath("//span[text()='Impressive']").getText(), "Impressive");
    }
}
