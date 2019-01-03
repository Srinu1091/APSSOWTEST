package aps.TestScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import aps.Pages.CreateIdentifiedSOWPage;
import aps.TestBase.APSTestBase;

public class CreateIdentifiedSOWPageTest extends APSTestBase
{
	static CreateIdentifiedSOWPage identifiedSOW;
	public CreateIdentifiedSOWPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void ObjectsSetUp()
	{
		identifiedSOW = new CreateIdentifiedSOWPage();
	}
	
	@Test
	public void navigation()
	{
		identifiedSOW.navigationToCreateIdentifiedSOW();
		
	}
	
	
}
