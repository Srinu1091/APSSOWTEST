package aps.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportNG 
{
	static ExtentReports reports;
	static ExtentTest test;
	static WebDriver driver;
	
	@BeforeClass
	public void startTest()
	{
	reports = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");
	test = reports.startTest("ExtentReportNG");
	}
	
	@Test
	public void reportNG()
	{
		System.setProperty("webdriver.chrome.driver", "//home//srinu//Downloads//chromedriver_linux64//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google"))
			{
				test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
		else
			{
				test.log(LogStatus.FAIL, "Test Failed");
			}
	
	}
	@AfterClass
	public static void endTest()
	{
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
		
	
	
		
}
