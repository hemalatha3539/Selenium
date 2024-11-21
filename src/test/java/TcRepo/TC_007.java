package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationPage;

public class TC_007 extends BaseClass {
	@Test(groups="regression")
	public void LE_07() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnOrganzation();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOrganizationPage();
		int randomnumber=jutil.getRandomNumber(1000);
		String orgname=eutil.getDtaFromExcel("Organization",9,1);
		String website=eutil.getDtaFromExcel("Organization",9,2);
		String billingAdd=eutil.getDtaFromExcel("Organization",9,3);
		String billingCity=eutil.getDtaFromExcel("Organization",9,4);
		String billingState=eutil.getDtaFromExcel("Organization",9,5);
		
		CreateNewOrganizationPage cnp=new CreateNewOrganizationPage(driver);
		cnp.createOrganizationPage(orgname+randomnumber, website, billingAdd, billingCity, billingState);
		
		
		System.out.println("Test case 7 successfully executed");
		
		
	}

}
