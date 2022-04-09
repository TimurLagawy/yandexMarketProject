package Utils;

import org.testng.annotations.DataProvider;

public class DataProvid {
    @DataProvider
    public  static  Object[][] getInvalidData(){

        return new Object[][]{{null},{""},{" "},{"0"}};

        }

}
