package org.example.ui.page;

import com.google.common.cache.Weigher;
import org.checkerframework.common.util.report.qual.ReportInherit;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.AlertHelper;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.print.attribute.standard.PageRanges;
import javax.swing.*;
import java.time.Duration;

public class AlertPage {
    Actions actions = new Actions(Driver.getDriver());
    WebElementHelper webElementHelper = new WebElementHelper();
    AlertHelper alertHelper = new AlertHelper();

    public AlertPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "alertButton")
    public WebElement WebElementAlertButton;
    @FindBy(id = "timerAlertButton")
    public WebElement WebElementTimerAlertButton;
    @FindBy(id = "confirmButton")
    public WebElement WebElementConfirmBtn;
    @FindBy(id = "promtButton")
    public WebElement WebElementPromBtn;

    public AlertPage clickAlertButton() {
        WebElementAlertButton.click();
        return this;
    }

    public AlertPage clickTimerAlertButton() {
        WebElementTimerAlertButton.click();
        return this;
    }

    public AlertPage clickConfirmBtn() {
        WebElementConfirmBtn.click();
        return this;
    }

    public AlertPage clickPromBtn() {
        WebElementPromBtn.click();
        return this;
    }

    public AlertPage acceptAlert() {
        alertHelper.acceptAlert();
        return this;
    }

    public AlertPage dismissAlert() {
        alertHelper.dismissAlert();
        return this;
    }

    public AlertPage sendKeysAlert(String txt) {
        alertHelper.sendKeysAlert(txt);
        return this;
    }

}
