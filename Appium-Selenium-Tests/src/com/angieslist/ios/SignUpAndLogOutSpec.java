package com.angieslist.ios;

import io.appium.java_client.AppiumDriver;

import com.angieslist.common.AppiumDriverTestSetup;

public class SignUpAndLogOutSpec {
	
	public static void main(String[] args) throws InterruptedException {
		
		AppiumDriver driver = AppiumDriverTestSetup.LaunchApp();
		
		
		SignUp.SignUp(driver);
		
		logout.logout(driver);
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
