package com.naveenautomation.tests;

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

	@Test(enabled = true)
	public void validateUserCanAddNewAddress() {
		myAccountPage = page.submitLogin("harinderk@gmail.com", "Password2");
		addressBookPage = myAccountPage.clickSideNavMenuItem("Address Book");
		addAddressPage = addressBookPage.clickNewAddressBtn();
		addressBookPage = addAddressPage.SubmitAddress(Utility.generateRandomString(2), Utility.generateRandomString(2),
				Utility.generateRandomString(2), Utility.generateRandomString(8), Utility.generateRandomString(6),
				"L6Z3Y6", "Canada", "Ontario");
		String bannerText = addressBookPage.getBannerText();
		Assert.assertEquals(bannerText, "Your address has been successfully added");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
