package TcRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;

public class TC_004Test extends BaseClass {
	@Test(groups= {"regression"})
	public void LE_04() throws Throwable {
		HomePage Hp=new HomePage(driver);
		Hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateLeadsPageIcon();
		String fname=eutil.getDtaFromExcel("Leads",10,1);
		String lname =eutil.getDtaFromExcel("Leads",10,2);
		String company=eutil.getDtaFromExcel("Leads",10,3);
		String street=eutil.getDtaFromExcel("Leads",10,4);
		String postalcode=eutil.getDtaFromExcel("Leads",10,5);
		String pobox=eutil.getDtaFromExcel("Leads",10,6);
		String city=eutil.getDtaFromExcel("Leads",10,7);
		String country=eutil.getDtaFromExcel("Leads",10,8);
		String state=eutil.getDtaFromExcel("Leads",10,9);
		CreateNewLeadPage clp=new CreateNewLeadPage(driver);
		clp.createNewLead(fname, lname, company, street, postalcode, pobox, city, country, state);
		
		System.out.println("Test case 4 successfully executed");
		
		
	}

}
