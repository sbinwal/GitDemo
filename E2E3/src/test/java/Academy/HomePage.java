package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		
		Log.info("Driver is initialised");
	}
	@Test(dataProvider="getData")
	public void basePageNavigator(String UserName,String Password, String text) throws IOException
	{
		
		driver = initializeDriver();
		//driver.get("http://qaclickacademy.com);
		 driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.PopUp().click();
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(UserName);
		lp.getpassword().sendKeys(Password);
		lp.info(text);
		
		lp.Submit().click();
		
	}
	
	 @DataProvider
		public Object[][] getData()
		{
			Object[][] data = new Object[1][3];
			
			data[0][0] = "nonrestricteduser@qw.com";
			data[0][1] = "1234";
			data[0][2] = "Non Restricted User";
			
			/*data[1][0]="restricteduser@qw.com";
			data[1][1]="1234567";
			data[1][2]="Non Restricted User";*/
			return data;
			
		
		
	}
	 @AfterTest
		public void tearDown()
		{
			driver.close();
		}

}
