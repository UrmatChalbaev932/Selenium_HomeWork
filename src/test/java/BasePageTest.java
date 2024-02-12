import org.example.ui.config.ConfigReader;
import org.example.ui.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BasePageTest {
    public static WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    @AfterClass
    void TearDown() {
        Driver.closeDriver();
    }

    public static void openTheSite(String URL) {
        driver.get(URL);
    }

}
