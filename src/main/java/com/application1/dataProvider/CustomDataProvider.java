package com.application1.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name= "userData")
    public static Object[][] getUserData()
    {
         Object[][] arr=ExcelReader.getData("Users");
         return arr;
    }
}
