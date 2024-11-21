package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void strictSoft() {
		String ActualAruguments="hema";
		String ExpectedArugment="hema";
		SoftAssert s=new SoftAssert();
		s.assertEquals(ActualAruguments, ExpectedArugment);
		System.out.println("Strict hardAsserion is completed");
	}
	@Test
	public void CotainsAssertion() {
		String Actual="devi";
		String expected="devi prima ";
		SoftAssert s=new SoftAssert();
		s.assertTrue(expected.contains(Actual));
		System.out.println("partial asertion is completed");
	}

}
