package com.angieslist.ios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.angieslist.ios.pages.MenuPage;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver) { this.driver = driver; }

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")
    private WebElement burgerButton;
    
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")
    private WebElement topLeftBubble; 

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")
    private WebElement topRightBubble; 

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")
    private WebElement bottomBubble; 
    
    public MenuPage clickBurgerButton()
    {
    	burgerButton.click();
    	return PageFactory.initElements(driver, MenuPage.class);
    }
    
    public void clickBubbles()
    {
    	topLeftBubble.click();
    	topRightBubble.click();
    	bottomBubble.click();
    }
    
}