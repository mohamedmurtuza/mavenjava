package c;

import org.testng.Assert;
import org.testng.annotations.Test;

public class annabella {
	
	@Test(retryAnalyzer=basing.RetryAgain.class)
	public void it() {
		
		Assert.assertEquals(1,2);
	}
	@Test
	public void heyU() {
		Assert.assertEquals(1,1);
	}

}
