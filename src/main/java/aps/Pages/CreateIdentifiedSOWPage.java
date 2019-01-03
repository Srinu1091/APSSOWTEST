package aps.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aps.TestBase.APSTestBase;

public class CreateIdentifiedSOWPage extends APSTestBase
{
	APSTestBase testbase;
	//Main menu icon webelement
	@FindBy(xpath="//a[@class='gn-opener gn-icon gn-icon-menu' and @data-content='Menu']")
//	//@FindBy(xpath="//a[@class='gn-opener gn-icon gn-icon-menu' and @data-content='Menu']//parent::div[@class='gn-trigger']")
	WebElement menuicon;
	
	//WebElement menuicon = driver.findElement(By.xpath("//a[@class='gn-opener gn-icon gn-icon-menu' and @data-content='Menu']"));
	
	//Requirement sub menu element
	@FindBy(xpath="//a[@class='gn-icon gn-parent-menu' and text()='Requirements']")
	WebElement requirementsubmenu;
	
	//Identified SOW link
	@FindBy(xpath="//b[@class='instedEM' and text()='SOW (Identified Supplier)']")
	WebElement identifiedSOW;
	
	public CreateIdentifiedSOWPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void navigationToCreateIdentifiedSOW()
	{
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		testbase = new APSTestBase();
		Point menupoint = menuicon.getLocation();
		int xcord=menupoint.getX();
		int ycord=menupoint.getY();
		Actions action = new Actions(driver);
		action.moveByOffset(xcord, ycord).click().build().perform();
		
		
		
		
		//testbase.explicitWait(menuicon);
//		Actions action = new Actions(driver);
//		action.moveToElement(menuicon).build().perform();
//		action.click();
		//menuicon.click();
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", menuicon);
		requirementsubmenu.click();
		identifiedSOW.click();
	}
	
	
}
