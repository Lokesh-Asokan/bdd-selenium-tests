package com.test.lokesh.hooks;

import com.test.lokesh.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@hooks_web")
    public void openWebSite() throws Throwable {
       // Driver.getDriver();
    }

    @After("@hooks_web")
    public void clearCookies() throws Exception {
      // Driver.closeDriver();
    }

}
