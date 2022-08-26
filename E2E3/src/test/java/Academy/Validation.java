package Academy;

import java.io.IOException;
import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
public static java.util.logging.Logger Log = LogManager.getLogger(Base.class.getName());
public class Validation extends Base {

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialised");
	}
	@Test
	public void basePageNavigator() throws IOException
	{
		
		
		//driver.get("http://qaclickacademy.com");
		 driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.PopUp().click();
		
		Assert.assertEquals("FEATURED COURSES", l.Title().getText());
		Log.info("successfully validated Text message");
		
		
		
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
