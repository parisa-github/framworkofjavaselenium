package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	// private becouse just want to avialable for this class objects
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		// firsr Start set browser
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  GoogleSearchPageObject searchpageObj=new GoogleSearchPageObject(driver);
		  driver.get("https://google.com");
		  
		  searchpageObj.setTextInsearchBox("abcd");
		  searchpageObj.clickSearchButton();
		  
		  driver.close();
		
	}

}
