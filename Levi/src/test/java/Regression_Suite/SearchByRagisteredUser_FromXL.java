package Regression_Suite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reader.ReadNewsData;

import java.io.IOException;

/**
 * Created by imran on 4/27/2016.
 */
public class SearchByRagisteredUser_FromXL extends CommonAPI {
    @Test
    public void searchBoxByRagisteredUser() throws InterruptedException, IOException {
       // driver.findElement(By.xpath("html/body/div[14]/div[2]/div/span")).click(); //close popup window
        driver.findElement(By.cssSelector("div.email-signup > div.tooltip-wrapper > span.close")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#userLbl")).click(); //go to login page

        //login part
        driver.findElement(By.cssSelector("#j_username")).sendKeys("limontest9@gmail.com");
        driver.findElement(By.cssSelector("#j_password")).sendKeys("1234561l");
        driver.findElement(By.cssSelector(".btn-dbbdr.btn-signin")).click();
        //closing popup window if exist or displays
        Boolean isPresent = driver.findElements(By.id("oo_no_thanks")).size() > 0;
        System.out.println(isPresent);
        if ( isPresent){
            driver.findElement(By.id("oo_no_thanks")).click();
        }else {
            System.out.println("Popup window did not appeared");
        }

        Thread.sleep(2000);
       // driver.findElement(By.cssSelector("div.email-signup > div.tooltip-wrapper > span.close")).click();
// data driven from xl file
        ReadNewsData readNewsData = new ReadNewsData();
        String [] textToBeSearch = readNewsData.getNewsFromExcelFile();

        //List<String> textToBeSearch = Arrays.asList( "sharts", "cap","glass","help");
        for (String var:textToBeSearch){
            System.out.println(var);
            typeByCss(".searchbox-input", var);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".searchbox-icon.icon-search")).click();
            Thread.sleep(1000);


            Boolean isPresent3 = driver.findElements(By.id("oo_no_thanks")).size() > 0;
            System.out.println(isPresent3);
            if ( isPresent3){
              driver.findElement(By.id("oo_no_thanks")).click();
            }else {
                System.out.println("Popup window did not appeared");
            }


            Boolean isPresentResult=driver.findElements(By.cssSelector(".search-results-header>p")).size()>0;
            if (isPresentResult) {
                WebElement footer = driver.findElement(By.cssSelector(".search-results-header>p"));
                System.out.println(footer.getText());

            }

        }
//Logout code
        Boolean isPresent2 = driver.findElements(By.id("oo_no_thanks")).size() > 0;
        System.out.println(isPresent2);
        if ( isPresent2){
            driver.findElement(By.id("oo_no_thanks")).click();
        }else {
            System.out.println("Popup window did not appeared");
        }
        clickByCss("#userLbl");
        Thread.sleep(1000);
        clickByXpath("html/body/div[4]/header/div/nav/div[2]/div[2]/div[2]/ul/li[7]/a");
    }

}
