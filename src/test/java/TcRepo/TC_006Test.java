package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationPage;

public class TC_006Test extends BaseClass {
	@Test(groups= {"Smoke","regression"})
	public void LE_06() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnOrganzation();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOrganizationPage();
		 int randomnumber=jutil.getRandomNumber(1000);
		String orgname=eutil.getDtaFromExcel("Organization",6,1);
		String website=eutil.getDtaFromExcel("Organization",6,2);
		String employees=eutil.getDtaFromExcel("Organization",6,3);
		String phone=eutil.getDtaFromExcel("Organization",6,4);
		String otherphone=eutil.getDtaFromExcel("Organization",6,5);
		String email=eutil.getDtaFromExcel("Organization",6,6);
		CreateNewOrganizationPage cnp=new CreateNewOrganizationPage(driver);
		cnp.createOrganizationPage(orgname+randomnumber, website, employees, phone, otherphone, email);
		System.out.println("Test case 6 successfully executed");
		
		
	}
}
