package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationPage;

public class TC_008 extends BaseClass{
	@Test
	public void LE_08() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnOrganzation();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOrganizationPage();
		int randomnumber=jutil.getRandomNumber(1000);
		String orgname=eutil.getDtaFromExcel("Organization",12,1);
		String website=eutil.getDtaFromExcel("Organization",12,2);
		String employees=eutil.getDtaFromExcel("Organization",12,3);
		String phone=eutil.getDtaFromExcel("Organization",12,4);
		String otherphone=eutil.getDtaFromExcel("Organization",12,5);
		String email=eutil.getDtaFromExcel("Organization",12,6);
		String billingAdd=eutil.getDtaFromExcel("Organization",12,7);
		String billingCity=eutil.getDtaFromExcel("Organization",12,8);
		String  billingState=eutil.getDtaFromExcel("Organization",12,9);
		
		CreateNewOrganizationPage cnp=new CreateNewOrganizationPage(driver);
		cnp.createOrganizationPage(orgname+randomnumber, website, employees, phone, otherphone, email, billingAdd, billingCity, billingState);
		
		System.out.println("Test case 8 successfully executed");
		
		
		
	}

}
