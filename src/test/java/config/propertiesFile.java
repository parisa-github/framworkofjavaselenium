package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test1_googleSearch_TestNGDemo;

public class propertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();

	}
	public static void getProperties()  {
		
		try {
			
			
			InputStream input = new FileInputStream( projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Test1_googleSearch_TestNGDemo .browserName = browser;
			
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	
		
	}
	public static void setProperties() {
		try {
			OutputStream output  = new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			
			
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
}
