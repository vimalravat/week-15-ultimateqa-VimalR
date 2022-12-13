package com.ultimateqa.testbase;

import com.ultimateqa.propertyreader.PropertyReader;
import com.ultimateqa.utility.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

 //   @AfterMethod
  //  public void tearDown(){
   //     closeBrowser();
 //   }
}
