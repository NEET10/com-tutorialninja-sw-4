package com.tutorialsninja.testbase;

import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeTest

    public void setUp(){
        selectBrowser(browser);

    }
    @AfterTest
    public void tearDown(){
        closeBrowser();

    }
}
