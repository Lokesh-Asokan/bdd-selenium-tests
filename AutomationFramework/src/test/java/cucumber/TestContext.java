package cucumber;

import driver.Driver;

public class TestContext {
    private Driver driver;

    public TestContext (){
        driver = new Driver();
    }

    public Driver getWebDriverInstance(){
        return driver;
    }

}
