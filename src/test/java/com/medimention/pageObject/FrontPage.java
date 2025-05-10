package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FrontPage extends BasePage {

	WebDriver driver;
	
	public FrontPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='banner-name']")
	@CacheLookup
	WebElement enqName;
	
	@FindBy(xpath = "//input[@id='banner-email']")
	@CacheLookup
	WebElement enqEmail;
	
	@FindBy(xpath = "//input[@id='banner-phone']")
	@CacheLookup
	WebElement enqPhone;
	
	@FindBy(xpath = "//button[text()='Get in Touch']")
	@CacheLookup
	WebElement touch;
	
	@FindBy(xpath = "//a[text()='Home']")
	@CacheLookup
	WebElement home;
	
	@FindBy(xpath = "//div[@class='row banner-optin submitted']//div//i")
	@CacheLookup
	WebElement submit;
	
	public void names(String name) {
		enqName.sendKeys(name);
	}
	
	public void emailes(String email) {
		enqEmail.sendKeys(email);
	}
	
	public void phones(String phone) {
		enqPhone.sendKeys(phone);
	}
	
	public void getInTouch() {
		touch.click();
	}
	
	public String assertSubmit() {
		String submitText =  submit.getDomAttribute("class");
		return submitText;
	}
	
	public void homeBtn() {
		home.click();
	}
	
	

}
