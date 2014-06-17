package com.angieslist.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) { this.driver=driver; }
		
	@FindBy(xpath = "//window[1]/scrollview[1]/button[2]")
	private WebElement loginButton;
	
}
	