import com.google.common.eventbus.AllowConcurrentEvents;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import lombok.EqualsAndHashCode;
import org.example.ui.data.EmployeeEntityFaker;
import org.example.ui.drivers.Driver;
import org.example.ui.entity.EmployeeEntity;
import org.example.ui.helper.DropDownHelper;
import org.example.ui.helper.WebElementHelper;
import org.example.ui.page.CheckBoxPage;
import org.example.ui.page.SelectMenuPage;
import org.example.ui.page.WebTablePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.example.demoqa.WebDriverManager.openTheSite;
import static org.example.demoqa.WebElementManager.findElementByXpathGetText;
import static org.example.ui.entity.EmployeeEntity.getEmployeesFromTable;

public class EmployeesTableTest extends BasePageTest{


    //используем часто
    @Test
    @Feature("название функционала") //*
    @Description("коротное описание функционала") //*
    @Epic("название эпика которому относится наше тестирование")
    @Owner("указываем владельца теста")
    @Severity(SeverityLevel.CRITICAL)
    @Story("указываем ID из задачи в жире")
    @Tag("отмечаем тест -> Smoke")
    @TmsLink("указываем ссылка на тест-кейс")
   // не используем часто
    @AllureId("ID")
    @Flaky// указываем на тест и говорим что он нестабильный //*
    @Issue("указываем инф про БАГ")
    @Link("указываем ссылку на сайт")
    @TmsLink("указываем ссылка на тест-кейс")
    // специально создали чтобы проверить работы smokeSuite.xml
    @Tag("Smoke")
    void test1(){
        System.out.println("1test");
    }
    @Test
    @Tag("Smoke")
    void test2(){
        System.out.println("2test");
    }
    @Test
    @Tag("Regression")
    void test3(){
        System.out.println("3test");
    }

    @Test(description = "check the functionality responsible for opening the directory", priority = 0)
    void check_the_functionality_responsible_for_opening_the_directory() {
        openTheSite("https://demoqa.com/checkbox");
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage
                .clickOpenDirectHome()
                .clickOpenDirectDesktop()
                .clickOpenDirectDocuments()
                .clickOpenDirectWorkSpace()
                .clickOpenDirectOffice()
                .clickOpenDirectDownloads();

        Assert.assertEquals(findElementByXpathGetText("//iv[@class='col-12 mt-4 col-md-6']"), "Home\n" +
                "Desktop\n" +
                "Notes\n" +
                "Commands\n" +
                "Documents\n" +
                "WorkSpace\n" +
                "React\n" +
                "Angular\n" +
                "Veu\n" +
                "Office\n" +
                "Public\n" +
                "Private\n" +
                "Classified\n" +
                "General\n" +
                "Downloads\n" +
                "Word File.doc\n" +
                "Excel File.doc");
    }
}
