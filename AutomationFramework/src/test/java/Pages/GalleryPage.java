package Pages;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalleryPage extends BasePage {

    private WebDriver driver = Driver.getDriver();

    public GalleryPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li div[class='product-container']")
    private WebElement tshirtOverlay;

    @FindBy(css = "a[title='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public void hoverAndClickOnAddToCard(){
        hoverAndClick(tshirtOverlay, addToCartButton);
    }

    public void clickProceedToCheckoutButton(){
        clickElement(proceedToCheckoutButton);
    }
}
