package LG.CNS1;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.base;

public class Validate2 extends base {
	
	public WebDriver driver;

	@BeforeClass
	public void initialize() throws IOException
	{
		driver= InitializeDriver();
		driver.get("https://www.lg.com/in");
	}
	
	
	@Test
	public void basePageNavigator() throws IOException
	{
		driver= InitializeDriver();
	driver.get("https://www.lg.com/in");
	LandingPage lp= new LandingPage(driver);
	Assert.assertTrue(lp.getDispay().isDisplayed());
	
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

	
	
	

}
