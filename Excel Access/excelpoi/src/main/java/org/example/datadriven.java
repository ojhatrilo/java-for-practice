package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class datadriven {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Staff\\Ojha file\\java-for-practice\\Excel Access\\demo.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();

        for(int i = 0;i<sheets;i++){

            if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")){
                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator(); // row is collection of cells
                int k = 0;
                int colounm = 0;

                while(ce.hasNext()){

                    Cell value = ce.next();

                    if(value.getStringCellValue().equalsIgnoreCase("Testcases")){

                        //desired colounm
                        colounm = k;
                    }
                    k++;
                }

                System.out.println(colounm);

                while(rows.hasNext()){

                    Row r = rows.next();
                    if(r.getCell(colounm).getStringCellValue().equalsIgnoreCase("Purchase")){

                        Iterator<Cell> cv = r.cellIterator();
                        while(cv.hasNext())
                        {
                            System.out.println(cv.next().getStringCellValue());
                        }
                    }

                }

            }


        }
    }
}
