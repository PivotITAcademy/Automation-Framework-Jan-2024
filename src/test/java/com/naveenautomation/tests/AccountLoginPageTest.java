package com.naveenautomation.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.utility.ExcelUtils;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test(dataProvider = "LoginData2",enabled = true)
	public void validateLogin(String username,String password) {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin(username, password);
	}

	@DataProvider(name = "LoginData")
	private String[][] loginInfoProvider() throws IOException {
		String filePath = "C:\\Users\\Vishnu\\Desktop\\PIVOT\\LoginDetails.xlsx";
		//String filePath = "F:\\Eclipse Workspaces for Pivot\\3rd September Batch\\3rd-September-AutomationFramework\\TestData\\LoginDetails.xlsx";
		int rowCount = ExcelUtils.getRowCount(filePath, "Sheet2");
		int colCount = ExcelUtils.getColumnCount(filePath, "Sheet2", rowCount);
		String[][] loginData = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				loginData[i - 1][j] = ExcelUtils.getCellValue(filePath, "Sheet2", i, j);
			}
		}
		return loginData;
	}
	
	@DataProvider(name = "LoginData2")
	private String[][] loginInfoProvider2() throws IOException {
		
		String[][] loginData =new String[2][2];
		
		loginData[0][0]= "Parul";
		loginData[0][1]= "Shukla";
		loginData[1][0]= "Ankit";
		loginData[1][1]= "Shukla";
		return loginData;
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
