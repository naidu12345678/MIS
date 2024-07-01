package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class citizenLoginPage extends BasePage{

	WebDriver driver;
	public citizenLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@name='userName']") 
	WebElement citizen_enterusername;

	@FindBy(xpath="//input[@name='password']") 
	WebElement citizen_enterpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement citizen_clickLogin;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-13tqxrv']//p[@class='MuiTypography-root MuiTypography-body1 css-1uw2re7'][normalize-space()='Active role']")
	WebElement citizen_loginSuccessMsg;
	
	public void enterusername(String uname)
	{
		citizen_enterusername.sendKeys(uname);
	}

	public void enterpassword(String pwd)
	{
		citizen_enterpassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		citizen_clickLogin.click();
	}
	
	public String loginSuccessMsg()
	{
		try {
			return (citizen_loginSuccessMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	
	}
}
