package com.exploratoryPractice;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExcelCheck {
    public static XSSFWorkbook wb;
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream excelFile= new FileInputStream(new File("C:/Users/akmac/IdeaProjects/lauto/TestData/UserData.xlsx"));
            wb = new XSSFWorkbook(excelFile);
            //System.out.println("The value in the exccel file is : "+wb.getSheet("Tools").getRow(0).getCell(1));
           int rows= wb.getSheet("Tools").getPhysicalNumberOfRows();
           int columns=wb.getSheet("Tools").getRow(0).getPhysicalNumberOfCells();
           Object data[][]= new Object[rows][columns];
            for(int i =1; i<rows-1;i++)
            {
                for(int j=0; j<columns;j++)
                {
                    //System.out.println("Values are : "+wb.getSheet("Tools").getRow(i).getCell(j).getStringCellValue());
                    System.out.println("Values are : "+getData(wb, "Tools",rows, columns));
                    data[i-1][j]=getData(wb, "Tools",rows, columns);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
           data="";
       }
        return data;
    }
}
