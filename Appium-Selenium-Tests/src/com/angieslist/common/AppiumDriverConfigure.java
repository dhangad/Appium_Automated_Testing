package com.angieslist.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class AppiumDriverConfigure {

	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public static boolean isLoggedIn=false;

    public static WebDriver getDriver() {
        return driver;
    }

	public void initConfigurations(){
		if(CONFIG==null){
			// config.prop
			 CONFIG = new Properties();
			try {
				FileInputStream fs = new FileInputStream("Appium/src/main/java/com/sayem/config/config.properties");
				CONFIG.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void initIOSDriver() throws MalformedURLException {
        // set up appium IOS driver
		
		File appDir = new File("/Users/dhangad/Library/Developer/Xcode/DerivedData/ServiceTown-aaoxedzrwkzrfbdyfunitsgmzxst/Build/Products/Debug-iphonesimulator");
		File app = new File(appDir, "SnapFix-Development.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(CapabilityType.VERSION, "6.1");
		capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
		capabilities.setCapability("app", app.getAbsolutePath());

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void initANDROIDDriver() throws MalformedURLException {
        // set up appium ANDROID driver
		
		File appDir = new File("/Users/dhangad/servicetown_android/servicetown_member_app/servicetown_app/bin");
		File app = new File(appDir, "SnapFix.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "android");
		capabilities.setCapability("version", "4.x");
		capabilities.setCapability("deviceType", "phone");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.angieslist.servicetown.member");
		capabilities.setCapability("appActivity", "activity.LoginActivity");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void quitDriver(){
		driver.quit();
		driver=null;
	}
}
		