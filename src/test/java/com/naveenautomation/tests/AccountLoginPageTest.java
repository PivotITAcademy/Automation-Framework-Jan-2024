package com.naveenautomation.tests;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test(enabled = true)
	public void validateLogin() {

		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("mansan@gmail.com", "Password1");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
