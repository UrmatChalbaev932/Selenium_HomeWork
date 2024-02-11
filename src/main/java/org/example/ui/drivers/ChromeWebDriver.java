package org.example.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        return driver;
    }
}
