package mission;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.GalleryPage;

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
