import org.example.ui.helper.FrameHelper;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.findElementById;

public class FramePageTest extends BaseTestClass{
    @Test
    void test(){
        openTheSite();
        FrameHelper frameHelper = new FrameHelper(driver);
        frameHelper.switchToFrame(findElementById("frame1"));
        System.out.println(findElementById("sampleHeading").getText());
    }
}
