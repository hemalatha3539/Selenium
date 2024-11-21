package TcRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.ContactsPage;
import ObjectRepo.CreateNewContactsPage;


import ObjectRepo.HomePage;

@Listeners(GenericUtility.ListenerImplimentation.class)
public class TC_009 extends BaseClass {
	
	@Test
	public void LE_07() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.clickOnContacts();
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickContactsPage();
//		Assert.fail();
		String fname=eutil.getDtaFromExcel("Leads",1,1);
		String lname=eutil.getDtaFromExcel("Leads" ,1, 2);
		String title=eutil.getDtaFromExcel("Leads", 1, 3);
		CreateNewContactsPage ccp=new CreateNewContactsPage(driver);
		ccp.CreateNewContactsPage1(fname, lname, title);
		System.out.println("Test case 9 successfully executed");
		
		
		
	}

}
