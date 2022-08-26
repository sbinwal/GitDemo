package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	WebDriver driver;
	By email = By.xpath("//input[@id='txtBoxEmail']");
	By password = By.xpath("//input[@id='txtBoxPassword']");
	By signin= By.xpath("//div[@class='btn-area']//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getsignin()
	{
		return driver.findElement(signin);
	}
}
