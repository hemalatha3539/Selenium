package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;

public class TC_003 extends BaseClass {
	@Test
	public void LE_03() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateLeadsPageIcon();
		String fname=eutil.getDtaFromExcel("Leads",7,1);
		String lname =eutil.getDtaFromExcel("Leads",7,2);
		String company=eutil.getDtaFromExcel("Leads",7,3);
		String title=eutil.getDtaFromExcel("Leads",7,4);
		String phone=eutil.getDtaFromExcel("Leads",7,5);
		String mobileno=eutil.getDtaFromExcel("Leads",7,6);
		String email=eutil.getDtaFromExcel("Leads",7,7);
		String Noofemp=eutil.getDtaFromExcel("Leads",7,8);
		CreateNewLeadPage clp=new CreateNewLeadPage(driver);
		clp.createNewLead(fname, lname, company, company, title, phone, mobileno, email, Noofemp);
		System.out.println("Test case 3 successfully executed");
		
		
		
	}

}
