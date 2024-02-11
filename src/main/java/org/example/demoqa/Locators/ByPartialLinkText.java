package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByPartialLinkText extends BaseTest {
    @Test
    void byPartialLinkTextTest() throws InterruptedException {
        openTheSite("https://demoqa.com/links");

        WebElement Unauth = driver.findElement(By.partialLinkText("Unauth"));
        Unauth.click();
        // Приостановка выполнения потока на 5 секунд
        Thread.sleep(5000);
    }
}

