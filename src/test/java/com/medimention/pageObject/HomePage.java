package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Doctor']")
	@CacheLookup
	WebElement doctor;
	
	@FindBy(xpath = "//a[text()='Nursing Home']")
	@CacheLookup
	WebElement nursingHome;
	
	@FindBy(xpath = "//a[text()='Medical Store']")
	@CacheLookup
	WebElement medicalStore;
	
	@FindBy(xpath = "//a[text()='Blood Bank']")
	@CacheLookup
	WebElement bloodBank;
	
	@FindBy(xpath = "//*[contains(text(), 'Search Medicine')]")
	@CacheLookup
	WebElement medicine;
	
	@FindBy(xpath = "//a[text()='Join Us']")
	@CacheLookup
	WebElement register;
	
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement mediHead;
	
	public void doctorHover(Actions action) {
		action.moveToElement(doctor).perform();
	}
	
	public void nursingHomeHover(Actions action) {
		action.moveToElement(nursingHome).perform();
	}
	
	public void medicalStoreHover(Actions action) {
		action.moveToElement(medicalStore).perform();
	}
	
	public void bloodBankHover(Actions action) {
		action.moveToElement(bloodBank).perform();
	}
	
	public void searchMedicine() {
		medicine.click();
		System.out.println(1);
	}
	
	public void registerBtn() {
		register.click();
	}
	
	public void MediHeading()
	{
		mediHead.click();
	}

}
