package com.naveenautomation.browsers;

public enum Browsers {
	
	//This class represent browser

	CHROME("Google Chrome"),
	EDGE("Microsoft Edge"),
	FIREFOX("Mozilla Firefox");
	
	public String browserName;  //this is browser variable
 
	Browsers(String browser) {
		this.browserName=browser;
	}

	public String getBrowserName() {
		return browserName;
	}	
}
