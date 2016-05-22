package facebookTest;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Syeda on 5/22/2016.
 */
public class SearchByName extends CommonAPI {
    @Test
    public void search_name () throws InterruptedException {
        typeByID("email", "adhora_hossen@yahoo.com");
        typeByID("pass", "01912058756");
        clickByID("u_0_y");
        sleepFor(2);
        typeByCss("._586i","Samiul Azim");
        sleepFor(7);
    }
}
