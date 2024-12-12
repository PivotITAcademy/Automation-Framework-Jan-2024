package com.naveenautomation.browsers;

public enum Browsers {

	// This class represent different browsers

	CHROME("chrome"), 
	EDGE("edge"),
	FIREFOX("firefox"),
	SAFARI("Safari Browser"), 
	OPERA("Opera"),//added opera browser
	ANDROID("Android Browser"), //added android browser
	SAMSUNG("Samsung Browser");//added samsung browser

	public String browserName;

	Browsers(String browser) {
		browserName = browser;
	}

	// Method to get the name of the browser
	public String getBrowserName() {
		return browserName;
	}
}
