package com.angieslist.ios.tests;

import java.net.MalformedURLException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.angieslist.ios.pages.LandingPage;
import com.angieslist.common.AppiumDriverConfigure;

public class SignInSpec extends AppiumDriverConfigure {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		SignInSpec objSignInSpec = new SignInSpec();
		
		objSignInSpec.setup();
		objSignInSpec.signIn();
		objSignInSpec.tearDown();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException { initIOSDriver(); }

	@Test
	protected void signIn() throws InterruptedException {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		
		String password="test\n";
		String emailAddress = "member1@example.com";
		
		landingPage.clickSignInButton().signIn(emailAddress, password);
	}
	
    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}