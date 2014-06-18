package com.angieslist.ios.tests;

import java.net.MalformedURLException;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;

import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.common.AppiumDriverConfigure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SignInSpec extends AppiumDriverConfigure {
	
	@Before
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	public void signIn() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test\n";
		String emailAddress = "member1@example.com";
		
		HomePage homePage = landingPage.clickSignInButton().signIn(emailAddress, password);
		Thread.sleep(5000);

		Assert.assertNotNull(homePage);
		Assert.assertEquals("Verify start new project button exists",
				"Start New Project", 
				homePage.getStartNewProjectButtonText());
	}
	
    @After
    public void tearDown(){
        quitDriver();
    }
}