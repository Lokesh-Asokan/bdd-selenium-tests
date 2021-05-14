package com.test.lokesh.pages;

import com.test.lokesh.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistoryPage {

    //private WebDriver driver = Driver.getDriver();

    public OrderHistoryPage(){
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(css = "td.history_link.bold.footable-first-column>a")
    private List<WebElement> orderReferenceNumber;

    @FindBy(css = "td[class='history_date bold']")
    private List<WebElement> dateTextBlock;

    @FindBy(css = "td[class='history_price']")
    private List<WebElement> orderPrice;

    public void getOrderReferenceNumber(){

        String []linkText =new String[orderReferenceNumber.size()];
        int i=0;
        for(WebElement e : orderReferenceNumber){
             linkText[i] = e.getText();
        }

    }



}
