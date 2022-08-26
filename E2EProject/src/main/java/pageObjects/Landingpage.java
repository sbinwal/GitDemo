package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	public WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	
	By signin = By.cssSelector("a[href*='sign_in']");
	
	By popup = By.xpath("//div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']");
	
	By title =By.xpath("//section/div/div/h2");
	
	By display =By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");
	
	public WebElement getLogin() {
		
		return driver.findElement(signin);
	}
	
public WebElement PopUp() {
		
		return driver.findElement(popup);
	}

public WebElement Title() {
	
	return driver.findElement(title);
}
public WebElement Display() {
	
	return driver.findElement(display);
}
}
