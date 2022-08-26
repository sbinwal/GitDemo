package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By popup = By.xpath("//div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']");
	By title =By.xpath("//section/div/div/h2");
	
public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public WebElement getLogin() {
	
	return driver.findElement(signin);
}

public WebElement PopUp() {
	
	return driver.findElement(popup);
}

public WebElement Title() {
	
	return driver.findElement(title);
}
}
