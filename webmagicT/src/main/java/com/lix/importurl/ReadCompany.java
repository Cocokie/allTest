package com.lix.importurl;

import com.lix.domain.Company;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadCompany {
    XSSFWorkbook wb;
     int start = 1;

    public static List<String> getCompanyXlsx() {
        File File = new File("F:/yqsj.xlsx");
        List<String> companyList = new ArrayList<String>();
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook(new FileInputStream(File));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //int numberOfSheets = wb.getNumberOfSheets();
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator i = sheet.iterator();
        int k = 0;
        while (i.hasNext()) {
            Row r = (Row) i.next();
            companyList.add(r.getCell(0).getStringCellValue());
        }
        return companyList;
    }

    public  List<Company> getCompany() {
        File File = new File("F:/上市公司汇总.xlsx");
        List<Company> companyList = new ArrayList<Company>();
         wb = null;
        try {
            wb = new XSSFWorkbook(new FileInputStream(File));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //int numberOfSheets = wb.getNumberOfSheets();
        XSSFSheet sheet = wb.getSheet("汇总");

        for (int i = start; i <= start+20; i++) {
            System.out.println("start");
            XSSFRow row = sheet.getRow(i);
            Company c = new Company();
            c.setId("");
            c.setCode(row.getCell(1).getStringCellValue());
            c.setQyjc(row.getCell(2).getStringCellValue());
            c.setType(row.getCell(3).getStringCellValue());
            companyList.add(c);
        }
       // wb.close();
        start=start+20;
        return companyList;
    }

    public static List<String> getCompanyXls() {

        List<String> companyList = new ArrayList<>();
        HSSFWorkbook workbook = null;
        try {
            File File = new File("F:/222.xls");
            workbook = new HSSFWorkbook(new FileInputStream(File));
        } catch (Exception e) {
        }
        HSSFSheet sheet = workbook.getSheet("Sheet1");//讀取第一張工作表 Sheet1
        Iterator i = sheet.iterator();
        int k = 0;
        while (i.hasNext()) {
            Row r = (Row) i.next();
            //if (k++ >= 1) {
            companyList.add(r.getCell(0).getStringCellValue());
            //}
        }
        return companyList;
    }

    public void writeXlsx(String zw, String yw, int row) {
        File File = new File("F:/上市公司汇总.xlsx");
        List<Company> companyList = new ArrayList<Company>();
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook(new FileInputStream(File));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //int numberOfSheets = wb.getNumberOfSheets();
        XSSFSheet sheet = wb.getSheet("汇总");
        XSSFRow row1 = sheet.getRow(row);
        row1.getCell(5).setCellValue(yw);
        row1.getCell(6).setCellValue(zw);

    }
}


