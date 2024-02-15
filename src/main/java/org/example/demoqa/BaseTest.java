package org.example.demoqa;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest extends WebDriverManager {
    protected Actions actions;

    @BeforeClass
    public void setUp() {
        initChromeDriver();
        actions = new Actions(driver);
    }

    @AfterClass
    public void tearDown() {
        closeDriver();
    }



}
