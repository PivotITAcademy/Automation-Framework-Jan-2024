package com.naveenautomation.browsers;

public enum Browsers {
	
	//This class represent browser

	CHROME("Google Chrome"),
	EDGE("Microsoft Edge"),
	FIREFOX("Mozilla Firefox"),
	SAMSUNG ("Samsung Browser"),
	ANDROID("Android Browser");
	
	public String browserName;

	Browsers(String browser) {
		this.browserName=browser;
	}

	public String getBrowserName() {
		return browserName;
	}	
}
