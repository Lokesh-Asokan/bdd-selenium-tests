package driver;

import common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver extends BasePage {
    DriverFactory driverFactory;

    public static WebDriver driver;

    @Before
    public static void initializeDriver(){
            System.out.println("I am the driver dude");
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
    public void closeDriver(){
            System.out.println("System quit and be happy dude");
        getDriver().quit();
        log.info("Driver closed");
    }
    public static void open(String url) {
        System.out.println("Open url");
        getDriver().get(url);
    }

    public static String currentUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Gets the title of the current page.
     *
     * @return The title of the current page
     */
    public static String title() {
        System.out.println("get your title");
        return getDriver().getTitle();
    }

    public static void back() {
        getDriver().navigate().back();
    }

    public static void forward() {
        getDriver().navigate().forward();
    }

    public static void refresh() {
        getDriver().navigate().refresh();
    }

}
