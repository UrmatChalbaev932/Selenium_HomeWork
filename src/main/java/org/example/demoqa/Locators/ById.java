package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ById extends BaseTest {

    @Test
    void byIdTest(){
        openTheSite("https://demoqa.com/text-box");

        WebElement userNameInput = driver.findElement(By.id("userName"));
        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        userNameInput.sendKeys("John");
        userEmailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
        submitBtn.click();
    }

}
