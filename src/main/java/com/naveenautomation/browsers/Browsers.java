package com.naveenautomation.browsers;

public enum Browsers {

	// This class represent browser

	CHROME("Google Chrome"), 
	EDGE("Microsoft Edge"),
	FIREFOX("Mozilla Firefox"),
	SAFARI("Safari Browser"), 
	ANDROID("Android Browser"), 
	SAMSUNG("Samsung Browser");//added samsung browser

	public String browserName;

	Browsers(String browser) {
		this.browserName = browser;
	}

	// Method to get the name of the browser
	public String getBrowserName() {
		return browserName;
	}
}
