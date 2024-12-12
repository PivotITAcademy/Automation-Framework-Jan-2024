package com.naveenautomation.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.utility.Utility;

public class CustomListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
        //neelam
		logger.info("Test Starts : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test Passed : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		logger.info("Test Failed !!!!! Taking Screenshot : " + result.getName());
		Utility.takeFailedTestScreenShot(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skipped : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
