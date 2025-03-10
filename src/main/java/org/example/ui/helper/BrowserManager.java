package org.example.ui.helper;

import org.example.ui.page.BasePage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserManager {
    private WebDriver driver;

    public BrowserManager(WebDriver driver) {
        this.driver = driver;
    }

    public void openByNavigate(final String URL){
        driver.navigate().to(URL);
    }

    public void openByGet(final String URL){
        driver.get(URL);
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshThePage(){
        driver.navigate().refresh();
    }

    // TODO move all method like: Frame, Window
}
