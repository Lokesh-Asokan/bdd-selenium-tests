package com.test.lokesh.pages;

import com.test.lokesh.common.BasePage;
import com.test.lokesh.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConfirmationPage extends BasePage {
    private WebDriver driver = Driver.getDriver();
    public String paymentPrice="";
    public String orderReferenceNumber="";

    public ConfirmationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span[class='price'] > strong")
    private WebElement paymentAmountTextBlock;

    @FindBy(css = "div.box.order-confirmation")
    private WebElement orderReferenceTextBlock;

    public String getExpectedPaymentAmount(){
        return paymentPrice;
    }
    public void getPaymentText(){
         paymentPrice = getText(paymentAmountTextBlock);
    }

    public String getorderReferenceTextBlock(){
        String ref =getText(orderReferenceTextBlock);
        String temp[] = ref.split("-");
        String finalTemp[] = temp[4].split(" ");
        orderReferenceNumber = finalTemp[9].replace(".","");
         return orderReferenceNumber;
    }

    public String getExpectedorderReferenceNumber(){
        return orderReferenceNumber;
    }

    public String getExpectedOrderDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now is here-----"+now);
        return  dtf.format(now);
    }

}
