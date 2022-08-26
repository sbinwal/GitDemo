package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;

	public static Logger Log = LogManager.getLogger(base.class.getName());
@BeforeTest
	
	public void initialize() throws IOException {
		 driver=  initializeDriver();
		  
}
	
	@Test(dataProvider="getData")
	public void basePageNavigator(String UserName,String Password,String text ) throws IOException {
		
	
	  String url1 = prop.getProperty("url");
	  
		driver.get(url1);
         
		
	  
		Landingpage l= new Landingpage(driver);
		l.PopUp().click();
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(UserName);
		lp.getpassword().sendKeys(Password);
		Log.info(text);
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
		public void tearDown() {
			driver.close();
		}
		


	

	
}
