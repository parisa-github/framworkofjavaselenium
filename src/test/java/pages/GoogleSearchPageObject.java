package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;

	// By is class
	
	By textbox_search = By.id("lst-id");
	By button_search = By.name("btnk");
	
	// creating constructor  , constructor shuld be the same name of class
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
		
	}



	public void setTextInsearchBox (String text) {
		driver.findElement(textbox_search).sendKeys(text);
	
	}
	
	// for clicking button method/function
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}
}
