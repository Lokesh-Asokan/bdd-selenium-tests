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

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static void initializeDriver(){
        log.info("Initiating the Driver");
        driver.set(DriverFactory.getDriver());
        driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver(){
        if (driver.get() == null){
            initializeDriver();
        }
        return driver.get();
    }

    public static void tearDown(Scenario scenario){
        log.info("System quit and be happy dude");
        if(scenario.isFailed()){
            takeScreenshot(scenario);
        }
        driver.get().manage().deleteAllCookies();
       // getDriver().close();
        getDriver().quit();
        log.info("Driver closed");
    }

    public void open(String url) {
        log.info("Open url" + url);
        driver.get().get(url);
    }

    public static void takeScreenshot(Scenario scenario){
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.BYTES);
            // embed it in the report.
            scenario.attach(screenshot, "image/png", "take screenshot");
           // scenario.embed(screenshot, "image/png");
    }

    /**
     * Gets the title of the current page.
     *
     * @return The title of the current page
     */


}
