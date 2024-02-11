package org.example.demoqa.mouseInterection;

import org.example.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.findElementById;
import static org.example.demoqa.WebElementManager.findElementByXpath;
import static org.testng.Assert.assertEquals;


public class Buttons extends BaseTest {

    @Test(description = "double click btn test", priority = 0)
    void double_click_btn_test() {
        openTheSite("https://demoqa.com/buttons");
        actions.doubleClick(findElementById("doubleClickBtn")).perform();
        assertEquals(findElementById("doubleClickMessage").getText(), "You have done a double click");
    }
    @Test(description = "right click me btn test", priority = 1)
    void right_click_me_btn_test(){
        openTheSite("https://demoqa.com/buttons");
        actions.contextClick(findElementById("rightClickBtn")).perform();
        assertEquals(findElementById("rightClickMessage").getText(), "You have done a right click");
    }
    @Test(description = "click me btn test", priority = 1)
    void lick_me_btn_test(){
        openTheSite("https://demoqa.com/buttons");
        actions.click(findElementByXpath("//button[text()='Click Me']")).perform();
        assertEquals(findElementById("dynamicClickMessage").getText(), "You have done a dynamic click");
    }


}
