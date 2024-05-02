package com.naveenautomation.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AddAddressPage;
import com.naveenautomation.pages.AddressBookPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.utility.Utility;

public class AddressBookPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	AddressBookPage addressBookPage;
	AddAddressPage addAddressPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test(enabled = false)
	public void validateUserCanAddNewAddress() {
		myAccountPage = page.submitLogin("mansan@gmail.com", "Password2");
		addressBookPage = myAccountPage.clickSideNavMenuItem("Address Book");
		addAddressPage = addressBookPage.clickNewAddressBtn();
		addressBookPage = addAddressPage.SubmitAddress(Utility.generateRandomString(10),
				Utility.generateRandomString(10), Utility.generateRandomString(10), Utility.generateRandomString(8),
				Utility.generateRandomString(6), "L6Z3Y6", "Canada", "Ontario");
		String bannerText = addressBookPage.getBannerText();
		Assert.assertEquals(bannerText, "Your address has been successfully added");
	}

	@Test(groups = { "regression" })
	public void testCase6() {
		System.out.println("This is test case F");
	}

	@Test(groups = { "smoke" })
	public void testCase7() {
		System.out.println("This is test case G");
	}

	@Test(groups = { "regression" })
	public void testCase8() {
		System.out.println("This is test case H");
	}

	@Test(groups = { "smoke" })
	public void testCase9() {
		System.out.println("This is test case I");
	}

	@Test(groups = { "smoke" })
	public void testCase10() {
		System.out.println("This is test case J");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
