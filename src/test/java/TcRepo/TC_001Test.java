package TcRepo;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreateNewContactsPage;
import ObjectRepo.CreateNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
@Listeners(GenericUtility.ListenerImplimentation.class)
public class TC_001Test extends BaseClass
{
@Test
public void TE_01Test() throws Throwable{
	System.out.println("test method started");
	HomePage hp=new HomePage(driver);
	hp.clickOnLeadsMenu();
	LeadsPage lep=new LeadsPage(driver);
//	Assert.fail();
	lep.clickOnCreateLeadsPageIcon();
	String fname=eutil.getDtaFromExcel("Leads",1,1);
	String lname=eutil.getDtaFromExcel("Leads", 1, 2);
	String company=eutil.getDtaFromExcel("Leads", 1, 3);
	CreateNewLeadPage cnl=new CreateNewLeadPage(driver);
	cnl.createNewLead(fname, lname, company);
	System.out.println("Test case 1 successfully executed");
	
}
@Test
public void create() {
	System.out.print("hello");
}

}
