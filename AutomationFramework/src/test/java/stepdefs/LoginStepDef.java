package stepdefs;

import driver.Driver;
import io.cucumber.java.en.Given;
import utils.URLMapper;

public class LoginStepDef {

    @Given("I Launch the order portal website")
    public void i_launch_the_order_portal_website() {
        Driver.open(URLMapper.urlBuilder("login"));
    }

    @Given("I login to the application with valid credentials")
    public void i_login_to_the_application_with_valid_credentials() {

    }

    @Given("I login to the application with valid {string} and {string}")
    public void i_login_to_the_application_with_valid_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
