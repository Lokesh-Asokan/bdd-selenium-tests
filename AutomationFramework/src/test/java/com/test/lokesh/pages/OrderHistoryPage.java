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

    public String getOrderReferenceNumber(){
       return orderReferenceNumberColumn.stream().findFirst().toString();
    }

    public String getOrderDate(){
        waitForElementVisible(dateTextColumn.stream().findFirst().get());
        return dateTextColumn.stream().findFirst().toString();
    }



}
