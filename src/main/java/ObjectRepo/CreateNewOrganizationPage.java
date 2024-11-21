package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")
    private WebElement OrganizationName;
	@FindBy(xpath="//input[@name='website']")
    private WebElement Website;
	@FindBy(xpath="//input[@id='employees']")
    private WebElement Employees;
	@FindBy(xpath="//input[@id='phone']")
    private WebElement Phone;
	@FindBy(xpath="//input[@id='otherphone']")
    private WebElement OtherPhone;
	@FindBy(xpath="//input[@name='email1']")
    private WebElement Email;
	@FindBy(xpath="//textarea[@name='bill_street']")
    private WebElement BillingAddress;
	@FindBy(xpath="//input[@id='bill_city']")
    private WebElement BillingCity;
	@FindBy(xpath="//input[@id='bill_state']")
    private WebElement BillingState;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Save;
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrganizationName() {
		return OrganizationName;
	}
	public WebElement getWebsite() {
		return Website;
	}
	public WebElement getEmployees() {
		return Employees;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getOtherPhone() {
		return OtherPhone;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getBillingCity() {
		return BillingCity;
	}
	public WebElement getBillingState() {
		return BillingState;
	}
	public WebElement getSave() {
		return Save;
	}
	 
	/** This is a business library to create a new organization
	 * 
	 * @param OrganName
	 * @param website
	 * @param employees
	 */
	public void createOrganizationPage(String OrganName,String website,String employees) {
		
		getOrganizationName().sendKeys(OrganName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getSave().click();
}
	/**
	 * This is a business library to create a new organization
	 * @param OrganName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param Otherphone
	 * @param Email
	 * @param billingAdd
	 * @param billingcity
	 * @param billingState
	 */
public void createOrganizationPage(String OrganName,String website,String employees,String phone,String Otherphone,String Email,String billingAdd,String billingcity,String billingState)
{
	    getOrganizationName().sendKeys(OrganName);
	    getWebsite().sendKeys(website);
	    getEmployees().sendKeys(employees);
	    getPhone().sendKeys(phone);
	    getOtherPhone().sendKeys(Otherphone);
	    getEmail().sendKeys(Email);
	    getBillingAddress().sendKeys(billingAdd);
	    getBillingCity().sendKeys(billingcity);
	    getBillingState().sendKeys(billingState);
		getSave().click();
}
/**
 * This is a business library to create a new organization
 * @param OrganName
 * @param website
 * @param employees
 * @param phone
 * @param Otherphone
 * @param Email
 */
public void createOrganizationPage(String OrganName,String website,String employees,String phone,String Otherphone,String Email) {
	
	getOrganizationName().sendKeys(OrganName);
	getWebsite().sendKeys(website);
	getEmployees().sendKeys(employees);
	getPhone().sendKeys(phone);
	getOtherPhone().sendKeys(Otherphone);
	getEmail().sendKeys(Email);
	getSave().click();
}
/**
 * This is a business library to create a new organization
 * @param OrganName
 * @param website
 * @param billingAdd
 * @param billingcity
 * @param billingState
 */
public void createOrganizationPage(String OrganName,String website,String billingAdd,String billingcity,String billingState) {
	
	getOrganizationName().sendKeys(OrganName);
	getWebsite().sendKeys(website);
	getEmployees().sendKeys(billingAdd);
	getBillingCity().sendKeys(billingcity);
	getBillingState().sendKeys(billingState);
	getSave().click();
}
}
