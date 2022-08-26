package Academy;

import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class Validation2 extends Base {
	
	public WebDriver driver;
	
	public static java.util.logging.Logger Log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		Log.info("navigaed to HomePage");
		
	}
	@Test
	public void basePageNavigator() throws IOException
	{
		
		
		//driver.get("http://qaclickacademy.com");
	    
		LandingPage l = new LandingPage(driver);
		l.PopUp().click();
		Assert.assertTrue(l.Display().isDisplayed());
		Log.info("successfully validated Text message");
		
		
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
