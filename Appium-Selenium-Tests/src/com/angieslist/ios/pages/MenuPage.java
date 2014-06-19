package com.angieslist.ios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	private WebDriver driver;
	public MenuPage(WebDriver driver) { this.driver = driver; }
	
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")
    private WebElement logoutButton;
    
    public void clickLogoutButton()
    {
    	logoutButton.click();
    }
}
