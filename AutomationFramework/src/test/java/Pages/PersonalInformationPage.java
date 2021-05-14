package Pages;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PersonalInformationPage extends BasePage {

    private WebDriver driver = Driver.getDriver();

    public PersonalInformationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="firstname")
    private WebElement firstNameInputBox;

    @FindBy(id="old_passwd")
    private WebElement currentPasswordInputBox;

    @FindBy(css="button[name='submitIdentity']")
    private WebElement saveButton;

    @FindBy(css ="p.alert.alert-success")
    private WebElement updateConfirmation;

    @FindBy(css = "a[title='View my customer account']")
    private WebElement accountName;

    public void clearAndEnterFirstName(String name){
        clearElement(firstNameInputBox);
        setTextAs(firstNameInputBox, name);
    }

    public void enterPassword(String password){
        setTextAs(currentPasswordInputBox, password);
    }

    public void clickSaveButton(){
        clickElement(saveButton);
    }

    public String getConfirmation(){
        return getText(updateConfirmation);
    }

    public String getAccountName(){
        return getText(accountName);
    }

}
