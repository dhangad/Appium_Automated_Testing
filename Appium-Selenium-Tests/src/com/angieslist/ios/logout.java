package com.angieslist.ios;

import static org.junit.Assert.assertFalse;
import io.appium.java_client.AppiumDriver;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.angieslist.common.AppiumDriverTestSetup;

public class logout {	
	public static void logout(AppiumDriver driver) throws InterruptedException {
					////UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]
			////UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]
			
		System.out.println("Logout In Progress....");
		
			WebElement staticText  = null;
			WebElement burgerButton = null;
			WebElement logoutButton = null;
			try 
			{
			staticText = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]"));
			//if(staticText != null)
				//assertFalse("Need help? Contact a concierge.", staticText.isDisplayed());
			//System.out.println(staticText.getText());
			staticText.click();
			staticText = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]"));
			staticText.click();
			staticText = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]"));
			staticText.click();
			
			
			burgerButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]"));
			burgerButton.click();
			
			System.out.println("clicked burgerbutton");
			
			Thread.sleep(3000);
			
			
			logoutButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]"));
			logoutButton.click();
			//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]
			System.out.println("Logout Successfully.");
			
			Thread.sleep(2000);
			

			}
			catch(NoSuchElementException e) {
				System.out.println(e);
			}
	}
}
