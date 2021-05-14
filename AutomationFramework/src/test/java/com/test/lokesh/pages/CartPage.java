package com.test.lokesh.pages;

import com.test.lokesh.common.BasePage;
import com.test.lokesh.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    //private WebDriver driver = Driver.driver;

    public CartPage(){
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(css = "p[class='cart_navigation clearfix']>a[title='Proceed to checkout']")
    private WebElement proceedToCheckButton;

    public void clickProceedToCheckoutButton(){
        clickElement(proceedToCheckButton);
    }


}
