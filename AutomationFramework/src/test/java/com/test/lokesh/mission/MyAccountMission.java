package com.test.lokesh.mission;

import com.test.lokesh.pages.PersonalInformationPage;

public class MyAccountMission {

    private PersonalInformationPage personalInformationPage = new PersonalInformationPage();

    public void updateFirstName(String firstName, String password){
        personalInformationPage.clearAndEnterFirstName(firstName);
        personalInformationPage.enterPassword(password);
    }

}
