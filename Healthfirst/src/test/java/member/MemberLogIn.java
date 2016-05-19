package member;

import base.CommonAPI;
import org.testng.annotations.Test;
import reader.ReadData;

import java.io.IOException;

/**
 * Created by A S M Amirullah on 5/7/2016.
 */
public class MemberLogIn extends CommonAPI {
    ReadData readExcelData = new ReadData();
    @Test
    public void memberLogIn() throws InterruptedException, IOException {
        clickByXpath(".//*[@id='header']/div/div[6]/a[1]/span");
        String data[][] = readExcelData.getLogInDataFromExcelFile();
        for (int j = 1; j < data.length; j++) {
            for (int k = 0; k < data[j].length; k++) {
                switch (k) {
                    case 0:
                        //Thread.sleep(2000);
                        typeByCss("#username", data[j][k] );
                        break;
                    case 1:
                        //Thread.sleep(2000);
                        typeByCss("#password", data[j][k]);
                }
            }
            clickByCss("#loginButton");
            sleepFor(2);

            //close popup
            clickByCss("#uxContinue_Normal");
            //Logout
            clickByXpath("./*//*[@id='basicShell']/header/nav[1]/ul/li[3]/a");
            sleepFor(2);

        }

    }
}


