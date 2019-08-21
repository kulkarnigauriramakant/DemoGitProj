package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil 
{
	public static WebDriver driver;
	
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Gauri\\ProjectDemo2\\src\\main\\java\\com\\qa\\testdata\\Information.xlsx");
		book=(XSSFWorkbook) WorkbookFactory.create(file);
		sheet=book.getSheet(sheetName);
		
		Object [][]data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		return data;
	}
	
	public static void takeScreenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\example.jpg"));
	}
}
