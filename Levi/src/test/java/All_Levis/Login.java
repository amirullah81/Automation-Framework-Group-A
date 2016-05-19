package All_Levis;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by imran on 4/27/2016.
 */
public class Login extends CommonAPI {
    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.cssSelector("div.email-signup > div.tooltip-wrapper > span.close")).click();
        //clickByCss("[#userLbl]");
        //Thread.sleep(3000);
        //driver.findElement(By.id("j_username")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        //clickByCss("[#userLbl]");
        //driver.findElement(By.id("userLbl"));
        typeByCss("#j_username", "limontest9@gmail.com");
        Thread.sleep(3000);
        typeByCss("#j_password", "1234561l");
        Thread.sleep(3000);
        //elementHighlight(driver.findElement(By.cssSelector("#link-signin")));
        //driver.findElement(By.id("link-signin")).sendKeys(Keys.ENTER);
        //clickByXpath("html/body/div[9]/div[1]/article/section[1]/div[2]/form/input[2]");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-dbbdr.btn-signin")).click();
        //clickByCss("#link-signin");
        Thread.sleep(2000);
        //clickByCss("#userLbl");





    }
}
