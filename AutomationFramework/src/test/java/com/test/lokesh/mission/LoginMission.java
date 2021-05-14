package com.test.lokesh.mission;

import com.test.lokesh.pages.loginPage.DesktopLoginPage;
import com.test.lokesh.pages.loginPage.LoginPage;

public class LoginMission {

    LoginPage loginPage;

    public void performLogin(String userName, String Password){
        loginPage = new DesktopLoginPage();
        loginPage.enterUserName(userName);
        loginPage.enterPassword(Password);
        loginPage.clickLoginButton();
    }
}
