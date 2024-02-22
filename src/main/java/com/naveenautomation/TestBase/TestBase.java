package com.naveenautomation.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.naveenautomation.browsers.Browsers;
import com.naveenautomation.env.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	private static Browsers DEFAULT_BROWSER = Browsers.EDGE;
	private static Environment DEFAULT_ENV=Environment.PROD;

	public void intialisation() {
		setBrowserForTesting();
		driverManagement();
		driver.get(DEFAULT_ENV.getEnvUrl());
	}

	private void driverManagement() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	private void setBrowserForTesting() {
		switch (DEFAULT_BROWSER) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			throw new IllegalArgumentException();
		}
	}

	public void tearDown() {
		driver.close();
	}

}
