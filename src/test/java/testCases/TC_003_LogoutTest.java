package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testBase.BaseClass;

public class TC_003_LogoutTest extends BaseClass {
	
	
	@Test(groups={"sanity","regression"})
	
	public void profile_setting_icon() {
		logger.info("**** starting TC_003_UserLogoutTest  *****");
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		lp.loginSuccessMsg();
		
		LogoutPage lo=new LogoutPage(driver);
		lo.profile_setting();
		lo.logoutBut();
		logger.info("**** finished TC_003_LogoutTest  *****");
		
	}

}
