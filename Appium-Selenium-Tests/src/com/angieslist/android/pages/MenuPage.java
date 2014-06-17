package com.angieslist.android.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	private WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver = driver;
    }
    
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.View[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.ImageView[1]")
    private WebElement logoutImageView;
    
    public void clickLogoutImageView()
    {
    	logoutImageView.click();
    }

}
