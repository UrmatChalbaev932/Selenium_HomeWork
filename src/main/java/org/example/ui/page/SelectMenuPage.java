package org.example.ui.page;

import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMenuPage extends BasePage{
    public SelectMenuPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="oldSelectMenu")
    public WebElement oldStyleSelectMenu;

    @FindBy(id="react-select-3-input")
    public WebElement selectValueInput;
}
