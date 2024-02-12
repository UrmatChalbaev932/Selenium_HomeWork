import org.example.demoqa.WebElementManager;
import org.example.ui.config.ConfigReader;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTestClass {
    public static WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        openTheSite();
    }

    @AfterClass
    void TearDown() {
        Driver.closeDriver();
    }

    public static void openTheSite() {
        driver.get(ConfigReader.getValue("baseUrl"));
    }

}
