package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("i am insite test 1");
		
		
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("i am insite test 2");
		
		
	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("i am insite test 3");
	
	
	}

}
