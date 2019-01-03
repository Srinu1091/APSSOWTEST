package aps.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import aps.Pages.HomePage;
import aps.Pages.LoginPage;
import aps.TestBase.APSTestBase;

public class LoginPageTest extends APSTestBase
{
	public static LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginTest() throws IOException
	{
		homepage = loginpage.loginMethod();
	}
	
	@Test(priority=2)
	public void pageTitleTest()
	{
		Assert.assertEquals(loginpage.getPageTitle(), "Coupa CW");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
