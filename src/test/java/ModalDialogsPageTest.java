import org.example.ui.drivers.Driver;
import org.example.ui.page.ModalDialogsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.demoqa.WebElementManager.findElementByXpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;

public class ModalDialogsPageTest extends BasePageTest {
    ModalDialogsPage modalDialogsPage = new ModalDialogsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));

    @Test(description = "Verify Small Modal Display on Button Click", priority = 0)
    void Verify_Small_Modal_Display_on_Button_Click() throws InterruptedException {
        openTheSite("https://demoqa.com/modal-dialogs");
        modalDialogsPage.clickSmallModalBtn();
        Assert.assertTrue(findElementByXpath("//div[@class='modal-content']").isDisplayed(),"modal window is not open");
        Assert.assertEquals(modalDialogsPage.smallModalText.getText(), "This is a small modal. It has very less content");
        modalDialogsPage.clickSmallModalCloseBtn();
        boolean isModalInvisible = wait.until(invisibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
        Assert.assertTrue(isModalInvisible);
    }

    @Test(description = "Verify Large Modal Display on Button Click", priority = 1)
    void Verify_Large_Modal_Display_on_Button_Click() {
        //openTheSite("https://demoqa.com/modal-dialogs");
        modalDialogsPage.clickLargeModalBtn();
        Assert.assertTrue(findElementByXpath("//div[@class='modal-content']").isDisplayed(),"modal window is not open");
        Assert.assertEquals(modalDialogsPage.largeModalText.getText(), "Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's" +
                " standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type " +
                "specimen book. It has survived not only five centuries, but also " +
                "the leap into electronic typesetting, remaining essentially unchanged." +
                " It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with " +
                "desktop publishing software like Aldus PageMaker including versions " +
                "of Lorem Ipsum.");
        modalDialogsPage.clickLargeModalCloseBtn();
        boolean isModalInvisible = wait.until(invisibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
        Assert.assertTrue(isModalInvisible);
    }

}

