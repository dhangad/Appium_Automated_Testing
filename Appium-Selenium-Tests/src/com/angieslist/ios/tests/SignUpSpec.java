package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import java.util.Random;
import org.openqa.selenium.support.PageFactory;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.ios.pages.SignUpPage2;
import static com.angieslist.common.Utils.DataTestConstants.*;
import static com.angieslist.common.Utils.DatabaseUtils.*;
import com.angieslist.common.Utils.Helpers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SignUpSpec extends AppiumDriverConfigure {

	@Before
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	public void signUpAndSignInAndLogout() throws InterruptedException {
		HomePage homePage;

		LandingPage landingPage = PageFactory.initElements(driver,
				LandingPage.class);
		
		SignUpPage2 signUpPage2 = landingPage.clickSignUpButton()
				.fillInfoAndContinue(ADDRESS, CITY, STATE, ZIP);
		
		Thread.sleep(3000);
		homePage = signUpPage2.fillInfoAndContinue(FIRST_NAME, LAST_NAME,
				PHONE, Helpers.GetRandomEmailAddress(), PASSWORD_5_CHAR_LENGTH);
		
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
