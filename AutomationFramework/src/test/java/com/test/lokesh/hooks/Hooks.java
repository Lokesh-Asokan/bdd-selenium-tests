package com.test.lokesh.hooks;

import com.test.lokesh.driver.Driver;
import com.test.lokesh.utils.URLMapper;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void openWebSite() throws Throwable {
       Driver.initializeDriver();
    }

    @After
    public void quitDriver(Scenario scenario) throws Exception {
        Driver.tearDown(scenario);
    }

    @AfterStep
    public void takeScreenshotEachStep(Scenario scenario) throws Exception {
        Driver.takeScreenshot(scenario);
    }
}
