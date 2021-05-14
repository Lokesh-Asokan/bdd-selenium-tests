package com.test.lokesh.mission;

import com.test.lokesh.pages.CartPage;
import com.test.lokesh.pages.CheckoutPage;
import com.test.lokesh.pages.GalleryPage;

public class OrderMission {

    private GalleryPage galleryPage = new GalleryPage();
    private CartPage cartPage = new CartPage();
    private CheckoutPage checkoutPage = new CheckoutPage();

    public void selectTshirtFromGallery(){
        galleryPage.hoverAndClickOnAddToCard();
        galleryPage.clickProceedToCheckoutButton();
        cartPage.clickProceedToCheckoutButton();
    }

    public void proceedToConfirmationPage(){
        checkoutPage.clickAddressProceedToCheckoutButton();
        checkoutPage.clickTermsOfServiceCheckBox();
        checkoutPage.clickShippingProceedToCheckoutButton();
        checkoutPage.clickPayByCheckModule();
        checkoutPage.clickConfirmMyOrderButton();
    }

}
