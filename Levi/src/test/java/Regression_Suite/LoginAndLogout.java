package Regression_Suite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by imran on 4/30/2016.
 */
public class LoginAndLogout extends CommonAPI {
@Test
    public void loginAndlogout() throws InterruptedException {
    //driver.findElement(By.xpath("html/body/div[14]/div[2]/div/span")).click(); //close popup window
    driver.findElement(By.cssSelector("div.email-signup > div.tooltip-wrapper > span.close")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("#userLbl")).click(); //go to login page

    //login part
    driver.findElement(By.cssSelector("#j_username")).sendKeys("limontest9@gmail.com");
    driver.findElement(By.cssSelector("#j_password")).sendKeys("1234561l");
    driver.findElement(By.cssSelector(".btn-dbbdr.btn-signin")).click();

    Thread.sleep(2000);
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

