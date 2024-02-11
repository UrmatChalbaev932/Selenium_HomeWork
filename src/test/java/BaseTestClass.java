import org.example.ui.config.ConfigReader;
import org.example.ui.drivers.Driver;
import org.example.ui.helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTestClass {
    public static WebDriver driver;

    @BeforeClass
    public void  setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }
    @AfterClass
    void TearDown(){
        driver.close();
        driver.quit();
    }
    public static void openTheSite(){
        driver.get(ConfigReader.getValue("baseUrl"));
    }
}
