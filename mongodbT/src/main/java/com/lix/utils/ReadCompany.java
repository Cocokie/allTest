package com.lix.utils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadCompany {
    XSSFWorkbook wb;

    public ReadCompany(InputStream is) {
        try {
            wb = new XSSFWorkbook(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public void writeXlsx(String sheet, String name, String fenzhi) {
        XSSFSheet sheet1 = wb.getSheet(sheet);
        Iterator i = sheet1.iterator();
        while (i.hasNext()) {
            Row r = (Row) i.next();
            r.getCell(0).setCellValue(name);
            r.getCell(0).setCellValue(fenzhi);
        }
        try {
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


