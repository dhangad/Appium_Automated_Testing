package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static com.angieslist.common.Utils.DataTestConstants.*;
import static com.angieslist.common.Utils.DatabaseUtils.*;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.ios.pages.CreateProjectPage;
import com.angieslist.ios.pages.HomePage;
import com.angieslist.ios.pages.LandingPage;

public class CreateNewProjectSpec extends AppiumDriverConfigure {

	@Before
	public void setup() throws MalformedURLException {
		initIOSDriver();
	}

	@Test
	public void createNewProject() throws InterruptedException {
		HomePage homePage;
		LandingPage landingPage = PageFactory.initElements(driver,
				LandingPage.class);
		homePage = landingPage.clickSignInButton().signIn(
				EMAIL_ADDRESS_MEMBER1, PASSWORD_WITH_NEWLINE);

		Thread.sleep(2000);
		CreateProjectPage createProjPage = homePage
				.clickStartNewProjectButton();

		Thread.sleep(3000);
		homePage = createProjPage
				.createNewProject(NEW_PROJECT_PLUMBING_STORY_WITH_NEWLINE);

		Thread.sleep(5000);
		homePage.clickBurgerButton().clickLogoutButton();

		Thread.sleep(2000);
	}

	@After
	public void tearDown() {
		quitDriver();
	}

}
