package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("i am insite test 1");
	}
	@Test
	public void test2() {
		System.out.println("i am insite test 2");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Abcd");
		 driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("Abcd");
		
		 driver.close();
		
		
		
		
		
		
		// this one make faild
		//Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("i am insite test 3");
		//throw new SkipException("this test is skiped");
	}
	
	
	

}
