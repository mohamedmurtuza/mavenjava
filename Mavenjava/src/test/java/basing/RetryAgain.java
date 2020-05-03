package basing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAgain implements IRetryAnalyzer{

	int count=0;
	int countlimit=2;
	public boolean retry(ITestResult result) {
		
		if(count<countlimit) {
			
			count++;
			return true;
		}
		
		return false;
	}
	
	
	

}
