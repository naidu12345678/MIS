package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
	
WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root css-1b47e06']")
	WebElement profile_setting_icon;
	
	@FindBy(xpath="//ul[@aria-labelledby='basic-button']//li[contains(text(),'Logout')]")
	WebElement logout_button;
	
	
	public void profile_setting() {
		profile_setting_icon.click();
	}
	
	public void logoutBut() {
		logout_button.click();
	}
	
	
	
}


