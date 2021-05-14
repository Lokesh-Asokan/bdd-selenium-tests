package com.test.lokesh.stepDefs;

import com.test.lokesh.driver.Driver;
import io.cucumber.java.en.Given;
import com.test.lokesh.mission.LoginMission;
import com.test.lokesh.utils.ReadProperties;
import com.test.lokesh.utils.URLMapper;

public class LoginStepDef {

    private Driver driver = new Driver();
    private LoginMission loginMission = new LoginMission();
    private String username = ReadProperties.getFromPropertyFile("username");
    private String password = ReadProperties.getFromPropertyFile("password");

    @Given("I Launch the order portal website")
    public void i_launch_the_order_portal_website() {
        driver.open(URLMapper.urlBuilder("login"));
    }

    @Given("I login to the application with valid credentials")
    public void i_login_to_the_application_with_valid_credentials() {
        loginMission.performLogin(username, password);
        driver.open(URLMapper.urlBuilder("gallery"));
    }

    @Given("I login to the application with valid {string} and {string}")
    public void i_login_to_the_application_with_valid_and(String loginID, String passwd) {
        System.out.println(ReadProperties.getFromPropertyFile(loginID));
        System.out.println(ReadProperties.getFromPropertyFile(passwd));
        loginMission.performLogin(ReadProperties.getFromPropertyFile(loginID), ReadProperties.getFromPropertyFile(passwd));

    }

}
