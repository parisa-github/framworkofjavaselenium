package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	// creating logger for this class
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using logger for 
		
		System.out.println("      \n....Hello world.....\n");
		logger.trace("this is trace mesge");
		logger.info("this is information message");
		logger.error("this is error mesge");
		logger.warn("this is warnning  mesge");
		logger.fatal("this is fatal mesge");
		System.out.println("completed");
		

	}

}
