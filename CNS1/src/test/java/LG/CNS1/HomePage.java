package LG.CNS1;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;

	@BeforeClass
	public void initialize() throws IOException
	{
		driver= InitializeDriver();
		driver.get("https://www.lg.com/in");
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigator(String UserName, String Password) throws IOException
	{
	
	LandingPage lp= new LandingPage(driver);
	lp.getLogin().click();
	LoginPage l =new LoginPage(driver);
	l.getEmail().sendKeys(UserName);
	l.getpassword().sendKeys(Password);
	l.getsignin().click();
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="Sandeep";
		data[0][1]="12345y6u7@23456";
		
		return data;
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	

	
	
	

}
