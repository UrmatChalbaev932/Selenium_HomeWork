import org.example.demoqa.WebElementManager;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.FrameHelper;
import org.example.ui.page.FramePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;
import static org.testng.Assert.assertEquals;

public class FramePageTest extends BasePageTest {
    FramePage framePage = new FramePage();
    FrameHelper frameHelper = new FrameHelper(Driver.getDriver());
    @Test (description = "Switch between parent frame and two nested frames", priority = 0)
    void Switch_between_parent_frame_and_two_nested_frames(){
        openTheSite("https://demoqa.com/frames");
        framePage.switchToBigFrame();
        Assert.assertEquals(findElementByIdGetText("sampleHeading"),"This is a sample page");
        framePage.switchToParentFrame();
        framePage.switchSmallFrame();
        Assert.assertEquals(findElementByIdGetText("sampleHeading"),"This is a sample page");
    }
}