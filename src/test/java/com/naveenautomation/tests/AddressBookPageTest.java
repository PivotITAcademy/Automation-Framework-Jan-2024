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

	@Test()
	public void validateUserCanAddNewAddress() {
		myAccountPage = page.submitLogin("mansan@gmail.com", "Password2");
		addressBookPage = myAccountPage.clickSideNavMenuItem("Address Book");
		addAddressPage = addressBookPage.clickNewAddressBtn();
		addressBookPage = addAddressPage.SubmitAddress("Munna", "Thakur", "Dhinchak Pooja corp", "Khandala", "Mumbai",
				"L6Z3Y6", "Canada", "Ontario");
		String bannerText = addressBookPage.getBannerText();
		Assert.assertEquals(bannerText, "Your address has been successfully added");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
