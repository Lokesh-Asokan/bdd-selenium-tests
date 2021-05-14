package com.test.lokesh.stepDefs;

import com.test.lokesh.pages.ConfirmationPage;
import com.test.lokesh.context.Context;
import com.test.lokesh.driver.Driver;
import io.cucumber.java.en.Given;
import com.test.lokesh.mission.OrderMission;
import com.test.lokesh.utils.URLMapper;

public class CheckoutStepDef {

    private OrderMission orderMission = new OrderMission();
    private Context context = new Context();
    private ConfirmationPage confirmationPage = new ConfirmationPage();
    private Driver driver = new Driver();

    @Given("I ordered Tshirt successfully")
    public void i_ordered_tshirt_successfully() {
        driver.open(URLMapper.urlBuilder("gallery"));
        orderMission.selectTshirtFromGallery();
        orderMission.proceedToConfirmationPage();
        context.setContextParam("actualCardCount", confirmationPage.getPaymentAmount());
        context.setContextParam("orderPlacedTime", confirmationPage.getCurrentOrderDate());
        //context.setContextParam("orderReferenceNumber", confirmationPage.getorderReferenceTextBlock());
    }
}
