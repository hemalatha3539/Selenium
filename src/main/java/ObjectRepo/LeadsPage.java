package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	 private WebElement Leadsmainpage;

	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsmainpage() {
		return Leadsmainpage;
	}
	/*
	This is a business library to click on create new lead icon in leads page
	 */
	public void clickOnCreateLeadsPageIcon()
	{
		getLeadsmainpage().click();
	}
}
