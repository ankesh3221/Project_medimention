package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement accHead;
	
	@FindBy(xpath = "//input[@id='DetailName']")
	@CacheLookup
	WebElement nameText;
	
	@FindBy(xpath="//li[@class='green']//i[@class='ace-icon fa fa-caret-down']")
	@CacheLookup
	WebElement Accbuttons;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	WebElement logoutbtn;
	
	public String accheading() {
		return accHead.getText();
	}
	
	public String nameTexts() {
		String attri =  nameText.getDomAttribute("value");
		return attri;
	}
	
	public void logoutDrp()
	{
		Accbuttons.click();
	}
	
	public void logout()
	{
		logoutbtn.click();
	}
	
	

}
