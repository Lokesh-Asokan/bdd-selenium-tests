package Pages.loginPage;

import common.BasePage;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfirmationPage extends BasePage {
    private WebDriver driver = Driver.getDriver();

    public ConfirmationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span[class='price'] > strong")
    private WebElement paymentAmountTextBlock;

    @FindBy(css = "div>br:nth-child(7)")
    private WebElement orderReferenceTextBlock;

    public String getPaymentAmount(){
        return getText(paymentAmountTextBlock);
    }

    public String getorderReferenceTextBlock(){
        //Below substing grabs only the order reference number
        String ref =getText(orderReferenceTextBlock);
        return ref.substring(ref.lastIndexOf(" ") + 1, ref.lastIndexOf("."));
    }

    public String getCurrentOrderDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        return  dtf.format(now).toString();
    }


}
