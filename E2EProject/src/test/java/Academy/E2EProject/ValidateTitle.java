package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;

import resources.base;

public class ValidateTitle extends base{

	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(base.class.getName());
@BeforeTest
	
	public void initialize() throws IOException {
		 driver=  initializeDriver();
		 Log.info("Driver is initialised");
		  String url1 = prop.getProperty("url");
		  Log.info("Navigated to Homepage");
			driver.get(url1);
}
	
	@Test
	public void basePageNavigator() throws IOException {
		
	  driver=  initializeDriver();
         
		
	  String url1 = prop.getProperty("url");
	  
		driver.get(url1);
		Landingpage l= new Landingpage(driver);
		l.PopUp().click();
		//Compare thevtext from the browser with actual text
		
		Assert.assertEquals(l.Title().getText(), "FEAURED COURSES");
		Log.info("Successfully Validated text message");
		
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
		
	


	

	
}
