package facebookTest;

import logInOut.LogInLogOut;
import org.testng.annotations.Test;

/**
 * Created by Syeda on 5/22/2016.
 */
public class UpdateStatus extends LogInLogOut {
    @Test
    public void status_update()throws InterruptedException{

        logIn();
        sleepFor(3);

        typeByCss(".uiTextareaAutogrow._3en1","test");
//        clickByLinkText("Post");
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        Thread.sleep(2000);
//	 String expectedName = "test";
//	assertEquals(expectedName, driver.findElement(By.cssSelector("#js_4")).getText());
        logOut();
    }
}
