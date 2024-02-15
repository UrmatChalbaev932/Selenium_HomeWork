import org.example.ui.data.EmployeeEntityFaker;
import org.example.ui.data.LoginUserEntityFaker;
import org.example.ui.drivers.Driver;
import org.example.ui.entity.EmployeeEntity;
import org.example.ui.entity.LoginUserEntity;
import org.example.ui.helper.DropDownHelper;
import org.example.ui.helper.WebElementHelper;
import org.example.ui.page.LoginPage;
import org.example.ui.page.SelectMenuPage;
import org.example.ui.page.WebTablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.example.ui.entity.EmployeeEntity.getEmployeesFromTable;

public class DemoTest extends BasePageTest {

    @Test
    void WebTablePage() {
        openTheSite("https://demoqa.com/webtables");

        // метод для создания обьектов
        EmployeeEntity randomEmployee = EmployeeEntityFaker.createNewEmployeeWithFakeData();
        // создали обьект для вызова метода
        WebTablePage webTablePage = new WebTablePage(driver);
        // вызвали метод инициализации
        webTablePage.fillUpTheForm(randomEmployee);

        List<EmployeeEntity> employees = getEmployeesFromTable(Driver.getDriver());

        employees.forEach(System.out::println);

    }

    @Test
    void user() throws InterruptedException {
        openTheSite("https://demoqa.com/login");

        LoginUserEntity loginUserEntity = LoginUserEntityFaker.createNewUserWithFakeData();
        LoginPage loginPage = new LoginPage();

        loginPage
                .clickNewUserBtn()
                .registerToBookStoreWithFilledForm(loginUserEntity)
                .clickCheckBox()
                .clickRegisterBtn()
                .waitMoment(10000)
                .acceptAlert()
                .clickBackToLoginBtn()
                .loginInBookStore(loginUserEntity)
                .clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
        System.out.println(loginUserEntity);

    }
    @Test
    void selectTest() throws InterruptedException {
        openTheSite("https://demoqa.com/select-menu");
        SelectMenuPage selectMenuPage = new SelectMenuPage();
        WebElementHelper webElementHelper = new WebElementHelper();
        DropDownHelper dropDownHelper = new DropDownHelper();
        dropDownHelper.selectByText(selectMenuPage.oldStyleSelectMenu, "Green");
        System.out.println(dropDownHelper.getAllDropDownValues(selectMenuPage.oldStyleSelectMenu));
        //List<String> list = webElementHelper.getAllDropDownValues(selectMenuPage.oldStyleSelectMenu);
        //list.forEach(System.out:: println);

        webElementHelper.sendKeysWithEnter(selectMenuPage.selectValueInput, "Pro");
        Thread.sleep(5000);
     }
}