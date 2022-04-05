package Demo;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	
	@Ignore()
	@Test
	public void test1() {
		System.out.println("i am insite test 1");
	}

	
	@Test
	public void test2() {
		System.out.println("i am insite test 2");
	}
	
	
	
	

}
