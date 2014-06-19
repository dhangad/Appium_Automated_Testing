package com.angieslist.android.tests;

import java.net.MalformedURLException;
import org.openqa.selenium.support.PageFactory;
import com.angieslist.android.pages.HomePage;
import com.angieslist.android.pages.LandingPage;
import com.angieslist.common.AppiumDriverConfigure;
import static com.angieslist.common.Utils.DatabaseUtils.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class LogoutSpec extends AppiumDriverConfigure {

	@Before
	public void setup() throws MalformedURLException { initANDROIDDriver(); }

	@Test
	public void logout() throws InterruptedException {
		LandingPage loginPage = PageFactory.initElements(driver, LandingPage.class);
		
		HomePage homePage = loginPage.loginIn(EMAIL_ADDRESS_MEMBER1 , PASSWORD);
		Thread.sleep(5000);
		//homePage.clickBubbles();
		//Thread.sleep(1000);
		homePage.clickBurgerButton().clickLogoutImageView();
	}
	
    @After
    public void tearDown(){
        quitDriver();
    }

}
