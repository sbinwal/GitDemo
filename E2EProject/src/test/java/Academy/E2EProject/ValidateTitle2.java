package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;

import resources.base;

public class ValidateTitle2 extends base{

	
	public static Logger Log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	
	public void initialize() throws IOException {
		 driver=  initializeDriver();
		  String url1 = prop.getProperty("url");
		  
			driver.get(url1);
	}
	
	@Test
	public void basePageNavigator() throws IOException {
		
	 
		Landingpage l= new Landingpage(driver);
		l.PopUp().click();
		//Compare thevtext from the browser with actual text
		
		
		Assert.assertTrue(l.Display().isDisplayed());
		Log.info("Navigation bar is displayed");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
		
	


	

	
}
