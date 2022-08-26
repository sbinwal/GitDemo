package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
    public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\csc\\FrameworkFromScratch\\E2E3\\src\\main\\java\\Academy\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) //We can't use == when we are extracting a value from property
		{
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
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	
}
	public void getScreenShot(String testCaseName, WebDriver driver)
	{
		TakeScreenshot ts = (TakeScreenshot) driver;
		File source= ts.getScreenShotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	}
}
