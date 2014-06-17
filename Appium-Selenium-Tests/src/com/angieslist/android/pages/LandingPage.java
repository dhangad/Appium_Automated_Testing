package com.angieslist.android.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")
    private WebElement emailAddress;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[2]")
    private WebElement password; 

    
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")
    private WebElement signInButton; 

    public HomePage loginIn(String emailAddress, String password) throws InterruptedException {
        Thread.sleep(3000L);
        this.emailAddress.sendKeys(emailAddress);
        this.password.sendKeys(password);	
        this.signInButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
}
