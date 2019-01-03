package aps.TestScripts;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import aps.ExtentReportNGListener.ExtentReporterNG;
import aps.Pages.HomePage;
import aps.Pages.LoginPage;
import aps.TestBase.APSTestBase;


public class HomePageTest extends APSTestBase
{
	LoginPage loginpage;
	HomePage homepage;
	ExtentReporterNG extentrepot;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp()
	{
		homepage = new HomePage();
		extentrepot = new ExtentReporterNG();
	}
	
	@Test(priority=1)
	public void pageTitleTest()
	{
		//homepage = new HomePage();
		System.out.println("driver="+driver);
		String title = homepage.getPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "Coupa CW", "Always pass");
		//extentrepot.test.log(LogStatus.FAIL, extentrepot.extent.);
	}
	
	@Test(priority=2)
	public void clientSelectionTest()
	{
		homepage.clientSelection();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
}
