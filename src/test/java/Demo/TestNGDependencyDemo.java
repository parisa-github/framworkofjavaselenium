package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	
	
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("i am insite test 1");
	}
	
	
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("i am insite test 2");
	}
	
	
	@Test(groups = {"sanity2"})
	public void test3() {
		System.out.println("i am insite test 3");
	}

}
