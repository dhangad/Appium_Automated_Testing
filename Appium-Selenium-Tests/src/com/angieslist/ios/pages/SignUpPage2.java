package com.angieslist.ios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage2 {
private WebDriver driver;
	
	public SignUpPage2(WebDriver driver) { this.driver=driver; }
		
	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")
	private WebElement first;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")
	private WebElement last;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")
	private WebElement phone;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")
	private WebElement email;
	
	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]")
	private WebElement password;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")
	private WebElement continueButton;
	
	public HomePage fillInfoAndContinue(String first, String last, String phone, String email, String password) { 
		
		this.first.sendKeys(first);
		this.last.sendKeys(last);
		this.phone.sendKeys(phone);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.continueButton.click();
		
		return PageFactory.initElements(driver, HomePage.class);
	}

}
