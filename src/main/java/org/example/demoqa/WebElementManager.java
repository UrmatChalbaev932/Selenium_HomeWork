package org.example.demoqa;

import org.example.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;


public class WebElementManager{

    private static WebDriver driver = Driver.getDriver();

    public static WebElement findElementByClassName(String className){
       return driver.findElement(By.className(className));
    }
    public static WebElement findElementById(String Id){
        return driver.findElement(By.id(Id));
    }
    public static String findElementByIdGetText(String Id){
        return driver.findElement(By.id(Id)).getText();
    }
    public static String findElementByIdGetAttribute(String id){
        return driver.findElement(By.id(id)).getAttribute("value");
    }
    public static WebElement findElementByLinkedText(String linkedText){
        return driver.findElement(By.linkText(linkedText));
    }
    public static WebElement findElementByPartialLinkText(String partialLinkText){
        return driver.findElement(By.partialLinkText(partialLinkText));
    }
    public static WebElement findElementByXpath(String xpath){
        return Driver.getDriver().findElement(By.xpath(xpath));
    }
    public static String findElementByXpathGetText(String xpath){
        return findElementByXpath(xpath).getText();
    }

    public static boolean findElementByXpathIsSelected(String xpath){
        return Driver.getDriver().findElement(By.xpath(xpath)).isSelected();
    }
    public static String getCurrentUrl(){
        return driver.getCurrentUrl();
    }


}
