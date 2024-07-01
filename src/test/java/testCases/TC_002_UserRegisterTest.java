package testCases;



import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.UserRegisterPage;
import testBase.BaseClass;

public class TC_002_UserRegisterTest extends BaseClass {
	
	@Test(groups={"sanity","regression"})
	
	public void verify_UserRegisterTest() {
		logger.info("**** starting TC_002_UserRegisterTest  *****");
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		lp.loginSuccessMsg();
		
		UserRegisterPage URP= new UserRegisterPage(driver);
		URP.ClickAdminSideMenu();
		URP.ClickUserRegisterSideMenu();
		URP.ClickUserAddButton();
		URP.EnterFirstName(randomeString().toLowerCase());
		URP.EnterLastName(randomeString().toLowerCase());
		
		URP.SelectGender();
		URP.SelectMaleGender();
		URP.EnterUserName(randomeString().toLowerCase());
		URP.CheckUserNameAvailability();
		URP.enterPassword(p.getProperty("user_password"));
		URP.enterConfirmPassword(p.getProperty("user_confirm_password"));
		URP.enterConfirmActiveEmail(randomAlphaNumeric());
		URP.click_UserEffective_date();
		URP.userEffectiveDate_Calender_NextButton();
		//URP.check_Current_Month_Year();
		URP.selectAllDates();
		URP.enterMobileNumber(randomeNumber());
		URP.profileEffectiveFromDate();
		URP.profileEffectiveDate_Calender_NextButton();
		//URP.check_profile_Current_Month_Year();
		URP.selectProfileUserAllDates();
		URP.selectUserLoginType();
		URP.SelectWebAndMobileLoginType();
		URP.SelectDesignationType();
		URP.SelectDynamicDesignationType();
		URP.userSubmitBtn();
		URP.userCreatedSuccess();
		logger.info("**** finished TC_002_UserRegisterTest  *****");
	}
}
