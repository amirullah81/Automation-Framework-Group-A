package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A S M Amirullah on 5/7/2016.
 */
public class MainMenu extends CommonAPI {
    @Test
    public void mainMenuBar(){
        List<WebElement> element = new ArrayList<WebElement>();
        element = driver.findElements(By.cssSelector("#menu-menu-header > li"));
        for (int i=1; i<=element.size(); i++){
            Actions action = new Actions(driver);
            WebElement menu = driver.findElement(By.cssSelector("#menu-menu-header > li:nth-child("+i+")"));
            action.moveToElement(menu).build().perform();
            List<WebElement> subMenu = new ArrayList<WebElement>();
            subMenu = driver.findElements(By.cssSelector("#menu-menu-header > li:nth-child("+i+") li"));

            for(int n=1; n <= subMenu.size(); n++){
                action.moveToElement(driver.findElement(By.cssSelector("#menu-menu-header > li:nth-child("+i+") li:nth-child("+n+")"))).click().build().perform();
                driver.navigate().back();
                element = driver.findElements(By.cssSelector("#menu-menu-header > li"));
                menu = driver.findElement(By.cssSelector("#menu-menu-header > li:nth-child("+i+")"));
                action.moveToElement(menu).build().perform();
                //Thread.sleep(2000);
            }
        }
    }
}
