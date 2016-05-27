package logInOut;

import base.CommonAPI;

/**
 * Created by Rezina Sharmin on 5/19/2016.
 */
public class LogInLogOut extends CommonAPI{
    public void logIn(){
        typeByID("email", "adhora_hossen@yahoo.com");
        typeByID("pass", "01912058756");
        clickByID("loginbutton");
        System.out.println("Login Successfully");
    }

    public void logOut(){
        clickByID("userNavigationLabel");
        clickByLinkText("Log Out");
        System.out.println("Logged Out Successfully");
    }
}
