package com.naveenautomation.env;

public enum Environment {
//adding comment here that will be in stash for now.
	DEV("https://naveenautomationlabsdev.com/opencart/index.php?route=account/login"),
	STAGE("https://naveenautomationlabsstage.com/opencart/index.php?route=account/login"),
	PROD("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	String envUrl; // this environment variable.

	Environment(String envUrl) {
		this.envUrl = envUrl;
	}

	public String getEnvUrl() {
		return envUrl;
	}
	
	

}
