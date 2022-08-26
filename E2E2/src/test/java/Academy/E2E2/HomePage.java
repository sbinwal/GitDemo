package Academy.E2E2;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.loginPage;
import resources.base;

public class HomePage extends base {

	@Test(dataProvider="getData")
	public void basePageNavigation(String UserName,String Password,String text) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.PopUp().click();
		l.getLogin().click();
		loginPage lp = new loginPage(driver);
		lp.getemail().sendKeys("sandeep");
		lp.getpassword().sendKeys("sandeepbinwal");
		
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
}
