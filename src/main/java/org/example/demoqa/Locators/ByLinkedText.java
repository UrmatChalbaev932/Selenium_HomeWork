package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByLinkedText extends BaseTest {

    @Test
    void byLinkedTextTest() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        // ищем по тексту
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        // Приостановка выполнения потока на 5 секунд
        Thread.sleep(5000);
    }
}
