package logInOut;

import base.CommonAPI;

import java.io.IOException;

/**
 * Created by A S M Amirullah on 5/14/2016.
 */
public class LogInLogOut extends CommonAPI {

    public void logIn(String userName, String pass) throws IOException, InterruptedException {
        typeByCss("#username",userName);
        typeByCss("#password", pass);
        clickByCss("#loginButton");
    }
    public void logOut() throws InterruptedException {
        clickByXpath("./*//*[@id='basicShell']/header/nav[1]/ul/li[3]/a");
        sleepFor(2);
    }
}
