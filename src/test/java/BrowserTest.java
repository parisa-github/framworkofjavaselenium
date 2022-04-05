import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		// user.dir   ... gave us the path of our project
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\ParisaOmid\\eclipse-workspace\\SeleniumjavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		
		 
		  driver.get("https://google.com/");
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Abcd");
		 // becouse its list of elements so we shuld store in a list 
		 List<WebElement> listOfInputElements =  driver.findElements(By.xpath("//input"));
		 int count = listOfInputElements.size();
		 System.out.println("count of input element is "+count);
	
		 

	
		 driver.close();
		 driver.quit();
	}

}
