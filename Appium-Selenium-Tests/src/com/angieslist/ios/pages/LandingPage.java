package com.angieslist.ios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) { this.driver=driver; }
	
	@FindBy(name = "SIGN IN")
	private WebElement SignInButton;
	
	@FindBy(name = "SIGN UP")
	private WebElement SignUpButton;
	
	public SignUpPage1 clickSignUpButton() {
		SignUpButton.click();
		return PageFactory.initElements(driver, SignUpPage1.class);
	}
	
	public SignInPage clickSignInButton() {
		SignInButton.click();
		return PageFactory.initElements(driver, SignInPage.class);
	}
}
