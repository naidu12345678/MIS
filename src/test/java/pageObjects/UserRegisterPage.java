package pageObjects;



import java.util.List;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class UserRegisterPage extends BasePage {

WebDriver driver;
//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	
	public UserRegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding css-5e36tf']//*[text()='Admin']")
	WebElement ClickAdminSideMenu;
	
	@FindBy(xpath="//ul[@class='MuiList-root MuiList-padding css-5e36tf']//*[text()='User Register']")
	WebElement ClickUserRegisterSideMenu;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-d0uhtl']//*[@aria-label='Create']")
	WebElement ClickUserAddButton;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement EnterFirstName;
	
	@FindBy(xpath="//div[@class='MuiGrid-root css-1kaunvl']//*[@name='lastName']")
	WebElement EnterLastName;
	
	@FindBy(xpath="//div[@id='genderId']")
	WebElement SelectGender;
	
	@FindBy(xpath="//*[text()='MALE']")
	WebElement SelectMaleGender;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement EnterUserName;
	@FindBy(xpath="//button[@aria-label='Check Availability']")
	WebElement CheckUserNameAvailability;
	
	@FindBy(xpath="//input[@name='userPassword']")
	WebElement enterPassword;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement enterConfirmPassword;
	
	@FindBy(xpath="//input[@name='activeProfile.emailId']")
	WebElement enterConfirmActiveEmail;
	
	@FindBy(xpath="//div[9]//div[1]//div[1]//div[1]//div[1]//button[1]")
	WebElement click_UserEffective_date;
	
	@FindBy(xpath="//button[@title='Next month']")
	WebElement userEffectiveDate_Calender_NextButton;
	
	@FindBy(xpath="//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	WebElement check_Current_Month_Year;
	
	@FindBy(xpath="//div[@class='MuiDayPicker-monthContainer css-i6bazn']//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-gnajhx']")
	List<WebElement> selectAllDates;
	
	@FindBy(xpath="//input[@name='activeProfile.mobileNo']")
	WebElement enterMobileNumber;
	
	@FindBy(xpath="//div[18]//div[1]//div[1]//div[1]//div[1]//button[1]")
	WebElement profileEffectiveFromDate;
	
	@FindBy(xpath="//button[@title='Next month']")
	WebElement profileEffectiveDate_Calender_NextButton;
	
	@FindBy(xpath="//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	WebElement check_profile_Current_Month_Year;
	
	@FindBy(xpath="//div[@class='MuiDayPicker-monthContainer css-i6bazn']//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-gnajhx']")
	List<WebElement> selectProfileUserAllDates;
	
	@FindBy(xpath="//div[@id='activeProfile.loginType']")
	WebElement selectUserLoginType;
	
	@FindBy(xpath="//*[text()='Web And Mobile']")
	WebElement SelectWebAndMobileLoginType;
	
	@FindBy(xpath="//div[@id='activeProfile.designation']")
	WebElement SelectDesignationType;
	
	@FindBy(xpath="//*[text()='naidutest']")
	WebElement SelectDynamicDesignationType;
	
	@FindBy(xpath="//div[@class='MuiCardActions-root MuiCardActions-spacing css-3zukih']//*[@type='submit']")
	WebElement userSubmitBtn;
	
	@FindBy(xpath="//div[@class='reapop__container reapop__container--top-right']")
	WebElement userCreatedSuccess;
	
	public void ClickAdminSideMenu() {
		
		ClickAdminSideMenu.click();
	}
	
	public void ClickUserRegisterSideMenu() {
		ClickUserRegisterSideMenu.click();
	}
	
	public void ClickUserAddButton() {
		ClickUserAddButton.click();
	}
	
	public void EnterFirstName(String fname) {
		EnterFirstName.sendKeys(fname);
	}
	public void EnterLastName(String lname) {
		EnterLastName.sendKeys(lname);
	}
	
	public void SelectGender() {
		SelectGender.click();
	}
	
	public void SelectMaleGender() {
		SelectMaleGender.click();
	}
	
	public void EnterUserName(String uname) {
		EnterUserName.sendKeys(uname);
	}
	public void CheckUserNameAvailability() {
		CheckUserNameAvailability.click();
	}
	
	public void enterPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}
	public void enterConfirmPassword(String pwd) {
		enterConfirmPassword.sendKeys(pwd);
	}
	
	public void enterConfirmActiveEmail(String email) {
		enterConfirmActiveEmail.sendKeys(email);
		
	}
	
	public void click_UserEffective_date() {
		click_UserEffective_date.click();
	}
	
	public void userEffectiveDate_Calender_NextButton() {
		String desired_month_year = "April 2025";
		String date = "25";
		while(true) {
			String current_month_year=check_Current_Month_Year.getText();
			//System.out.println(current_month_year);
		if(current_month_year.equals(desired_month_year)) {
			break;
		}else {
			userEffectiveDate_Calender_NextButton.click();
		}
		
		}
		
		List<WebElement> allDates=selectAllDates;
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
	
	public void check_Current_Month_Year() {
		check_Current_Month_Year.click();
	}
	
	public Object selectAllDates() {
		return null;
	}
	
	/*public void selectAllDates() {
		String date = "25";
	
		List<WebElement> allDates=selectAllDates;
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
	}	*/
	public void enterMobileNumber(String mobilenumber) {
		enterMobileNumber.sendKeys(mobilenumber);
	}
	public void profileEffectiveFromDate() {
		profileEffectiveFromDate.click();
	}
	public void profileEffectiveDate_Calender_NextButton() {
		String desired_month_year = "April 2025";
		String date = "20";
		while(true) {
			String current_month_year=check_profile_Current_Month_Year.getText();
			//System.out.println(current_month_year);
		if(current_month_year.equals(desired_month_year)) {
			break;
		}else {
			profileEffectiveDate_Calender_NextButton.click();
		}
		
		}
		
		List<WebElement> allDates=selectProfileUserAllDates;
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
	
	public void check_profile_Current_Month_Year() {
		check_profile_Current_Month_Year.click();
	}
	
	public Object selectProfileUserAllDates() {
		return null;
	}
	/*public void selectProfileUserAllDates() {
		String date = "20";
	
		List<WebElement> allDates=selectProfileUserAllDates;
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		
	}		*/
	
	public void selectUserLoginType() {
		selectUserLoginType.click();
	}
	
	public void SelectWebAndMobileLoginType() {
		SelectWebAndMobileLoginType.click();
	}
	
	public void SelectDesignationType() {
		SelectDesignationType.click();
	}
	
	public void SelectDynamicDesignationType() {
		SelectDynamicDesignationType.click();
	}
	
	public void userSubmitBtn() {
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiCardActions-root MuiCardActions-spacing css-3zukih']//*[@type='submit']"))).click();
		userSubmitBtn.click();
	}
	
	public void userCreatedSuccess()
	{
		String textmsg=userCreatedSuccess.getText();
		if(textmsg.contains("")) {
			System.out.println("successful UserCreated");
		}
		else {
			System.out.println("login failed");
		}
	}
		
}


	
	
	


