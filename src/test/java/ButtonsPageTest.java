import org.example.ui.drivers.Driver;
import org.example.ui.helper.WindowHelper;
import org.example.ui.page.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ButtonsPageTest extends BaseTestClass {
    ButtonsPage buttonsPage = new ButtonsPage();
    WindowHelper windowsHelper = new WindowHelper();

    @Test(description = "check double click", priority = 0)
    void check_double_click() {
        openTheSite();
        assertEquals(getCurrentUrl(), "https://demoqa.com/buttons");
        buttonsPage
                .doubleClickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='doubleClickMessage']"), "You have done a double click");
    }

    @Test(description = "check right click", priority = 1)
    void check_right_click() {
        buttonsPage
                .rightClickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='rightClickMessage']"), "You have done a right click");
    }

    @Test(description = "check click", priority = 2)
    void check_click() {
        buttonsPage
                .clickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='dynamicClickMessage']"), "You have done a dynamic click");
    }
}