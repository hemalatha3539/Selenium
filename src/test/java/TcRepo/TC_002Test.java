package TcRepo;

import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;

public class TC_002Test extends BaseClass{
	@Test(priority = 2)
	public void LE_02() throws Throwable{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp=new LeadsPage(driver);
		lp.clickOnCreateLeadsPageIcon();
		String fname=eutil.getDtaFromExcel("Leads",4,1);
		String lname=eutil.getDtaFromExcel("Leads" ,4, 2);
		String company=eutil.getDtaFromExcel("Leads", 4, 3);
		String title=eutil.getDtaFromExcel("Leads", 4, 4);
		String phone=eutil.getDtaFromExcel("Leads", 4, 5);
		String mobilePhone=eutil.getDtaFromExcel("Leads", 4, 6);
		String Email=eutil.getDtaFromExcel("Leads", 4,7 );
		String NoofEmp=eutil.getDtaFromExcel("Leads", 4, 8);
		String street=eutil.getDtaFromExcel("Leads", 4, 9);
		String postalcode=eutil.getDtaFromExcel("Leads", 4, 10);
		String poBox=eutil.getDtaFromExcel("Leads", 4, 11);
		String city=eutil.getDtaFromExcel("Leads", 4, 12);
		String country=eutil.getDtaFromExcel("Leads", 4, 13);
		String state=eutil.getDtaFromExcel("Leads", 4, 14);
		CreateNewLeadPage clp=new CreateNewLeadPage(driver);
		clp.createNewLead(fname, lname, company, title, phone, mobilePhone, Email, NoofEmp, street, postalcode, poBox, city, country, state);
		System.out.println("Test case 2 successfully executed");
		
	}

}
