package GenericUtility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver; //only for listeners
	public SeleniumUtility sutil=new SeleniumUtility();
	public PropertiesUtility putil=new PropertiesUtility ();
	public ExcelUtility eutil =new ExcelUtility();
	public javaUtility jutil=new javaUtility();
	@BeforeSuite(alwaysRun=true)
	public void dbconnection() {
		System.out.println("connection is created");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome") String BROWSER) throws Exception {
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("edge")){
			driver=new EdgeDriver();
		}else if(BROWSER.equals("firefox")){
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		sutil.implicitWait(driver, 15);
		sutil.maxiMizeWindow(driver);
		String URL=putil.getDataFromPropertiesFile("URL");
		sutil.navigate(driver, URL);
		System.out.println("Browswer launched");

	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Throwable {
		String un=putil.getDataFromPropertiesFile("Username");
		String pwd=putil.getDataFromPropertiesFile("Password");
		LoginPage lp=new LoginPage(driver);
		lp.LoginToAplication(un, pwd);
		System.out.println("login to application is done");
	}

	@AfterMethod(alwaysRun=true)
	public void logoutoperation() throws Exception {
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("logout has been done");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("quit operation has been done");
	}
	@AfterSuite(alwaysRun=true)
	public void closeDBconnection() {
		System.out.println("DB has diconnected");
	}
}
