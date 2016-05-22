package facebookTest;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Rezina Sharmin on 5/19/2016.
 */
public class FBlogin extends CommonAPI {
    @Test
    public void Login_LogOut() throws InterruptedException {
        typeByID("email", "adhora_hossen@yahoo.com");
        typeByID("pass", "01912058756");
        clickByID("u_0_y");
        System.out.println("Login Successfully");
        sleepFor(2);

        clickByID("userNavigationLabel");
        sleepFor(2);
        clickByLinkText("Log Out");
        sleepFor(2);
        System.out.println("Logged Out Successfully");
    }
}
