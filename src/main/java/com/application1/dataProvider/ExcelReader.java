package com.application1.dataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static XSSFWorkbook wb;
    @Test
    public static  Object[][] getData(String sheetName)  {
        try {
            wb = new XSSFWorkbook(new FileInputStream(new File("C:/Users/akmac/IdeaProjects/lauto/TestData/UserData.xlsx")));
        }catch (FileNotFoundException e) {
            System.out.println("File not found "+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Run Time exception  "+e.getMessage());
        }

        int row = wb.getSheet(sheetName).getPhysicalNumberOfRows();
        int column = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
        Object arr[][] = new Object[row-1][column];
        System.out.println("No of rows are : "+row+" and No of columns are : "+column);
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i-1][j] =getData(wb, sheetName, row, column);
                        //wb.getSheet("Tools").getRow(i).getCell(j).getStringCellValue();
            }}
        return arr;

    }
    public static String getData(XSSFWorkbook wb, String sheetName, int rows, int columns)
    {
        XSSFCell celldata=wb.getSheet(sheetName).getRow(rows).getCell(columns);
        String  data="";
        if(celldata.getCellType()== CellType.STRING)
        {
            data= celldata.getStringCellValue();
        }else if (celldata.getCellType()==CellType.NUMERIC)
        {
            data= String.valueOf(celldata.getNumericCellValue());
        }else if(celldata.getCellType()==CellType.BOOLEAN)
        {
            data=String.valueOf(celldata.getBooleanCellValue());
        }else if(celldata.getCellType()==CellType.BLANK)
        {
            System.out.println("The cell is blank ");
            data="";
        }
        return data;
    }
}
