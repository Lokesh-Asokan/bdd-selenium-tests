package com.test.lokesh.stepDefs;

import com.test.lokesh.pages.ConfirmationPage;
import com.test.lokesh.pages.MyAccountPage;
import com.test.lokesh.pages.OrderHistoryPage;
import com.test.lokesh.pages.PersonalInformationPage;
import com.test.lokesh.context.Context;
import com.test.lokesh.driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.test.lokesh.mission.MyAccountMission;
import org.junit.Assert;
import com.test.lokesh.utils.ReadProperties;
import com.test.lokesh.utils.URLMapper;

import java.util.Locale;

public class MyAccountStepDef {

    private MyAccountPage myAccountPage = new MyAccountPage();
    private Context context = new Context();
    private MyAccountMission myAccountMission = new MyAccountMission();
    private PersonalInformationPage personalInformationPage = new PersonalInformationPage();
    private OrderHistoryPage orderHistoryPage= new OrderHistoryPage();
    private static final String FIRSTNAME = "something";
    private static final String PAASSWORD = ReadProperties.getFromPropertyFile("password");
    private Driver driver = new Driver();
    private ConfirmationPage confirmationPage = new ConfirmationPage();

    @When("I naviagte to personal information page")
    public void i_naviagte_to_personal_information_page() {
        driver.open(URLMapper.urlBuilder("myaccount"));
        myAccountPage.clickMyPersonalInformatonButton();
    }

    @When("I update the first name field")
    public void i_update_the_first_name_field() {
        myAccountMission.updateFirstName(FIRSTNAME, PAASSWORD);
        context.setContextParam("expectedFirstName", FIRSTNAME);
    }

    @When("I save the information")
    public void i_save_the_information() {
        personalInformationPage.clickSaveButton();
    }

    @Then("I Should see the personal information update for first name is successful")
    public void i_should_see_the_personal_information_update_for_first_name_is_successful() {
        Assert.assertTrue("Personal information update was not successful", personalInformationPage.getConfirmation().contains("Your personal information has been successfully updated."));
        Assert.assertTrue("Newly Update first name is not reflecting", personalInformationPage.getAccountName().toLowerCase(Locale.ROOT).contains(context.getContextParam("expectedFirstName")));
    }

    @When("I view my order history")
    public void i_view_my_order_history() {
        driver.open(URLMapper.urlBuilder("myaccount"));
        myAccountPage.clickorderHistoryButton();
    }

    @Then("I should see my relavant order details of my current purchase")
    public void i_should_see_my_relavant_order_details_of_my_current_purchase() {
       Assert.assertTrue("Order price does not match the expected result", orderHistoryPage.getActualPriceColumn().contains(confirmationPage.getExpectedPaymentAmount()));
       Assert.assertTrue("Order Reference number from the table is not same", orderHistoryPage.getOrderDate().contains(confirmationPage.getExpectedOrderDate()));
       Assert.assertTrue("Order Reference number from the table is not same", orderHistoryPage.getActualOrderReferenceNumber().contains(confirmationPage.getExpectedorderReferenceNumber()));
    }

}
