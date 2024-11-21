package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import ObjectRepo.OrganizationPage;

public class TC_005Test extends BaseClass {
	@Test(groups= {"Smoke"})
	public void LE_05() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnOrganzation();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOrganizationPage();
	    int randomnumber=jutil.getRandomNumber(1000);
		String orgname=eutil.getDtaFromExcel("Organization",3,1);
		String website=eutil.getDtaFromExcel("Organization",3,2);
		String employees=eutil.getDtaFromExcel("Organization",3,3);
		CreateNewOrganizationPage cnp=new CreateNewOrganizationPage(driver);
		cnp.createOrganizationPage(orgname+randomnumber, website, employees);
		
		
		System.out.println("Test case 5 successfully executed");
		
		
	}

}
