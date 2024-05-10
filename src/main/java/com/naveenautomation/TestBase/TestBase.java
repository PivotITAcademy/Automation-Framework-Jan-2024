package com.naveenautomation.TestBase;

import java.time.Duration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;

import com.naveenautomation.Listeners.WebDriverEvents;
import com.naveenautomation.browsers.Browsers;
import com.naveenautomation.env.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	private static Browsers DEFAULT_BROWSER = Browsers.CHROME;
	private static Environment DEFAULT_ENV = Environment.PROD;
	public static Logger logger;
	private WebDriverEvents events;
	private EventFiringWebDriver eDriver;

	@BeforeClass
	public void setUpLogger() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);
	}

	public void intialisation() {
		setBrowserForTesting();
		driverManagement();
		logger.info("Loading Page in Browser");
		driver.get(DEFAULT_ENV.getEnvUrl());
	}

	private void driverManagement() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	private void setBrowserForTesting() {
		switch (DEFAULT_BROWSER) {
		case CHROME:

			logger.info("Launching Chrome Browser");
			driver = new ChromeDriver();
			break;
		case FIREFOX:

			logger.info("Launching Firefox Browser");
			driver = new FirefoxDriver();
			break;
		case EDGE:
			logger.info("Launching Edge Browser");
			driver = new EdgeDriver();
			break;

		default:
			throw new IllegalArgumentException();
		}

		// Intialising Event Firing Webdriver
		eDriver = new EventFiringWebDriver(driver);

		// Intialising Webdriver Events
		events = new WebDriverEvents();

		// Register the event
		eDriver.register(events);
		driver = eDriver;
	}

	public void tearDown() {
		driver.close();
	}

}
