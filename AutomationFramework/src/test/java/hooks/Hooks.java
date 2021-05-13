package hooks;

import common.BasePage;
import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ReadProperties;
import utils.URLMapper;

public class Hooks extends BasePage {

    Driver driver = new Driver();

    @Before("@test")
    public void openWebSite() throws Throwable {
        driver.open(ReadProperties.getFromPropertyFile("base_URL"));
    }

    @After
    public void letsShutdown(){
        //ToDo
    }
}
