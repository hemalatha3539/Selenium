package ObjectRepo;

import org.openqa.selenium.WebDriver;
/*
 * 
 * this class will store all the locators and methods of a login page 
 * 
 * */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextfield;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*
	 * the above line cinstructor
	 * for initialization
	 * *
	 * */
	
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void LoginToAplication(String username,String password)
	{
		getUsernameTextfield().sendKeys(username);
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}
}
