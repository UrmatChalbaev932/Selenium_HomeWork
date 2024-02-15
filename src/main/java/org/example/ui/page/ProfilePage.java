package org.example.ui.page;

import org.example.demoqa.WebElementManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.demoqa.WebElementManager.findElementById;

public class ProfilePage extends BasePage{
    public ProfilePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "User Name")
    public WebElement userName; // имя пользователя
    public ProfilePage search(String text){ // кнопка поиска
        webElementHelper.sendKey(findElementById("searchBox"), text);
        webElementHelper.click(findElementById("basic-addon2"));
        return this;
    }
    public ProfilePage ClickLoginOutBtn(){ // кнопка выхода
        webElementHelper.click(findElementById("submit"));
        return this;
    }
    public ProfilePage ClickDeleteAccountBtn(){ // кнопка удаления аккаунта
        webElementHelper.click(findElementById("submit"));
        return this;
    }


}
