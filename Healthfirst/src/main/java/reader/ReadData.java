package reader;

import util.DBConnect;
import util.DataReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by A S M Amirullah on 5/7/2016.
 */
public class ReadData {

    DataReader dataReader = new DataReader();
    DBConnect dbConnect = new DBConnect();

    public String[][] getLogInDataFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"\\data\\login.xls";
        String[][] logInData = dataReader.fileReader1(path);
        return logInData;
    }

    public String[][] getMemberInfoDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\memberInfo.xls";
        String[][]memberData = dataReader.fileReader1(path);
        return memberData;
    }

    public String[][] getPlanDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\planData.xls";
        String[][]planData = dataReader.fileReader1(path);
        return planData;
    }

    public List<String> getDataFromDB()throws IOException,Exception{
        List<String>memberInfo=dbConnect.readDataBase();
        return memberInfo;
    }
}
