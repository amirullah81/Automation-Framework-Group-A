package reader;

import util.DBConnect;
import util.DataReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by Rezina Sharmin on 5/19/2016.
 */
public class ReadNewsData {
    DataReader dataReader = new DataReader();
    DBConnect dbConnect = new DBConnect();

    public String[] getNewsFromExcelFile()throws IOException {
        String path = System.getProperty("user.dir")+"\\data\\searchData.xls";
        String [] news = dataReader.fileReader(path);
        return news;
    }
    public String[] getActionItemsFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"\\data\\file1.xls";
        String [] news = dataReader.fileReader(path);
        return news;
    }
    public List<String> getNewsDataFromDB(String tableName, String columnName)throws  Exception{
        List<String> newsList = dbConnect.readDataBase(tableName,columnName);
        return newsList;
    }
    public List<String> getActionStepsDataFromDB(String tableName,String columnName)throws  Exception{
        List<String> actionList = dbConnect.readDataBase(tableName,columnName);
        return actionList;
    }

}
