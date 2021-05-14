package Pages;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    private WebDriver driver = Driver.getDriver();

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[title='Orders']")
    private WebElement orderHistoryButton;

    @FindBy(css = "a[title='Information']")
    private WebElement personalInformationButton;

    public void clickorderHistoryButton(){
        clickElement(orderHistoryButton);
    }

    public void clickMyPersonalInformatonButton(){
        clickElement(personalInformationButton);
    }


}
