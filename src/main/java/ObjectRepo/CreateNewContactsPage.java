package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	@FindBy(xpath="//input[@name='firstname'] ")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;
    //all the elements will locate here
	public CreateNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTitle() {
		return title;
	}
	public WebElement getSave() {
		return save;
	}

	public void  CreateNewContactsPage1(String firstName,String lastName,String Title)
	{
		getFirstname().sendKeys(firstName);
		getLastname().sendKeys(lastName);
		getTitle().sendKeys(Title);
		getSave().click();
	}
	
}
