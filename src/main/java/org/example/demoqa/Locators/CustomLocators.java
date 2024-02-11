package org.example.demoqa.Locators;

import org.example.demoqa.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;

public class CustomLocators extends BaseTest {
    @Test
    void byClassNameTest(){
        openTheSite("https://demoqa.com/text-box");
        WebElement userNameInput = findElementById("userName");
        WebElement userEmailInput = findElementById("userEmail");
        WebElement currentAddressInput = findElementById("currentAddress");
        WebElement permanentAddressInput = findElementById("permanentAddress");
        WebElement submitBtn = findElementByClassName("btn-primary");

        userNameInput.sendKeys("John");
        userEmailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
        submitBtn.click();
    }
    @Test
    void byLinkedTextTest() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        // ищем по тексту
        WebElement home = findElementByLinkedText("Home");
        home.click();
        // Приостановка выполнения потока на 5 секунд
        Thread.sleep(5000);
    }
    @Test
    void byPartialLinkTextTest() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement Unauth = findElementByPartialLinkText("Unauth");
        Unauth.click();
        // Приостановка выполнения потока на 5 секунд
        Thread.sleep(5000);
    }


}
