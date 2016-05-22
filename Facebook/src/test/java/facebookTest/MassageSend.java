package facebookTest;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Syeda on 5/22/2016.
 */
public class MassageSend extends CommonAPI {
    @Test
    public void sand_massage()throws InterruptedException{
        typeByID("email", "adhora_hossen@yahoo.com");
        typeByID("pass", "01912058756");
        clickByID("u_0_y");
        sleepFor(2);

        clickByCss(".linkWrap.hasCount>span");
        sleepFor(2);
        typeByCss(".uiTextareaNoResize.uiTextareaAutogrow._1rv","test");
        clickByCss("#u_jsonp_2_6");
        sleepFor(3);
    }
}
