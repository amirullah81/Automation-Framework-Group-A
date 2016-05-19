package All_Levis;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by imran on 4/27/2016.
 */
public class searchBox extends CommonAPI {
    @Test
    public void searchBox() throws InterruptedException {
        driver.findElement(By.cssSelector("div.email-signup > div.tooltip-wrapper > span.close")).click();
        List<String> textToBeSearch = Arrays.asList("tie", "sharts", "cap","top","glass","help");
        for (String var:textToBeSearch){
            System.out.println(var);
            typeByCss(".searchbox-input", var);
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".searchbox-icon.icon-search")).click();
            Thread.sleep(1000);


            Boolean isPresent = driver.findElements(By.id("oo_no_thanks")).size() > 0;
            System.out.println(isPresent);
            if ( isPresent){
              driver.findElement(By.id("oo_no_thanks")).click();
            }else {
                System.out.println("Popup window did not appeared");
            }


            Boolean isPresentResult=driver.findElements(By.cssSelector(".search-results-header>p")).size()>0;
            if (isPresentResult) {
                WebElement footer = driver.findElement(By.cssSelector(".search-results-header>p"));
                System.out.print(footer.getText());
                var = "”" + var.toUpperCase() + "”";
                //Assert.assertEquals(footer.getText(),var);}
            }

        }
    }

}
