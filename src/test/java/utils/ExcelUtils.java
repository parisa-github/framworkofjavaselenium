package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 static String projectpath ;
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 
	 public ExcelUtils(String excelpath ,String sheetName) {
		 
		 
		
		 try {
			 projectpath = System.getProperty("user.dir");
			 workbook = new XSSFWorkbook(excelpath);
			 sheet  = workbook.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 }
	 
	 
	 
	public static void main(String[] args) {
		 getRowCount();
		 getcolCount();
		 getCellDataString(0,0);
		 getCellDatanumber(1,1);
		
	}

	public static int getRowCount() {
		int rowcount =0;
		
		try {
			 
			 
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows:"+rowcount);
		} 
		
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}	
		return rowcount;

	}
	
	public static int getcolCount() {
		int colcount = 0;
		
		try {
			 
			 
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("number of rows:"+colcount);
		} 
		
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}	
		return colcount;

	}
	
	public static String getCellDataString(int rowNum , int colNum) {
		String cellData = null;
		
		try {
			
			//workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			//sheet  = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		} 
		
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}
	
	
	public static void getCellDatanumber(int rowNum , int colNum) {
		
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet  = workbook.getSheet("Sheet1");
			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
		} 
		
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}

}
