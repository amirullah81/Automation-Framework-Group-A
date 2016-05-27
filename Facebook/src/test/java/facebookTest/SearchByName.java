package facebookTest;

import logInOut.LogInLogOut;
import org.testng.annotations.Test;

/**
 * Created by Syeda on 5/22/2016.
 */
public class SearchByName extends LogInLogOut {
    @Test
    public void search_name () throws InterruptedException {
        logIn();
        sleepFor(2);
        typeByCss("._586i","Samiul Azim");
        sleepFor(7);
        logOut();
    }
}
