package org.example.demoqa.mouseInterection;

import org.example.demoqa.BaseTest;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.findElementById;
import static org.example.demoqa.WebElementManager.findElementByXpath;
import static org.testng.Assert.assertEquals;

public class CheckBox extends BaseTest {

    @Test(description = "select home directory test", groups = "CheckBox", priority = 0)
    void select_home_directory_test() throws InterruptedException {
        openTheSite("https://demoqa.com/checkbox");
        actions.click(findElementByXpath("//span[text()='Home']")).perform();
        assertEquals(findElementById("result").getText(), "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
        actions.click(findElementByXpath("//span[text()='Home']")).perform();

    }

    @Test(description = "open home directory test", groups = "CheckBox", priority = 1)
    void open_home_directory_test() {
        actions.click(findElementByXpath("(//button[@aria-label=\"Toggle\"])[1]")).perform();
        assertEquals(findElementByXpath("(//ol)[2]").getText(), "Desktop\n" +
                "Documents\n" +
                "Downloads");

    }

    @Test(description = "select desktop directory test", groups = "CheckBox", priority = 2)
    void select_desktop_directory_test() {
        actions.click(findElementByXpath("//span[text()='Desktop']")).perform();
        assertEquals(findElementById("result").getText(), "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");
        actions.click(findElementByXpath("//span[text()='Desktop']")).perform();
    }

    @Test(description = "open desktop directory test", groups = "CheckBox", priority = 3)
    void open_desktop_directory_test() {
        actions.click(findElementByXpath("(//button[@aria-label=\"Toggle\"])[2]")).perform();
        assertEquals(findElementByXpath("(//ol)[3]").getText(), "Notes\n" +
                "Commands");
    }

    @Test(description = "select notes file test", groups = "CheckBox", priority = 4)
    void select_notes_file_test() {
        actions.click(findElementByXpath("//span[text()='Notes']")).perform();
        assertEquals(findElementById("result").getText(), "You have selected :\n" +
                "notes");
    }

    @Test(description = "select commands file test", groups = "CheckBox", priority = 5)
    void select_Commands_file_test() {
        actions.click(findElementByXpath("//span[text()='Commands']")).perform();
        assertEquals(findElementById("result").getText(), "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");
    }

    @Test(dependsOnMethods = "select_Commands_file_test")
    void closeDesktop(){
        actions.click(findElementByXpath("//span[text()='Desktop']")).perform();
        actions.click(findElementByXpath("(//button[@aria-label=\"Toggle\"])[2]")).perform();
    }

    @Test(description = "select document directory test", groups = "CheckBox", priority = 6)
    void select_document_directory_test() {
        actions.click(findElementByXpath("//span[text()='Documents']")).perform();
        assertEquals(findElementById("result").getText(), "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general");
        actions.click(findElementByXpath("//span[text()='Documents']")).perform();
    }

    @Test(description = "open document directory test", groups = "CheckBox", priority = 7)
    void open_document_directory_test() {
        actions.click(findElementByXpath("(//button[@aria-label=\"Toggle\"])[3]")).perform();
        assertEquals(findElementByXpath("(//ol)[3]").getText(), "WorkSpace\n" +
                "Office");
    }


}
