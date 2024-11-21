package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SeleniumUtility {
	public void implicitWait(WebDriver driver,int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		}
	public void maxiMizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void navigate(WebDriver driver,String url) {
		driver.navigate().to(url);
		
	}
	public String captureSceernShot( WebDriver driver,String screenshotName ) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(".\\Screenshot\\"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
		
	}

}
