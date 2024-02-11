package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath extends BaseTest {
    @Test
    void byXpathTest() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("WallStreet 555");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Sovet 123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
