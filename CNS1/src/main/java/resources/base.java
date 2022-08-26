package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException
	{
	 prop = new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\csc\\FrameworkFromScratch\\CNS1\\src\\main\\java\\resources\\data.properties");
		prop.load(fi);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
			 driver = new ChromeDriver();// this will have methods of only web driver
		}
		else if(browserName=="firefox")
		{
			
		}
		else if(browserName=="IE")
		{
			
		
		
	}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}
}
