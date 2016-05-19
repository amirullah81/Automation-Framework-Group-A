package All_Levis;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by imran on 4/30/2016.
 */
public class LogOut extends CommonAPI {
    @Test
    public void LogOut() throws InterruptedException {
        Boolean isPresent = driver.findElements(By.id("oo_no_thanks")).size() > 0;
        System.out.println(isPresent);
        if ( isPresent){
            driver.findElement(By.id("oo_no_thanks")).click();
        }else {
            System.out.println("Popup window did not appeared");
        }
        clickByCss("#userLbl");
        Thread.sleep(1000);
        clickByXpath("html/body/div[4]/header/div/nav/div[2]/div[2]/div[2]/ul/li[7]/a");



    }
}
