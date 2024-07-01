package org.example.ui.drivers;

import org.example.ui.config.ConfigReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){//
        System.setProperty("webdriver.chrome.driver","/Users/user/IdeaProjects/Selenium_HomeWork/src/main/resources/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size-1920,1080");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
            options.addArguments("--headless");
        }


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        return driver;
    }
}
