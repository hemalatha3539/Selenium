package Sample;


import org.testng.Assert;
import org.testng.annotations.Test;

public class StrictComparisionHardAssertion {
	@Test
	public void StrictAssertion() {
		String ActualAruguments="hema";
		String ExpectedArugment="hema";
		Assert.assertEquals(ActualAruguments, ExpectedArugment);
		System.out.println("Strict hardAsserion is completed");
	}
	@Test
	public void CotainsAssertion() {
		String Actual="devi";
		String expected="devi prima ";
		Assert.assertTrue(expected.contains(Actual));
		System.out.println("partial asertion is completed");
	}

}
