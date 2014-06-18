package com.angieslist.ios.tests;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.CreateProjectPage;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;

public class CreateNewProjectSpec extends AppiumDriverConfigure{

	@Before
	public void setup() throws MalformedURLException { initIOSDriver(); }
	
	@Test
	public void createNewProject() throws InterruptedException {
	
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test\n";
		String emailAddress = "member1@example.com";
		String address = "677 Teal St";
		String city = "Fishers";
		String state = "IN";
		String zip = "46038";
		String projectStory = "urgent service needed sink got clogged.\n";
		
		HomePage homePage = landingPage.clickSignInButton().signIn(emailAddress, password);
		Thread.sleep(2000);
		homePage.clickBubbles();
		CreateProjectPage createProjPage = homePage.clickStartNewProjectButton();
		Thread.sleep(3000);
		createProjPage.createNewProject(projectStory,address, city, state, zip);
		
		Thread.sleep(5000);
		
		//homePage.clickBurgerButton().clickLogoutButton();
		//Thread.sleep(2000);
	
	}

    @After
    public void tearDown(){
        quitDriver();
    }

}
