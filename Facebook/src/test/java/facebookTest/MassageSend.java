package facebookTest;

import logInOut.LogInLogOut;
import org.testng.annotations.Test;

/**
 * Created by Syeda on 5/22/2016.
 */
public class MassageSend extends LogInLogOut {
    @Test
    public void sand_massage()throws InterruptedException{
        logIn();
        sleepFor(2);

        clickByCss(".linkWrap.hasCount>span");
        sleepFor(2);
        typeByCss(".uiTextareaNoResize.uiTextareaAutogrow._1rv","test");
        clickByCss("#u_jsonp_2_6");
        sleepFor(3);

        logOut();
        sleepFor(3);
    }
}
