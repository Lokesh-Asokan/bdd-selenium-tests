package Pages;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    private WebDriver driver = Driver.getDriver();

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "p[class='cart_navigation clearfix']>a[title='Proceed to checkout']")
    private WebElement proceedToCheckButton;

    public void clickProceedToCheckoutButton(){
        clickElement(proceedToCheckButton);
    }


}
