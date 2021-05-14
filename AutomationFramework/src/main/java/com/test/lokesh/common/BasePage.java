package com.test.lokesh.common;

import com.test.lokesh.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.*;
import org.slf4j.LoggerFactory;

public class BasePage {

    protected  static final Logger log = LoggerFactory.getLogger(BasePage.class.getName());
    private WebDriver driver = Driver.driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    /* try {
        properties.load(new FileInputStream("src/main/resources/env.properties"));
    } catch (IOException e) {
        log.error("Please review your properties file");
    }*/

    protected void waitForElementClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementClickable(WebElement element, int sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void setTextAs(WebElement element, String text){
        waitForElementClickable(element);
        element.sendKeys(text);
    }

    protected void clearElement(WebElement element){
        waitForElementClickable(element);
        element.clear();
    }

    protected void clickElement(WebElement element){
        waitForElementClickable(element);
        element.click();
    }

    protected void clickElementByJavascriptExecutor(String xpath){
        WebElement element=driver.findElement(By.xpath(xpath));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", element);
    }

    protected void clickLink(WebElement element){
        waitForElementVisible(element);
        element.click();
    }

    protected String getText(WebElement element){
        waitForElementVisible(element);
        return element.getText();
    }

    protected void hoverAndClick(WebElement element, WebElement subelement){
        Actions action = new Actions(driver);
        waitForElementVisible(element);
        action.moveToElement(element).perform();
        waitForElementVisible(subelement);
        action.moveToElement(subelement).click().build().perform();
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
