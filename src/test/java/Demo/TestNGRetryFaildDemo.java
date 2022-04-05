package Demo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFaildDemo {
	
	@Test
	public void test1() {
		System.out.println("i am insite test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("i am insite test 2");
		//int i=1/0;
		
	}

	
	
	@Test
	public void test3() {
		System.out.println("i am insite test 3");
		//Assert.assertTrue(0>1);
		
	}


}
