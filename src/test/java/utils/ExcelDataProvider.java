package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.propertiesFile;

public class ExcelDataProvider {
	  
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		propertiesFile.getProperties();
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	
		
		
		System.out.println(projectPath);
		
		
	}
	
	
	
	@Test(dataProvider = "test1data")
	public void test1(String username , String password) throws InterruptedException {
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtusername")).sendKeys(username);
		driver.findElement(By.id("txtpassword")).sendKeys(password);
		
		Thread.sleep(2000);
		
		// 
		
		
	}

	
	// here created function for tesrt ng and test ng anotstion 
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelpath = "C:\\Users\\ParisaOmid\\eclipse-workspace\\SeleniumjavaFramework\\excel\\data.xlsx";
		Object data[][] = testData(excelpath, "Sheet1");
		return data;
		
	}
	
	public  Object[][] testData(String excelpath , String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelpath, sheetName);
	    int rowcount= excel.getRowCount();
		int colcount = excel.getcolCount();
		
		Object data[][]= new Object[rowcount-1][colcount];
		
		for (int i = 1; i<rowcount; i++) {
			for(int j = 0; j<colcount; j++) {
				String celldata = excel.getCellDataString(i, j);
				//System.out.println(celldata);
				data[i-1][j]= celldata;
			}
		}
		return data;
		
	}

}
