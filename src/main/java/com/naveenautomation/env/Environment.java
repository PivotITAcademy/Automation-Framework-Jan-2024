package com.naveenautomation.env;

public enum Environment {

	
         
	
	
	
	DEV("https://naveenautomationlabsdev.com/opencart/index.php?route=account/login"),
	STAGE("https://naveenautomationlabsstage.com/opencart/index.php?route=account/login"),
	PROD("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	String envUrl;  // Making a change envURL

	Environment(String envUrl) {
		this.envUrl = envUrl;
	}

	public String getEnvUrl() {
		return envUrl;
	}
	
	

}
