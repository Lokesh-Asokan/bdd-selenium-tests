package Pages;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
    private WebDriver driver = Driver.getDriver();

    public CheckoutPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "processAddress")
    private WebElement address_proceedToCheckButton;

    @FindBy(css = "button[name='processCarrier']")
    private WebElement shipping_proceedToCheckButton;

    @FindBy(css = "p.checkbox>div")
    private WebElement termsOfServiceCheckBox;

    @FindBy(css = "a[title='Pay by check.']")
    private WebElement payByCheckModule;

    @FindBy(css = "p[id='cart_navigation']>button[type='submit']")
    private WebElement confirmOrderButton;

    public void clickAddressProceedToCheckoutButton(){
        clickElement(address_proceedToCheckButton);
    }

    public void clickTermsOfServiceCheckBox(){
        waitForElementClickable(termsOfServiceCheckBox);
        clickElement(termsOfServiceCheckBox);
    }

    public void clickShippingProceedToCheckoutButton(){
        clickElement(shipping_proceedToCheckButton);

    }

    public void clickPayByCheckModule(){
        clickElement(payByCheckModule);
    }

    public void clickConfirmMyOrderButton(){
        clickElement(confirmOrderButton);
    }

}

