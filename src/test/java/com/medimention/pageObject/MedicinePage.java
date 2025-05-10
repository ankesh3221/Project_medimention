package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MedicinePage extends BasePage {

	public MedicinePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='appendedInputButtons']")
	@CacheLookup
	WebElement medi;
	
	@FindBy(xpath = "//button[text()='Search']")
	@CacheLookup
	WebElement searchMedi;
	
	public void medicine(String medicine) {
		medi.sendKeys(medicine);
	}
	
	public void searchMedicine() {
		searchMedi.click();
	}
	
	

	
	
}
