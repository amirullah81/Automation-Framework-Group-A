package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;
import reader.ReadData;

import java.io.IOException;

/**
 * Created by A S M Amirullah on 5/8/2016.
 */
public class FindAPlan extends CommonAPI {
    ReadData readExcelData = new ReadData();

    @Test
    public void findAPlan() throws InterruptedException, IOException {
        logger.info("Find a Plan");
        //Primary member details
        clickByXpath("./*//*[@id='container']/div/div[5]/div[2]/div/div/a");
        String planData[][] = readExcelData.getPlanDataFromExcelFile();
        for (int j = 1; j < planData.length; j++) {
            for (int k = 0; k < planData[j].length; k++) {

            }
            choseAction(planData[j][0],planData[j][1], planData[j][2]);
        }
    }

    public  void choseAction(String action, String locator, String value) throws InterruptedException {
        switch (action){
            case "enterText": typeText(locator,value);
                break;
            case "clickDropdown": clickDropdown(locator);
                break;
            case "selectOptionValue": selectOptionValue(locator,value);
                break;
            case "needInsurance": needInsurance(locator);
                break;
            case "noNeedInsurance": noNeedInsurance(locator);
                break;
            case "needDentalNdVison": needDentalNdVison(locator, value);
                break;
            case "clickButton": clickButton(locator);
                break;
            default:
                System.out.println("Invalid action");
        }
    }
    public void typeText(String locator, String value){
        typeByCss(locator,value);
    }
    public void clickDropdown(String locator) {
        clickByXpath(locator);
    }
    public void selectOptionValue(String locator, String value)throws InterruptedException {
        getHiddenOptionValues(locator,value);
    }
    public void needInsurance(String locator){
        checkBoxIsSelectByCss(locator);
    }
    public void noNeedInsurance(String locator){
        checkBoxIsUncheckByCss(locator);
    }
    public void needDentalNdVison(String locator, String value) {
        selectRadioButton(locator, value);
    }
    public void clickButton(String locator){
        clickByCss(locator);
    }
}