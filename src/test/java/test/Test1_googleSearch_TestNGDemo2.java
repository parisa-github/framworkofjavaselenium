package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_googleSearch_TestNGDemo2 {
	
	
	// these part before running the test
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	// these part is our actual test
	
	// creating function
	@Test
	public  void googleSearch2() {
		

		 // go to google .com
		 driver.get("https://google.com");
		 // enter text in search text box
		 
		 driver.findElement(By.name("q")).sendKeys("abcd ");
		// driver.findElement(By.name("btn1")).click();
		 driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		 
		
		
	}
	// this part is after the test
	@AfterTest
	public void teardownTest() {
		 driver.close();
		 driver.quit();
		 System.out.println("test completed successfully"); 
		
	}

}
