package com.angieslist.ios.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;

public class LogoutSpec extends AppiumDriverConfigure {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		LogoutSpec objlogoutSpec = new LogoutSpec();
		
		objlogoutSpec.setup();
		objlogoutSpec.logout();
		objlogoutSpec.tearDown();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	protected void logout() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test\n";
		String emailAddress = "member1@example.com";
		
		HomePage homePage = landingPage.clickSignInButton().signIn(emailAddress, password);
		
		Thread.sleep(5000);
		homePage.clickBubbles();
		Thread.sleep(1000);
		homePage.clickBurgerButton().clickLogoutButton();
	}
	
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}
