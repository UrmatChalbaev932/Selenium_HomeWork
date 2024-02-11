package org.example.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangehrmliveLoginTest {

    WebDriver driver = new ChromeDriver();  // Создание экземпляра WebDriver для браузера Chrome

    @BeforeClass
    void openSite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");// Создание экземпляра WebDriver для браузера Chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    void closeBrowser() {
        driver.close();
        driver.quit();
    }

    @BeforeMethod
    void startTest() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(description = "login with valid username and valid password")
    void login_with_valid_username_and_valid_password() {

        WebElement userNameInput = driver.findElement(By.name("username"));
        WebElement userPasswordInput = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.tagName("button"));

        userNameInput.sendKeys("Admin");
        userPasswordInput.sendKeys("admin123");
        loginBtn.click();

        String expected = "Dashboard";
        String actual = driver.findElement(By.tagName("h6")).getText();
        Assert.assertEquals(actual, expected);


    }

    @Test(description = "login with valid username and invalid password")
    void login_with_valid_username_and_invalid_password() {

        WebElement userNameInput = driver.findElement(By.name("username"));
        WebElement userPasswordInput = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.tagName("button"));

        userNameInput.sendKeys("Admin");
        userPasswordInput.sendKeys("test");
        loginBtn.click();

        String expected = "Invalid credentials";
        String actual = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "login with empty username and empty password")
    void login_with_empty_username_and_empty_password() {

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String expected = "Required";
        String actual = driver.findElement(By.tagName("span")).getText();
        Assert.assertEquals(actual, expected);
    }


}