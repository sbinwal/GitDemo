package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.xpath("//div[@class='btn-area']//a[@class='btn btn-primary btn-sm']");
	
	By text = By.xpath("//div/h1");
	
	By display = By.xpath("//div[@class='navi-btm']");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getView()
	{
		return driver.findElement(text);
	}
	public WebElement getDispay()
	{
		return driver.findElement(display);
	}

}
