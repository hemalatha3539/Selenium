package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	 private WebElement contactsMainpage;
	//the above lines are for locating webelement 
	
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//the second line is for initin=alisinf the web element
	public WebElement getContactsMainpage() {
		return contactsMainpage;
	}
	
	public void  ClickContactsPage()
	{
		getContactsMainpage().click();
	}
	//this lines for Buisines libraries(business  libraries means userdefined library) 

}
