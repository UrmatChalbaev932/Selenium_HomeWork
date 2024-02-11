package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CssSelector extends BaseTest {
    @Test
    void cssSelectorTest() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        // . --> className
        // # --> id
        // " " --> tag

        driver.findElement(By.cssSelector("#userName")).sendKeys("Test");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("Test@gmail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Test");
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Test");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }
}
