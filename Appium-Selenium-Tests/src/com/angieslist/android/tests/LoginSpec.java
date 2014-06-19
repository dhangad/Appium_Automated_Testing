package com.angieslist.android.tests;

import java.net.MalformedURLException;
import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.android.pages.LandingPage;
import com.angieslist.android.pages.HomePage;
import static com.angieslist.common.Utils.DatabaseUtils.*;
import org.openqa.selenium.support.PageFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class LoginSpec extends AppiumDriverConfigure {
	
	@Before
	public void setup() throws MalformedURLException { initANDROIDDriver(); }

	@Test
	public void login() throws InterruptedException {
		LandingPage loginPage = PageFactory.initElements(driver, LandingPage.class);
		loginPage.loginIn(EMAIL_ADDRESS_MEMBER1, PASSWORD);
	}
	
    @After
    public void tearDown(){
        quitDriver();
    }
}

