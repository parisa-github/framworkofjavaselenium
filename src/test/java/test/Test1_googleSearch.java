package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we should call our function here
		googleSearch();
		

	}
	
	
	// creating function
	public static void googleSearch() {
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 // go to google .com
		 driver.get("https://google.com");
		 // enter text in search text box
		 
		 driver.findElement(By.name("q")).sendKeys("abcd ");
		// driver.findElement(By.name("btn1")).click();
		 driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		 
		 driver.close();
		
		 
		 System.out.println("test completed successfully");
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
