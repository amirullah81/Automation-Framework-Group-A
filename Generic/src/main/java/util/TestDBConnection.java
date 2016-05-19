package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.info;

/**
 * Created by rrt on 5/1/2016.
 */
public class TestDBConnection {

    public static void main(String[] args)throws Exception {
        DBConnect dbConnect = new DBConnect();
        //dbConnect.connectToDataBase();
        List<String> memberInfo = dbConnect.readDataBase();
        for (String minfo:memberInfo){
            System.out.println(minfo);
        }
    }
}
