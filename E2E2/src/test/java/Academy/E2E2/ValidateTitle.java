package Academy.E2E2;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;


import resources.base;

public class ValidateTitle extends base{

	public WebDriver driver;
	

	
	@Test
	public void basePageNavigator() throws IOException {
		
	  driver=  initializeDriver();
         
		
	  
	  
	  driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.PopUp().click();
		//Compare thevtext from the browser with actual text
		
		Assert.assertEquals(l.Title().getText(), "FEAURED COURSES");
		
		
		
	}
	
		
	


	

	
}
