
import org.example.ui.page.CheckBoxPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.demoqa.WebElementManager.*;


public class CheckBoxPageTest extends BaseTestClass {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test(description = "check the functionality responsible for opening the directory", priority = 0)
    void check_the_functionality_responsible_for_opening_the_directory() {
        openTheSite();
        checkBoxPage
                .clickOpenDirectHome()
                .clickOpenDirectDesktop()
                .clickOpenDirectDocuments()
                .clickOpenDirectWorkSpace()
                .clickOpenDirectOffice()
                .clickOpenDirectDownloads();

        Assert.assertEquals(findElementByXpathGetText("//div[@class='col-12 mt-4 col-md-6']"), "Home\n" +
                "Desktop\n" +
                "Notes\n" +
                "Commands\n" +
                "Documents\n" +
                "WorkSpace\n" +
                "React\n" +
                "Angular\n" +
                "Veu\n" +
                "Office\n" +
                "Public\n" +
                "Private\n" +
                "Classified\n" +
                "General\n" +
                "Downloads\n" +
                "Word File.doc\n" +
                "Excel File.doc");
    }

    @Test(description = "check functionality, directory and file selection", priority = 1)
    void check_functionality_directory_and_file_selection() {
        checkBoxPage

                .clickSelectFileNotes()
                .clickSelectFileCommands()
                .clickSelectFileReact()
                .clickSelectFileAngular()
                .clickSelectFileVeu()
                .clickSelectFilePublic()
                .clickSelectFilePrivate()
                .clickSelectFileClassified()
                .clickSelectFileGeneral()
                .clickSelectFileWordFileDoc()
                .clickSelectFileExcelFileDoc();
        Assert.assertEquals(findElementByIdGetText("result"), "You have selected :\n" +
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
    }

}
