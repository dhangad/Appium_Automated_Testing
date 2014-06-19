package com.angieslist.ios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {

	private WebDriver driver;
	public CreateProjectPage(WebDriver driver) { this.driver = driver; }

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIAStaticText[1]")
    private WebElement serviceCategoryList;
    
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextView[1]")
    private WebElement projectStory;
    
    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    private WebElement skipThisStep;
    
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
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[22]")
	private WebElement calendarDate20;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIAStaticText[1]")
	private WebElement timing1;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIAStaticText[1]")
	private WebElement timing2;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]/UIAStaticText[1]")
	private WebElement timing3;

	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
	private WebElement saveButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
	private WebElement calendarContinueButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
	private WebElement submitButton;
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
	private WebElement xCloseButton;
	
    public HomePage createNewProject(String projectDesc) throws InterruptedException {
    	serviceCategoryList.click();
    	
    	Thread.sleep(1000);
    	
    	projectStory.sendKeys(projectDesc);
    	
     	Thread.sleep(1000);
    	skipThisStep.click();
    	
    /*	this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.zip.sendKeys(zip);
		this.continueButton.click();*/
		
		Thread.sleep(2000);
		calendarDate20.click();
		
		Thread.sleep(2000);
		timing1.click();
		timing2.click();
		timing3.click();
	
		saveButton.click();
		Thread.sleep(2000);
		
		calendarContinueButton.click();
		Thread.sleep(2000);
		
		submitButton.click();
		Thread.sleep(2000);
		
		xCloseButton.click();
		
		return PageFactory.initElements(driver, HomePage.class);
    }
}
