package com.angieslist.ios;

import static org.junit.Assert.assertFalse;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class SignUp {
	
	public static void SignUp(AppiumDriver driver) {
		try {
			
			System.out.println("Signup In Progress....");
					
			driver.findElement(By.name("SIGN UP")).click();
				Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//textfield[1]")).sendKeys(email);
			//driver.findElement(By.xpath("//textfield[2]")).sendKeys(password);
				
				String address = "4545 Teal St";
				String city = "Fishers";
				String state = "IN";
				String zip = "46038";
			
			WebElement textFieldAddress = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]"));
			textFieldAddress.sendKeys(address+"\n");
			
			WebElement textFieldCity = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]"));
			textFieldCity.sendKeys(city+"\n");
			
			WebElement textFieldState = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]"));
			textFieldState.sendKeys(state);
			
			WebElement textFieldZip = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]"));
			textFieldZip.sendKeys(zip);
			
			
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]") ).click();

			Random random = new Random();
			
			Thread.sleep(5000);
			
			WebElement textFieldFirst = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]"));
			textFieldFirst.sendKeys("Jimmy");
			
			WebElement textFieldLast = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]"));
			textFieldLast.sendKeys("Johns");
			
			WebElement textFieldPhone = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]"));
			textFieldPhone.sendKeys("2344567890");
			
			WebElement textFieldEmail = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]"));
			textFieldEmail.sendKeys(random.nextInt() + "@test.com");
			
			WebElement textFieldPassword = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]"));
			textFieldPassword.sendKeys("tests");
			

			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]") ).click();

			Thread.sleep(5000);

			//WebElement alertLoginError  = null;
			//try
			//{
			//alertLoginError = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[3]/UIAAlert[1]"));
			//}
			//catch(NoSuchElementException e) {
				
			//}
			
			//if(alertLoginError != null)
			//	assertFalse("Log In Error", alertLoginError.isDisplayed());
			
			
			System.out.println("Sign Up successfull");
			
			//driver.quit();
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}       
	}
}
