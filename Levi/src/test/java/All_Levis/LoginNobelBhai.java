package All_Levis;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by imran on 4/30/2016.
 */
public class LoginNobelBhai extends CommonAPI {
@Test
    public void loginNobelBhai() throws InterruptedException {
    String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
    String subWindowHandler = null;

    Set<String> handles = driver.getWindowHandles(); // get all window handles
    Iterator<String> iterator = handles.iterator();
    while (iterator.hasNext()) {
        subWindowHandler = iterator.next();
    }
    driver.switchTo().window(subWindowHandler); // switch to popup window
    // perform operations on popup

    driver.findElement(By.xpath("html/body/div[14]/div[2]/div/span")).click(); //close popup window

    //driver.switchTo().window(parentWindowHandler);  // switch back to parent window
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#userLbl")).click(); //go to login page
/*
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
    //@Test
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



    }*/
}
}
