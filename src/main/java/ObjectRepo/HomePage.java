package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement leads;
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement organzation;
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contacts;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLeads() {
		return leads;
	}
	public WebElement getOrganzation() {
		return organzation;
	}
	public WebElement getContacts() {
		return contacts;
	}
	
	public WebElement getAdministrator() {
		return administrator;
	}
	public WebElement getSignout() {
		return signout;
	}
	public void clickOnLeadsMenu() {
		getLeads().click();
	}
	public void clickOnOrganzation() {
		getOrganzation().click();
	}
	public void clickOnContacts() {
		getContacts().click();;
	}
	
	public void signOutOperation(WebDriver driver) throws Exception
	{
		Actions act=new Actions(driver);
		act.moveToElement(administrator).perform();
		Thread.sleep(4000);
		getSignout().click();
	}
	

}
