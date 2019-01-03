package aps.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APSTestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait wait;
	public static Logger log= Logger.getLogger("APSTestBase");	
	
	public APSTestBase()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("/home/srinu/Selenium/APSSOWTest/src/main/java/aps/config/APSConfig.properties");
			prop= new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//home//srinu//Downloads//chromedriver_linux64//chromedriver");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.geckodriver.driver", "//home//srinu//Downloads//chromedriver_linux64//geckoriver");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		log.info("Accessing the URL");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void explicitWait(WebElement element)
	{
		wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
		
	}
}
