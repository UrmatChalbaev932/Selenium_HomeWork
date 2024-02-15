package org.example.ui.page;

import org.example.ui.entity.EmployeeEntity;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.demoqa.WebElementManager.findElementById;

public class WebTablePage {
    private WebDriver driver;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebTablePage fillUpTheForm(EmployeeEntity employee) {
        WebElementHelper webElementHelper = new WebElementHelper();
        webElementHelper.click(driver.findElement(By.id("addNewRecordButton")))
                .sendKey(findElementById("firstName"), employee.getFirstName())
                .sendKey(findElementById("lastName"), employee.getLastName())
                .sendKey(findElementById("userEmail"), employee.getEmail())
                .sendKey(findElementById("age"), String.valueOf(employee.getAge()))
                .sendKey(findElementById("salary"), String.valueOf(employee.getSalary()))
                .sendKey(findElementById("department"), employee.getDepartment())
                .click(findElementById("submit"));
    return this;
    }
}
