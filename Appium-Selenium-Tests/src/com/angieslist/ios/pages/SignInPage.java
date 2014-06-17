package com.angieslist.ios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	private WebDriver driver;
	
	public SignInPage(WebDriver driver) { this.driver=driver; }
		
	@FindBy(xpath = "//window[1]/scrollview[1]/button[1]")
	private WebElement signInButton;
	
	@FindBy(xpath = "//UIATextField[1]")
	private WebElement emailAddress;
	//= driver.findElement(By.xpath("//UIATextField[1]"));
	
	@FindBy(xpath = "//UIASecureTextField[1]")
	private WebElement password;
	//= driver.findElement(By.xpath("//UIASecureTextField[1]"));
	
	@FindBy(xpath = "//UIAAlert[1]")
	private WebElement errorAlert;

	public HomePage signIn(String emailAddress, String password) throws InterruptedException {
        Thread.sleep(3000L);
        this.emailAddress.sendKeys(emailAddress);
        this.password.sendKeys(password);	
        //this.signInButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
	
	
}
	