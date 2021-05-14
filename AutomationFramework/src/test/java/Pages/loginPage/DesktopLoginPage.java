package Pages.loginPage;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopLoginPage extends BasePage implements LoginPage {

    private WebDriver driver = Driver.getDriver();

    public DesktopLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailInputBox;

    @FindBy(id = "passwd")
    private WebElement passwordInputBox;

    @FindBy(id="SubmitLogin")
    private WebElement submitButton;

    @Override
    public void enterUserName (String email){
        setTextAs(emailInputBox, email);
    }

    @Override
    public void enterPassword (String password){
        setTextAs(passwordInputBox, password);
    }

    @Override
    public void clickLoginButton (){
        clickElement(submitButton);
    }
}
