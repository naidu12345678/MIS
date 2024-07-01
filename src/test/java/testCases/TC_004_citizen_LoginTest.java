package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_citizen_LoginTest extends BaseClass {
	
@Test(groups= {"sanity","regression"})
	
	public void verify_Citizen_LoginTest()
	{
		logger.info("**** starting TC_001_LoginTest  *****");
		
		logger.debug("application logs started......");
		
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("citizen_username"));
		logger.info("Enter username");
		
		lp.enterpassword(p.getProperty("citizen_password"));
		logger.info("Enter password");

		
		lp.clickLogin();
		logger.info("clicked on login button");

		lp.loginSuccessMsg();
		logger.info("login success confirmation message");
		
		
		logger.info("**** finished TC_001_LoginTest  *****");
	}
	
}
