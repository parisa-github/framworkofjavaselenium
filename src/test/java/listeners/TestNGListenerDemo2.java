package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	@Test
	public void test4() {
		System.out.println("i am insite test 4");
	}
	@Test
	public void test5() {
		System.out.println("i am insite test 5");
		// this one make faild
		//Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("i am insite test 6");
		//throw new SkipException("this test is skiped");
	}
	
	
	

}
