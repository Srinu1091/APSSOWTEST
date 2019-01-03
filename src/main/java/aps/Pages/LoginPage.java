package aps.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aps.TestBase.APSTestBase;

public class LoginPage extends APSTestBase
{
	//Xpath of the user name field 
	@FindBy(xpath="//input[@name='ctl00$DefaultContent$TxtEmailAddress']")
	WebElement username;
	
	//Xpath of the password field
	@FindBy(xpath="//input[@name='ctl00$DefaultContent$TxtPassword']")
	WebElement password;
	
	//Xpath of the SignIn button
	@FindBy(xpath="//input[@name='ctl00$DefaultContent$btnLog']")
	WebElement signInButton;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginMethod() throws IOException 
	{
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signInButton.click();
		
		return new HomePage();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	
}
