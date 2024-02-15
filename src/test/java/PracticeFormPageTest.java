import org.example.ui.drivers.Driver;
import org.example.ui.helper.BrowserManager;
import org.example.ui.helper.PracticeFormPage;
import org.testng.annotations.Test;

public class PracticeFormPageTest {

    @Test
    void demo123(){
        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        practiceFormPage.selectDateMonthYear("5 March 2015");
    }
}