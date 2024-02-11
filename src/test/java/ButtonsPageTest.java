import org.example.demoqa.WebElementManager;
import org.example.ui.page.ButtonsPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ButtonsPageTest extends BaseTestClass {
    ButtonsPage buttonsPage = new ButtonsPage();

    @Test(description = "check double click", priority = 0)
    void check_double_click(){
        openTheSite();
        assertEquals(getCurrentUrl(),"https://demoqa.com/buttons");
        buttonsPage
                .doubleClickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='doubleClickMessage']"),"You have done a double click");
    }
    @Test(description = "check right click", priority = 1)
    void check_right_click(){
        buttonsPage
                .rightClickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='rightClickMessage']"),"You have done a right click");
    }
    @Test(description = "check click", priority = 2)
    void check_click() {
        buttonsPage
                .clickBtn();
        assertEquals(findElementByXpathGetText("//p[@id='dynamicClickMessage']"), "You have done a dynamic click");
    }
}
