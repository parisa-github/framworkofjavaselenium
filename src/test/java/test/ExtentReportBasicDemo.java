package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

;

public class ExtentReportBasicDemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// html reporter
		
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentReport.html");
		
		// creat extent Reporter and attached reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
 
		// create  a toggle for the given test adds all log events under:
		ExtentTest test1 = extent.createTest("google search test one","search for validation functionality");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		// add logs for test
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://google.com");
		test1.pass( "navigated to google .com");
		
		
		driver.findElement(By.name("q")).sendKeys("abcd");
		test1.pass("Enter text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("pressed keybourd enter key");
		
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		test1.log(Status.INFO, "test completed");
		
		// calling flush write everything to the log file
		extent.flush();
	
	
	}
	
	

}
