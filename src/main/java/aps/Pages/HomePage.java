package aps.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aps.TestBase.APSTestBase;

public class HomePage extends APSTestBase
{
	//Xpath for the client list/menu drop down
	@FindBy(xpath="//a[@class='menu-toggle dropdown-toggle clientMenu ']")
	WebElement clientList;
	
	//Xpath for the client selection text box
	@FindBy(xpath="//a[@data-clientname='arizona public service']")
	WebElement clientName;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clientSelection()
	{
		clientList.click();
		//clientName.sendKeys(prop.getProperty("clientname"));
		clientName.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}

	
	
}
