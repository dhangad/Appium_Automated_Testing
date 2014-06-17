package com.angieslist.android.tests;

import java.net.MalformedURLException;

import com.angieslist.common.AppiumDriverConfigure;
import com.angieslist.android.pages.LandingPage;
import com.angieslist.android.pages.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSpec extends AppiumDriverConfigure {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		LoginSpec objLoginSpec = new LoginSpec();
		
		objLoginSpec.setup();
		objLoginSpec.login();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException { initANDROIDDriver(); }

	@Test
	protected void login() throws InterruptedException {
		LandingPage loginPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test";
		String emailAddress = "member1@example.com";
		
		loginPage.loginIn(emailAddress , password);
	}
	
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}

