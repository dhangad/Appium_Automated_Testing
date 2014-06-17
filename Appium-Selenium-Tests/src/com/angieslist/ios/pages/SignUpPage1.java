package com.angieslist.ios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage1 {

	private WebDriver driver;
	
	public SignUpPage1(WebDriver driver) { this.driver=driver; }
		
	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")
	private WebElement address;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")
	private WebElement city;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")
	private WebElement state;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")
	private WebElement zip;

	@FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")
	private WebElement continueButton;
	
	public SignUpPage2 fillInfoAndContinue(String address, String city, String state, String zip) { 
		
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.zip.sendKeys(zip);
		this.continueButton.click();
		
		return PageFactory.initElements(driver, SignUpPage2.class);
	}
	
}
	