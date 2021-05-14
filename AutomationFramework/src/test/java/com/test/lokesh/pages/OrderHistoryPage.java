package com.test.lokesh.pages;

import com.test.lokesh.common.BasePage;
import com.test.lokesh.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistoryPage extends BasePage {

    private WebDriver driver = Driver.getDriver();

    public OrderHistoryPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "td.history_link.bold.footable-first-column>a")
    public List<WebElement> orderReferenceNumberColumn;

    @FindBy(css = "td[class='history_date bold']")
    public List<WebElement> dateTextColumn;

    @FindBy(css = "td[class='history_price']")
    public List<WebElement> totalPriceColumn;

    public String getActualOrderReferenceNumber(){
        String orderRefNumber = "";
        for(int i=0; i<orderReferenceNumberColumn.size();i++){
            orderRefNumber = dateTextColumn.get(0).getText();
        }
        return orderRefNumber;
    }

    public String getOrderDate(){
        String date = "";
        for(int i=0; i<dateTextColumn.size();i++){
            date = dateTextColumn.get(0).getText();
        }
        return date;
    }

    public String getActualPriceColumn(){
        String price = "";
        for(int i=0; i<totalPriceColumn.size();i++){
            price = totalPriceColumn.get(0).getText();
        }
        return price;
    }


}
