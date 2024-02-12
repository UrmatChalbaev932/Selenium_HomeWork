
import org.example.ui.page.RadioButtonPage;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RadioButtonPageTest extends BasePageTest {
    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test(description = "check yesRadioButton functionality", priority = 0)
    void check_yesRadioButton_functionality() {
        openTheSite("https://demoqa.com/radio-button");
        assertEquals(getCurrentUrl(), "https://demoqa.com/radio-button");
        radioButtonPage
                .clickYesRadioBtn();
        assertTrue(findElementByXpathIsSelected("//input [@id='yesRadio']"));
        assertEquals(findElementByXpathGetText("//span [text()='Yes']"), "Yes");
    }

    @Test(description = "check ImpressiveRadioButton functionality", priority = 1)
    void check_ImpressiveRadioButton_functionality() {
        radioButtonPage
                .clickImpressiveRadioBtn();
        assertTrue(findElementByXpathIsSelected("//input [@id='impressiveRadio']"));
        assertEquals(findElementByXpathGetText("//span [text()='Impressive']"), "Impressive");
    }
}
