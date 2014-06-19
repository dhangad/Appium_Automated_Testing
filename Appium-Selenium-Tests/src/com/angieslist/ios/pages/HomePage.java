package com.angieslist.ios.pages;

import org.openqa.selenium.By;
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
    
    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    private WebElement startNewProjectButton;
    
    public String getStartNewProjectButtonText() {
    	return startNewProjectButton.getText();
    }
    
    public MenuPage clickBurgerButton()
    {
    	burgerButton.click();
    	return PageFactory.initElements(driver, MenuPage.class);
    }
    
    public CreateProjectPage clickStartNewProjectButton() {
    	startNewProjectButton.click();
    	return PageFactory.initElements(driver, CreateProjectPage.class);
    }
    boolean topLeftBubbleIsDisplayed;
    public void clickBubbles()
    {
    	try 
    	{
	    	topLeftBubbleIsDisplayed = this.driver
						.findElement(
								By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]"))
						.isDisplayed();
	    		
	    	if (topLeftBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")).click();
			}
	    	else
	    	{
	    		topLeftBubbleIsDisplayed = false;
	    	}
			boolean topRightBubbleIsDisplayed = this.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")).isDisplayed();
			if (topRightBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")).click();
			}
	    	boolean bottomBubbleIsDisplayed = this.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")).isDisplayed();
	    	if (bottomBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[4]/UIAStaticText[1]")).click();
			}
    	}
    	catch (Exception e) {
		//e.printStackTrace();
    		System.out.print(topLeftBubbleIsDisplayed);
    	}
    	
    }
    
}
