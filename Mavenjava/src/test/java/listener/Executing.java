package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Executing {
	
	@Test(retryAnalyzer=listener.RetryListener.class)
	public void test() {
		
		Assert.assertEquals("hello","hell");
	}

}
