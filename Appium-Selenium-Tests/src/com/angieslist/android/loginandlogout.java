package com.angieslist.android;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

import java.awt.List;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class loginandlogout {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File appDir = new File("/Users/dhangad/servicetown_android/servicetown_member_app/servicetown_app/bin");
		File app = new File(appDir, "SnapFix.apk");
		
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability("device", "android");
		cp.setCapability("version", "4.x");
		cp.setCapability("deviceType", "phone");
		cp.setCapability("app", app.getAbsolutePath());
		cp.setCapability("appPackage", "com.angieslist.servicetown.member");
		cp.setCapability("appActivity", "activity.LoginActivity");
		

		// RemoteWebDriver driver = new RemoteWebDriver(new
		// URL("http://127.0.0.1:4723/wd/hub"), cp);

		AppiumDriver driver = null;
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cp);

		// WebElement textField = driver.findElement(By.id("email"));
		// textField.sendKeys("Admin");

		// System.out.println(driver.findElements(By.className("android.widget.EditText")).get(0).getText());
		java.util.List<WebElement> textFields = driver.findElements(By
				.className("android.widget.EditText"));

		textFields.get(0).sendKeys("member1@example.com");
		textFields.get(1).sendKeys("test");
		
		//driver.scroll ("Sign In");

		// driver.findElement(By.name("Return")).click();
		// driver.hideKeyboard();
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript(KEYBOARD_DONE);
		
		//driver.navigate().back();
				
				//"mobile: hideKeyboard", [{keyName: "Done"}])
		

		java.util.List<WebElement> buttons = driver.findElements(By
				.className("android.widget.Button"));
		System.out.println(buttons.get(0).getTagName());
		System.out.println(buttons.get(0).getText());
		buttons.get(0).click();

		// WebElement signIn = driver.findElementById("login");
		// signIn.click(); 

		// System.out.println(driver.getTitle());

	}
}

