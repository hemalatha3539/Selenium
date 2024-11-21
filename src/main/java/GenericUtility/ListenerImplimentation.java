package GenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation implements ITestListener {
	javaUtility jUtil=new javaUtility();
	String dateTimeStamp=jUtil.getCalenderDetails("dd-mm-yyyy hh-mm-ss");
	ExtentTest test;
	ExtentSparkReporter reporter;
	ExtentReports report;
	public void onTestStart(ITestResult result) {
		System.out.println("suite  execution started");
		String methodName=result.getMethod().getMethodName();
		test=report.createTest(methodName);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("suite execution success");
		String methodName=result.getMethod().getDescription();
		System.out.println(methodName+"Execution passed");
		test.log(Status.PASS,methodName+"Excecution pass" );

	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Excecution failed");
		test.log(Status.FAIL,methodName+"Excecution failed" );
		//capturing screenshot
		SeleniumUtility sUtil=new SeleniumUtility();

		String screenshotName=methodName+dateTimeStamp;
		try {
			String path=sUtil.captureSceernShot(BaseClass.sdriver,screenshotName);
			test.addScreenCaptureFromPath(path);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("suite got skipped");
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"Excecution skipped");
		test.log(Status.SKIP,methodName+"Excecution skipped" );

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		reporter=new ExtentSparkReporter(".\\ExtentReport\\Report"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VtigerTesting report");
		reporter.config().setReportName("Vtiger");
		reporter.config().setTheme(Theme.DARK);
		
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888/");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Base reporter", "Hari");


	}

	public void onFinish(ITestContext context) {
		System.out.println("suite excecution got finish");
		report.flush();

	}


}
