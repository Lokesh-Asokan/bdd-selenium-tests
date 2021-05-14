package stepdefs;

import Pages.MyAccountPage;
import Pages.PersonalInformationPage;
import context.Context;
import driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mission.MyAccountMission;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ReadProperties;
import utils.URLMapper;

import java.util.Locale;

public class MyAccountStepDef {

    private MyAccountPage myAccountPage = new MyAccountPage();
    private Context context = new Context();
    private MyAccountMission myAccountMission = new MyAccountMission();
    private PersonalInformationPage personalInformationPage = new PersonalInformationPage();
    private static final String FIRSTNAME = "something";
    private static final String PAASSWORD = ReadProperties.getFromPropertyFile("password");
    private Driver driver = new Driver();

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
        context.getContextParam("actualCardCount");
    }

}
