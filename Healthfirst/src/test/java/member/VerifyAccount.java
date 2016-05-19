package member;

import logInOut.LogInLogOut;
import org.testng.annotations.Test;
import reader.ReadData;

import java.io.IOException;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by A S M Amirullah on 5/7/2016.
 */
public class VerifyAccount extends LogInLogOut {
    ReadData readExcelData = new ReadData();
    @Test
    public void verifyAccountDetails() throws IOException, InterruptedException {
        clickByXpath(".//*[@id='header']/div/div[6]/a[1]/span");
        String logIndata[][] = readExcelData.getLogInDataFromExcelFile();
        String userName = null,pass = null;
        for (int j = 1; j < logIndata.length; j++) {
            for (int k = 0; k < logIndata[j].length; k++) {
                userName = logIndata[j][0];
                pass = logIndata[j][1];
            }
            logIn(userName,pass);
            //clickByCss("#loginButton");
            //sleepFor(2);
            //close popup
            clickByCss("#uxContinue_Normal");

            String memberData[][] = readExcelData.getMemberInfoDataFromExcelFile();
            String data1 = null;
            String data2 = null;
            for (int m = 1; m < memberData.length; m++) {
                for (int n = 0; n < memberData[m].length; n++) {
                    if (n == 0) {
                        data1 = memberData[m][n];
                    } else if (n == 1) {
                        data2 = memberData[m][n];
                    }
                }
                verifyDataByXpath(data1, data2);
            }

            //Logout
            logOut();
        }
    }
}
