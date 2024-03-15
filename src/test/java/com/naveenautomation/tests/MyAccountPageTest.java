package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test(enabled =false)
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage=page.submitLogin("mansan@gmail.com", "Password2");
		String myAccountText=myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText, "My Munni Account");
	}

	@Test(enabled=false)
	public void validatePasswordUpdate() {

		//Login in
		myAccountPage=page.submitLogin("mansan@gmail.com", "Password2");
		//Updating Password
		changePwdPage=myAccountPage.clickChangePasswordBtn();
		//Updating Password
		myAccountPage=changePwdPage.updatePassword("Password2", "Password2");

		String pwdAlertMessage = myAccountPage.getPasswordUpdateAlertText();

		//Asserting whether password change is successfully or not
		Assert.assertEquals("Success: Your password has been successfully updated.", pwdAlertMessage);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
