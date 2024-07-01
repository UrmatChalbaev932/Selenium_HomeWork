package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(){
        PageFactory.initElements(driver,this);
    }


}

