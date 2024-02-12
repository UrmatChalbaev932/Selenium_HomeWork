import org.example.ui.helper.AlertHelper;
import org.example.ui.page.AlertPage;
import org.testng.annotations.Test;
import static org.example.demoqa.WebElementManager.findElementByIdGetText;
import static org.testng.Assert.assertEquals;

public class AlertPageTest extends BasePageTest {
    AlertPage alertPage = new AlertPage();
    AlertHelper alertHelper = new AlertHelper();

    @Test(description = "alert check", priority = 0)
    void alert_check() {
        openTheSite("https://demoqa.com/alerts");
        alertPage.clickAlertButton();
        assertEquals(alertHelper.getTextAlert(), "You clicked a button");
        alertHelper.acceptAlert();
    }

    @Test(description = "checking the alert with a delay of 5 seconds", priority = 1)
    void checking_the_alert_with_a_delay_of_5_seconds() {
        alertPage.clickTimerAlertButton();
        assertEquals(alertHelper.getTextAlert(), "This alert appeared after 5 seconds");
        alertPage.acceptAlert();
    }

    @Test(description = "checking the alert buttons", priority = 2)
    void Checking_the_alert_buttons(){
        alertPage.clickConfirmBtn();
        assertEquals(alertHelper.getTextAlert(),"Do you confirm action?");
        alertPage.dismissAlert();
        assertEquals(findElementByIdGetText("confirmResult"),"You selected Cancel");
        alertPage.clickConfirmBtn();
        assertEquals(alertHelper.getTextAlert(),"Do you confirm action?");
        alertPage.acceptAlert();
        assertEquals(findElementByIdGetText("confirmResult"), "You selected Ok");
    }
    @Test(description = "checking the alert field", priority = 3)
    void checking_the_alert_field() throws InterruptedException {
        alertPage.clickPromBtn();
        assertEquals(alertHelper.getTextAlert(),"Please enter your name");
        alertPage.sendKeysAlert("checking_the_alert_field")
                .acceptAlert();
        assertEquals(findElementByIdGetText("promptResult"),"You entered checking_the_alert_field");
        alertPage.clickPromBtn();
        assertEquals(alertHelper.getTextAlert(),"Please enter your name");
        alertPage.sendKeysAlert("checking_the_alert_field")
                .dismissAlert();
        //тест ?
    }
}

