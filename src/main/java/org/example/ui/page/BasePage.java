package org.example.ui.page;

import org.example.demoqa.WebElementManager;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.AlertHelper;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.example.demoqa.WebElementManager;

public class BasePage {
    WebDriver driver = Driver.getDriver();
    WebElementHelper webElementHelper = new WebElementHelper();
    AlertHelper alertHelper = new AlertHelper();


}
