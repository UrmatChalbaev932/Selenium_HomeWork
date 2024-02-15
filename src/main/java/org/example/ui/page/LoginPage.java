package org.example.ui.page;

import dev.failsafe.function.CheckedRunnable;
import org.example.ui.drivers.Driver;
import org.example.ui.entity.LoginUserEntity;
import org.example.ui.helper.FrameHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.demoqa.WebElementManager.*;

public class LoginPage extends BasePage {
    FrameHelper frameHelper;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h5")
    public WebElement loginInTheBookStoreText;
    @FindBy(id = "newUser")
    public WebElement newUserBtn;
    @FindBy(id = "login")
    public WebElement loginBtn;
    @FindBy(xpath = "//h4")
    public WebElement registerToBookStoreText;
    @FindBy(xpath="//button[@id='register']")
    public WebElement registerBtn;
    @FindBy(xpath="//button[@id='gotologin']")
    public WebElement backToLoginBtn;
    @FindBy(xpath = "//label[@id='userName-label']/following-sibling::button")
    public WebElement logOutBtn;
    @FindBy(xpath = "//label[@id='userName-label']/following-sibling::label")
    public WebElement userName;
    @FindBy(linkText = "profile")
    public WebElement profileTextBtn;



    public LoginPage clickNewUserBtn(){
        webElementHelper.click(newUserBtn);
        return this;
    }
    public LoginPage clickLoginBtn(){
        webElementHelper.click(loginBtn);
        return this;
    }
    public LoginPage clickRegisterBtn() throws InterruptedException {
        webElementHelper.click(registerBtn); /////////////////////////////
        return this;
    }
    public LoginPage clickBackToLoginBtn(){
        webElementHelper.click(backToLoginBtn);
        return this;
    }
    public LoginPage acceptAlert(){
        alertHelper.acceptAlert();
        return this;
    }

    public LoginPage loginInBookStore(LoginUserEntity user){
        webElementHelper
                .sendKey(findElementByXpath("//input[@id='userName']"),user.getUserName())
                .sendKey(findElementByXpath("//input[@id='password']"), user.getPassword());
        return this;
    }
    public LoginPage registerToBookStoreWithFilledForm(LoginUserEntity user) {
        webElementHelper
                .sendKey(findElementByXpath("//input[@id='firstname']"), user.getFirstName())
                .sendKey(findElementByXpath("//input[@id='lastname']"), user.getLastName())
                .sendKey(findElementByXpath("//input[@id='userName']"), user.getUserName())
                .sendKey(findElementByXpath("//input[@id='password']"), user.getPassword());
        return this;
    }

    public LoginPage clickCheckBox() throws InterruptedException {
        frameHelper = new FrameHelper(driver);
        driver.switchTo().frame(findElementByXpath("//iframe[@title='reCAPTCHA']"));
        findElementByClassName("recaptcha-checkbox-border").click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return this;
    }
    public LoginPage waitMoment(int millis) throws InterruptedException {
        Thread.sleep(millis);
        return this;
    }

}
