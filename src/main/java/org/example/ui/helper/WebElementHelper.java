package org.example.ui.helper;

import org.example.ui.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementHelper {
    Actions actions = new Actions(Driver.getDriver());
    public WebElementHelper waitForButtonToBeClickAble(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public WebElementHelper waitForElementsToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementHelper click(WebElement element){
        waitForButtonToBeClickAble(element);
        scrollToElement(element);
        actions.click(element).perform();
        return this;
    }
    public WebElementHelper doubleClick(WebElement element){
        waitForButtonToBeClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }
    public WebElementHelper rightClick(WebElement element){
        waitForButtonToBeClickAble(element);
        actions.contextClick(element).perform();
        return this;
    }
    public WebElementHelper sendKey(WebElement element, String txt){
        waitForElementsToBeDisplayed(element);
        scrollToElement(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementHelper scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
}