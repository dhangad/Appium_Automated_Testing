package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import java.util.Random;
import org.openqa.selenium.support.PageFactory;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.ios.pages.SignUpPage2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SignUpSpec extends AppiumDriverConfigure {
	
	HomePage homePage;

	@Before
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	public void signUpAndSignInAndLogout() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String address = "677 Teal St";
		String city = "Fishers";
		String state = "IN";
		String zip = "46038";
		SignUpPage2 signUpPage2 = landingPage.clickSignUpButton().fillInfoAndContinue(address, city, state, zip);
		Thread.sleep(3000);
		
		String last = "Johns";
		String first = "Jimmy";
		String phone = "1234567890";
        
		Random rand = new Random();
        int random = rand.nextInt((2147483647 - 1) + 1);
        char c = (char)(rand.nextInt(26) + 'a');
		
        String email = c+random+"@example.com";
		String password="tests";
		
		homePage = signUpPage2.fillInfoAndContinue(first, last, phone, email, password);

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
