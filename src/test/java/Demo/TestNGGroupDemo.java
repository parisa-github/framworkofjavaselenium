package Demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGGroupDemo {
	
	
	@Test(groups = { "sanity"})
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test(groups = { "sanity","smoke"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test(groups = { "windows.regression"})
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is test 4");
	}


	

}
