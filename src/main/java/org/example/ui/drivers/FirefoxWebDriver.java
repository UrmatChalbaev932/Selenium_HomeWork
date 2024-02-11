package org.example.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxWebDriver {
    public static WebDriver loadFirefoxDriver(){
        System.setProperty("webdriver.geclo.driver", "src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        return driver;
    }
}
