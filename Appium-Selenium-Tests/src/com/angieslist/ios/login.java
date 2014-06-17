package com.angieslist.ios;

import static org.junit.Assert.*;
import junit.framework.Assert;
import io.appium.java_client.AppiumDriver;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.angieslist.common.*;

public class login {
	
	public static void login(AppiumDriver driver) {
		
		try {
		
		System.out.println("Login In Progress....");
				
		String email = "member1@example.com";
		String password = "test";
		//driver.findElement(By.name("SIGN IN")).click();
			//Thread.sleep(2000);
		//driver.findElement(By.name("Cancel")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("SIGN IN")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//textfield[1]")).sendKeys(email);
		//driver.findElement(By.xpath("//textfield[2]")).sendKeys(password);
		
		WebElement textFieldEmail = driver.findElement(By.xpath("//UIATextField[1]"));
		textFieldEmail.sendKeys(email);
		
		WebElement textFieldPassword = driver.findElement(By.xpath("//UIASecureTextField[1]"));
		textFieldPassword.sendKeys(password+"\n");
		
		Thread.sleep(5000);
		
		WebElement alertLoginError  = null;
		try
		{
		alertLoginError = driver.findElement(By.xpath("//UIAAlert[1]"));
		}
		catch(NoSuchElementException e) {
			
		}
		
		if(alertLoginError != null)
			assertFalse("Log In Error", alertLoginError.isDisplayed());
		
		
		System.out.println("Login In successfull");
		
		//driver.quit();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}       
	}
	
	public static void InValidlogin() {
		
		try {
			
		AppiumDriver driver = AppiumDriverTestSetup.LaunchApp();
		
		String email = "member1@example.com";
		String password = "testxxxx";
		driver.findElement(By.name("SIGN IN")).click();
			Thread.sleep(2000);
		driver.findElement(By.name("Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("SIGN IN")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//textfield[1]")).sendKeys(email);
		//driver.findElement(By.xpath("//textfield[2]")).sendKeys(password);
		
		WebElement textFieldEmail = driver.findElement(By.xpath("//UIATextField[1]"));
		textFieldEmail.sendKeys(email);
		
		WebElement textFieldPassword = driver.findElement(By.xpath("//UIASecureTextField[1]"));
		textFieldPassword.sendKeys(password+"\n");
		
		Thread.sleep(5000);
		WebElement alertLoginError = driver.findElement(By.xpath("//UIAAlert[1]"));
		
		assertTrue("Log In Error", alertLoginError.isDisplayed());
		
		driver.quit();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		        
	}


}
