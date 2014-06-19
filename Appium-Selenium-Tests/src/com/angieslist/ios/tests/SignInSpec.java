package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.common.Utils.DataTestConstants;
import static com.angieslist.common.Utils.DataTestConstants.*;
import static com.angieslist.common.Utils.DatabaseUtils.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SignInSpec extends AppiumDriverConfigure {

	@Before
	public void setup() throws MalformedURLException {
		initIOSDriver();
	}

	@Test
	public void signIn() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver,
				LandingPage.class);

		HomePage homePage = landingPage.clickSignInButton().signIn(
				EMAIL_ADDRESS_MEMBER1, PASSWORD_WITH_NEWLINE);
		Thread.sleep(5000);

		Assert.assertNotNull(homePage);
		Assert.assertEquals(VERIFY_START_NEW_PROJECT_BUTTON_EXISTS,
				START_NEW_PROJECT, homePage.getStartNewProjectButtonText());
	}

	@After
	public void tearDown() {
		quitDriver();
	}
}