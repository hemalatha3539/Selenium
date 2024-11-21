package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RtryAnalyserPracties {
	@Test(retryAnalyzer=GenericUtility.RetryAnalyserImplementstion.class)
//	@Test(invocationCount=3)
	public void sample() {
//		Assert.fail();
		System.out.println("hi");
	}

}
