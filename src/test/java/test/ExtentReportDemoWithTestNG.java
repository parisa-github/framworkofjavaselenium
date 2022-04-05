package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWithTestNG {
	WebDriver driver = null;
	ExtentSparkReporter htmlreporter;
	ExtentReports extent;
	private ExtentTest test;

	
	// this function run before test
	@BeforeSuite
	public void setUp() {
		
		
		htmlreporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	}
	@BeforeTest
	public void beforeTest() {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	// test
	@Test
	public void test1() {
		ExtentTest test1 = extent.createTest("google search test one","search for validation functionality");
		driver.get("https://google.com");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");   
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@Test
	public void test2() {
		ExtentTest test1 = extent.createTest("google search test one","search for validation functionality");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");   
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@AfterTest
	public void teardownTest() {
		 driver.close();
		 driver.quit();
		 System.out.println("test completed successfully"); 
		
	}

	
	// this run  after test
	@AfterSuite
	public void teaDown() {
		extent.flush();
		
	}
}
