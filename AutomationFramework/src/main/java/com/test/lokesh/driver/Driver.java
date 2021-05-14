package com.test.lokesh.driver;

import com.test.lokesh.common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver extends BasePage {
    DriverFactory driverFactory;

    public static WebDriver driver;

   @Before
    public static void initializeDriver(){
        log.info("Initiating the Driver");
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        if (driver == null){
            initializeDriver();
        }
        return driver;
    }

   @After
    public static void closeDriver(){
        log.info("System quit and be happy dude");
        driver.manage().deleteAllCookies();
        getDriver().close();
        getDriver().quit();
        log.info("Driver closed");
    }

    public void open(String url) {
        log.info("Open url" + url);
        driver.get(url);
    }

    /**
     * Gets the title of the current page.
     *
     * @return The title of the current page
     */


}
