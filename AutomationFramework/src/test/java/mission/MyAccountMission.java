package mission;

import Pages.MyAccountPage;
import Pages.PersonalInformationPage;

public class MyAccountMission {

    private PersonalInformationPage personalInformationPage = new PersonalInformationPage();

    public void updateFirstName(String firstName, String password){
        personalInformationPage.clearAndEnterFirstName(firstName);
        personalInformationPage.enterPassword(password);
    }

}
