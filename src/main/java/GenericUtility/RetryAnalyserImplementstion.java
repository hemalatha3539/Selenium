package GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementstion implements IRetryAnalyzer {
     int count =1;
     int retryCount=3;//this count will come from manual
 
	public boolean retry(ITestResult result) {
		//1<=3 2<=3 3<=3 4<=3- false
		while(count<=retryCount) {
			count++;//2 3 4
			return true;//retry retry retry
		}
		
		return false; //stop retry
	}

}
