package mission;

import Pages.loginPage.DesktopLoginPage;
import Pages.loginPage.LoginPage;

public class LoginMission {

    LoginPage loginPage;

    public void performLogin(String userName, String Password){
        loginPage = new DesktopLoginPage();
        loginPage.enterUserName(userName);
        loginPage.enterPassword(Password);
        loginPage.clickLoginButton();
    }
}
