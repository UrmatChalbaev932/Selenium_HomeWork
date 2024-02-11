import org.example.demoqa.WebElementManager;
import org.example.ui.page.TextBoxPage;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;
import static org.testng.Assert.assertEquals;

public class TextBoxPageTest extends BaseTestClass {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test (description = "fill up the form positive test", priority = 0)
    void fill_up_the_form_positive_test(){
        openTheSite();
        textBoxPage.fillUpFullName("Test")
                .fillUpEmail("Test@gmail.com")
                .fillUpCurrentAddress("Test city test street test house test apartment test apartment test")
                .fillUpPermanentAddress("Test city test street test house test apartment test apartment test")
                .clickSubmitBtn();
        assertEquals(findElementByIdGetAttribute("userName"), "Test");
        assertEquals(findElementByIdGetAttribute("userEmail"), "Test@gmail.com");
        assertEquals(findElementByIdGetAttribute("currentAddress"), "Test city test street test house test apartment test apartment test");
        assertEquals(findElementByIdGetAttribute("permanentAddress"), "Test city test street test house test apartment test apartment test");
        assertEquals(WebElementManager.findElementByXpathGetText("//div[@class='border col-md-12 col-sm-12']"), "Name:Test\n" +
                "Email:Test@gmail.com\n" +
                "Current Address :Test city test street test house test apartment test apartment test\n" +
                "Permananet Address :Test city test street test house test apartment test apartment test");

    }
    @Test (description = "fill up the form negative test with empty field", priority = 1)
    void fill_up_the_form_negative_test(){
        openTheSite();
        textBoxPage.fillUpFullName("")
                .fillUpEmail("")
                .fillUpCurrentAddress("")
                .fillUpPermanentAddress("")
                .clickSubmitBtn();
        assertEquals(findElementByIdGetAttribute("userName"), "");
        assertEquals(findElementByIdGetAttribute("userEmail"), "");
        assertEquals(findElementByIdGetAttribute("currentAddress"), "");
        assertEquals(findElementByIdGetAttribute("permanentAddress"), "");
        assertEquals(findElementByXpath("//div[@class='col-md-12 col-sm-12']").getAttribute("class"), "col-md-12 col-sm-12");

    }
}
