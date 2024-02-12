package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.FrameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramesPage {
    FrameHelper frameHelper = new FrameHelper(Driver.getDriver());
    @FindBy(id = "frame1")
    public WebElement ParentFrame;
    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement ChildFrame;

    public NestedFramesPage switchToParentFrame() {
        frameHelper.switchToFrame(Driver.getDriver().findElement(By.id("frame1")));
        return this;
    }

    public NestedFramesPage switchToChildFrame() {
       frameHelper.switchToFrame(Driver.getDriver().findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        return this;
    }
}