package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile ;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noofemployees;
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNoofemployees() {
		return noofemployees;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getPoBox() {
		return poBox;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getSave() {
		return save;
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 */
	public void createNewLead(String fname,String lname,String company) {
		getFirstName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getCompany().sendKeys(company);
		getSave().click();
	}
	/**
	 *  This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 * @param Title
	 * @param Phone
	 * @param mobileno
	 * @param Email
	 * @param NoofEmp
	 * @param street
	 * @param postalcode
	 * @param PoBox
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createNewLead(String fname,String lname,String company,String title ,String phone,String mobileno ,String Email,String NoofEmp,String street,String postalcode,String PoBox,String city,
			String country,String state ) {
		getFirstName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(phone);
		getMobile().sendKeys(mobileno);
	    getEmail().sendKeys(Email);
		getNoofemployees().sendKeys(NoofEmp);
		getStreet().sendKeys(street);
		getPostalCode().sendKeys(postalcode);
		getPoBox().sendKeys(PoBox);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSave().click();
	}
	public void createNewLead(String fname,String lname,String company,String Title ,String Phone,String mobileno ,String Email,String NoofEmp)
	{
		getFirstName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getCompany().sendKeys(company);
		getTitle().sendKeys(Title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(mobileno);
	    getEmail().sendKeys(Email);
		getNoofemployees().sendKeys(NoofEmp);
	}
	public void createNewLead(String fname,String lname,String company,String street,String postalcode,String PoBox,String city,
			String country,String state ) {
		getFirstName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getCompany().sendKeys(company);
		getStreet().sendKeys(street);
		getPostalCode().sendKeys(postalcode);
		getPoBox().sendKeys(PoBox);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSave().click();
	}
}
