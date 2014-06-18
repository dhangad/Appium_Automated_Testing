package com.angieslist.ios.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class LogoutSpec extends AppiumDriverConfigure {

	@Before
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	public void logout() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test\n";
		String emailAddress = "member1@example.com";
		
		HomePage homePage = landingPage.clickSignInButton().signIn(emailAddress, password);
		
		Thread.sleep(5000);
		homePage.clickBubbles();
		Thread.sleep(1000);
		homePage.clickBurgerButton().clickLogoutButton();
	}
	
    @After
    public void tearDown(){
        quitDriver();
    }
}
