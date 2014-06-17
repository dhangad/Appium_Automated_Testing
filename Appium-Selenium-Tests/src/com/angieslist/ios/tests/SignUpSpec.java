package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.ios.pages.SignUpPage2;

public class SignUpSpec extends AppiumDriverConfigure {

public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		SignUpSpec objSignUpSpec = new SignUpSpec();
		
		objSignUpSpec.setup();
		objSignUpSpec.signUpAndSignIn();
		objSignUpSpec.tearDown();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	protected void signUpAndSignIn() throws InterruptedException {
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
		Random random = new Random();
		String email = random.nextInt() + "@example.com";
		String password="tests";
		
		signUpPage2.fillInfoAndContinue(first, last, phone, email, password);
		Thread.sleep(5000);
	}
	
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}
