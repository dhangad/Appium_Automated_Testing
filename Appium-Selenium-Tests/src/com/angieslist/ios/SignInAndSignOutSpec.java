package com.angieslist.ios;

import io.appium.java_client.AppiumDriver;

import org.junit.After;
import org.junit.Before;

import com.angieslist.common.AppiumDriverTestSetup;

public class SignInAndSignOutSpec {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		AppiumDriver driver = AppiumDriverTestSetup.LaunchApp();
		
		
		login.login(driver);
		
		logout.logout(driver);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
