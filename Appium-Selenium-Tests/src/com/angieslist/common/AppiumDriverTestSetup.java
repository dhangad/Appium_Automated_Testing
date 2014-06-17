package com.angieslist.common;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDriverTestSetup {
	
	public static int testcases_passed = 0;
	public static int testcases_failed = 0;
	
	public static AppiumDriver LaunchApp() {
	
		try {
		
			
		System.out.println("App launched In Progress....");
			
		File appDir = new File("/Users/dhangad/Library/Developer/Xcode/DerivedData/ServiceTown-aaoxedzrwkzrfbdyfunitsgmzxst/Build/Products/Debug-iphonesimulator");
		File app = new File(appDir, "SnapFix-Development.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(CapabilityType.VERSION, "6.1");
		capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
		capabilities.setCapability("app", app.getAbsolutePath());
		
		//WebDriver driver = null;
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub")
		//,capabilities);
		
		AppiumDriver driver = null;
		
		System.out.println("App launched");
		
		return driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//SuccessMessage();
		//Thread.sleep(2000);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("App launch fail");
			FailureMessage();
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public static void FailureMessage() {
		System.out.println("Failure");
		testcases_failed++;
	}

	public static void SuccessMessage() {
		System.out.println("Success");
		testcases_passed++;
	}

	

}
