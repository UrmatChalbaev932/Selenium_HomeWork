
import org.example.ui.page.NestedFramesPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;

public class NestedFramesPageTest extends BasePageTest {
    @Test(description = "Verify Navigation and Interaction with Nested Iframes", priority = 0)
    void Verify_Navigation_and_Interaction_with_Nested_Iframes() {
        openTheSite("https://demoqa.com/nestedframes");
        NestedFramesPage nestedFramesPage = new NestedFramesPage();
        nestedFramesPage.switchToParentFrame();
        Assert.assertEquals(findElementByXpathGetText("//body"),"Parent frame");
        nestedFramesPage.switchToChildFrame();
        Assert.assertEquals(findElementByXpathGetText("//body/p"),"Child Iframe");

    }
}
