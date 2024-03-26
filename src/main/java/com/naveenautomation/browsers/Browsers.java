package com.naveenautomation.browsers;

public enum Browsers {

	// This class represent browser

	CHROME("Google Chrome"), 
	EDGE("Microsoft Edge"),
	FIREFOX("Mozilla Firefox"),
	SAFARI("Safari Browser"), 
	SAMSUNG("Samsung Browser"),//added samsung browser
	OPERA("opera browser");//added opera browser

	public String browserName;

	Browsers(String browser) {
		this.browserName = browser;
	}

	// Method to get the name of the browser
	public String getBrowserName() {
		return browserName;
	}
}
