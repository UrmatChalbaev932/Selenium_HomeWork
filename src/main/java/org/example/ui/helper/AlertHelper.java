package org.example.ui.helper;

import com.google.common.cache.Weigher;
import org.example.ui.drivers.Driver;
import org.example.ui.page.AlertPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public Alert getAlert() {
        return Driver.getDriver().switchTo().alert();
    }

    public void acceptAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return; // stop
        }
        getAlert().accept();
    }

    public void dismissAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return;
        }
        getAlert().dismiss();
    }

    public void sendKeysAlert(String txt) {
        if (!isAlertPresent()){
            return;
        }
        getAlert().sendKeys(txt);
    }

    public boolean isAlertPresent(){
        try {
             getAlert();
        return true;
        }catch (NoAlertPresentException e){
            e.printStackTrace();
            return false;
        }
    }
    public String getTextAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        return getAlert().getText();
    }
}