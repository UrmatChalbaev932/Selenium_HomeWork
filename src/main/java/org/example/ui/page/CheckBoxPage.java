package org.example.ui.page;

import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    WebElementHelper webElementHelper = new WebElementHelper();

    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //allBtn
    @FindBy(xpath = "//button[@class='rct-option rct-option-expand-all']")
    public WebElement expandAllBtn;
    @FindBy(xpath = "//button[@class='rct-option rct-option-collapse-all']")
    public WebElement collapseAllBtn;


    //direct home
    @FindBy(xpath = "//span[text()='Home']")//ok
    public WebElement selectDirectHome;
    @FindBy(xpath = "//label[@for='tree-node-home']/parent::span/button")//ok
    public WebElement openDirectHome;

    //direct desktop
    @FindBy(xpath = "//span[text()='Desktop']")//ok
    public WebElement selectDirectDesktop;
    @FindBy(xpath = "//label[@for='tree-node-desktop']/parent::span/button")//ok
    public WebElement openDirectDesktop;

    //file notes
    @FindBy(xpath = "//span[text()='Notes']")
    public WebElement selectFileNotes;
    //file commands
    @FindBy(xpath = "//span[text()='Commands']")
    public WebElement selectFileCommands;

    //direct document
    @FindBy(xpath = "//span[text()='Documents']")
    public WebElement selectDirectDocuments;
    @FindBy(xpath = "//label[@for='tree-node-documents']/parent::span/button")
    public WebElement openDirectDocuments;

    //direct workspace
    @FindBy(xpath = "//span[text()='WorkSpace']")
    public WebElement selectDirectWorkSpace;
    @FindBy(xpath = "//label[@for='tree-node-workspace']/parent::span/button")
    public WebElement openDirectWorkSpace;

    //file react
    @FindBy(xpath = "//span[text()='React']")
    public WebElement selectFileReact;
    //file angular
    @FindBy(xpath = "//span[text()='Angular']")
    public WebElement selectFileAngular;
    //file veu
    @FindBy(xpath = "//span[text()='Veu']")
    public WebElement selectFileVeu;

    //direct office
    @FindBy(xpath = "//span[text()='Office']")
    public WebElement selectDirectOffice;
    @FindBy(xpath = "//label[@for='tree-node-office']/parent::span/button")
    public WebElement openDirectOffice;

    // file public
    @FindBy(xpath = "//span[text()='Public']")
    public WebElement selectFilePublic;
    // file private
    @FindBy(xpath = "//span[text()='Private']")
    public WebElement selectFilePrivate;
    // file classified
    @FindBy(xpath = "//span[text()='Classified']")
    public WebElement selectFileClassified;
    //file general
    @FindBy(xpath = "//span[text()='General']")
    public WebElement selectFileGeneral;

    //direct downloads
    @FindBy(xpath = "//span[text()='Downloads']")
    public WebElement selectDirectDownloads;
    @FindBy(xpath = "//label[@for='tree-node-downloads']/parent::span/button")
    public WebElement openDirectDownloads;

    //file word.file.doc
    @FindBy(xpath = "//label[@for='tree-node-wordFile']/span[normalize-space()='Word File.doc']")
    public WebElement selectFileWordFileDoc;
    //file exel.file.doc
    @FindBy(xpath = "//label[@for='tree-node-excelFile']/span[normalize-space()='Excel File.doc']")
    public WebElement selectFileExcelFileDoc;


    public CheckBoxPage clickExpandAllBtn() {
        webElementHelper.click(expandAllBtn);
        return this;
    }

    public CheckBoxPage clickCollapseAllBtn() {
        webElementHelper.click(collapseAllBtn);
        return this;
    }

    public CheckBoxPage clickSelectDirectHome() {
        webElementHelper.click(selectDirectHome);
        return this;
    }

    public CheckBoxPage clickOpenDirectHome() {
        webElementHelper.click(openDirectHome);
        return this;
    }

    public CheckBoxPage clickSelectDirectDesktop() {
        webElementHelper.click(selectDirectDesktop);
        return this;
    }

    public CheckBoxPage clickOpenDirectDesktop() {
        webElementHelper.click(openDirectDesktop);
        return this;
    }

    public CheckBoxPage clickSelectFileNotes() {
        webElementHelper.click(selectFileNotes);
        return this;
    }

    public CheckBoxPage clickSelectFileCommands() {
        webElementHelper.click(selectFileCommands);
        return this;
    }

    public CheckBoxPage clickSelectDirectDocuments() {
        webElementHelper.click(selectDirectDocuments);
        return this;
    }

    public CheckBoxPage clickOpenDirectDocuments() {
        webElementHelper.click(openDirectDocuments);
        return this;
    }

    public CheckBoxPage clickSelectDirectWorkSpace() {
        webElementHelper.click(selectDirectWorkSpace);
        return this;
    }

    public CheckBoxPage clickOpenDirectWorkSpace() {
        webElementHelper.click(openDirectWorkSpace);
        return this;
    }

    public CheckBoxPage clickSelectFileReact() {
        webElementHelper.click(selectFileReact);
        return this;
    }

    public CheckBoxPage clickSelectFileAngular() {
        webElementHelper.click(selectFileAngular);
        return this;
    }

    public CheckBoxPage clickSelectFileVeu() {
        webElementHelper.click(selectFileVeu);
        return this;
    }

    public CheckBoxPage clickSelectDirectOffice() {
        webElementHelper.click(selectDirectOffice);
        return this;
    }

    public CheckBoxPage clickOpenDirectOffice() {
        webElementHelper.click(openDirectOffice);
        return this;
    }

    public CheckBoxPage clickSelectFilePublic() {
        webElementHelper.click(selectFilePublic);
        return this;
    }

    public CheckBoxPage clickSelectFilePrivate() {
        webElementHelper.click(selectFilePrivate);
        return this;
    }

    public CheckBoxPage clickSelectFileClassified() {
        webElementHelper.click(selectFileClassified);
        return this;
    }

    public CheckBoxPage clickSelectFileGeneral() {
        webElementHelper.click(selectFileGeneral);
        return this;
    }

    public CheckBoxPage clickSelectDirectDownloads() {
        webElementHelper.click(selectDirectDownloads);
        return this;
    }

    public CheckBoxPage clickOpenDirectDownloads() {
        webElementHelper.click(openDirectDownloads);
        return this;
    }

    public CheckBoxPage clickSelectFileWordFileDoc() {
        webElementHelper.click(selectFileWordFileDoc);
        return this;
    }

    public CheckBoxPage clickSelectFileExcelFileDoc() {
        webElementHelper.click(selectFileExcelFileDoc);
        return this;
    }


}


