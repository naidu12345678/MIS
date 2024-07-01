package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@name='userName']") 
	WebElement enterusername;

	@FindBy(xpath="//input[@name='password']") 
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickLogin;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-13tqxrv']//p[@class='MuiTypography-root MuiTypography-body1 css-1uw2re7'][normalize-space()='Active role']")
	WebElement loginSuccessMsg;
	
	

	public void enterusername(String uname)
	{
		enterusername.sendKeys(uname);
	}

	public void enterpassword(String pwd)
	{
		enterpassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		clickLogin.click();
	}
	
	public String loginSuccessMsg()
	{
		try {
			return (loginSuccessMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	
	}
}
	
	
	
	
	

