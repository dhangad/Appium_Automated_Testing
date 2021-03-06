package com.angieslist.android.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    private WebElement burgerButton;
    
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    private WebElement topLeftBubble; 

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    private WebElement topRightBubble; 

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    private WebElement bottomBubble; 

    public MenuPage clickBurgerButton()
    {
    	burgerButton.click();
    	return PageFactory.initElements(driver, MenuPage.class);
    }
    
    public void clickBubbles()
    {
    	try 
    	{
    		boolean topLeftBubbleIsDisplayed = this.driver
						.findElement(
								By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
						.isDisplayed();
	    		
	    	if (topLeftBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
			}
	    	else
	    	{
	    		topLeftBubbleIsDisplayed = false;
	    	}
			boolean topRightBubbleIsDisplayed = this.driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).isDisplayed();
			if (topRightBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
			}
	    	boolean bottomBubbleIsDisplayed = this.driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).isDisplayed();
	    	if (bottomBubbleIsDisplayed) {
	    		this.driver
				.findElement(
						By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
			}
    	}
    	catch (Exception e) {
    		//e.printStackTrace();
        		//System.out.print(topLeftBubbleIsDisplayed);
    	}
    }
}
