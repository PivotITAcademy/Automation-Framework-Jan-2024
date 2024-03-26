package com.naveenautomation.browsers;

public enum Browsers {

	// This class represent browser

	CHROME("Google Chrome"), 
	EDGE("Microsoft Edge"),
	FIREFOX("Mozilla Firefox"),
	SAFARI("Safari Browser"), 
<<<<<<< HEAD
	SAMSUNG("Samsung Browser");
	
	
=======
	SAMSUNG("Samsung Browser");//added samsung browser
>>>>>>> branch 'master' of https://github.com/PivotITAcademy/Automation-Framework-Jan-2024.git

	public String browserName; 

	Browsers(String browser) {
		this.browserName = browser;
	}

	// Method to get the name of the browser
	public String getBrowserName() {
		return browserName;
	}
}
