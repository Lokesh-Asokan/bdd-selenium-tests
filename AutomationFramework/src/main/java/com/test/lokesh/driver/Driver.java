package com.test.lokesh.driver;

import com.test.lokesh.common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver extends BasePage {
    DriverFactory driverFactory;

    public static WebDriver driver;

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

    public static void tearDown(Scenario scenario){
        log.info("System quit and be happy dude");
        takeScreenshot(scenario);
        driver.manage().deleteAllCookies();
       // getDriver().close();
        getDriver().quit();
        log.info("Driver closed");
    }

    public void open(String url) {
        log.info("Open url" + url);
        driver.get(url);
    }

    public static void takeScreenshot(Scenario scenario){
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report.
            scenario.attach(screenshot, "image/png", scenario.getName());
           // scenario.embed(screenshot, "image/png");
        }
    }

    /**
     * Gets the title of the current page.
     *
     * @return The title of the current page
     */


}
