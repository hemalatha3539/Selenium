package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement NewOrganizationPage;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNewOrganizationPage() {
		return NewOrganizationPage;
	}

	/*
	This is a business library to click on create new lead icon in leads page
	 */
	public void clickOrganizationPage()
	{
		getNewOrganizationPage().click();
	}

}
