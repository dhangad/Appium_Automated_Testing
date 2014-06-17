package com.angieslist.android.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angieslist.android.pages.HomePage;
import com.angieslist.android.pages.LandingPage;
import com.angieslist.common.AppiumDriverConfigure;

public class LogoutSpec extends AppiumDriverConfigure {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		LogoutSpec objLogoutSpec = new LogoutSpec();
		
		objLogoutSpec.setup();
		objLogoutSpec.logout();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException { initANDROIDDriver(); }

	@Test
	protected void logout() throws InterruptedException {
		LandingPage loginPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test";
		String emailAddress = "member1@example.com";
		
		HomePage homePage = loginPage.loginIn(emailAddress , password);
		Thread.sleep(5000);
		homePage.clickBubbles();
		Thread.sleep(1000);
		homePage.clickBurgerButton().clickLogoutImageView();
				
					
	}
	
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }

}
