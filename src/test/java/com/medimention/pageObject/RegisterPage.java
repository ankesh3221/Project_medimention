package com.medimention.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@data-id='UserRole']")
	@CacheLookup
	WebElement dropdown;
	
	@FindBy(xpath = "//span[text()='Distributors']")
	@CacheLookup
	WebElement bb;
	
	@FindBy(xpath = "//input[@name='data[Detail][Name]']")
	@CacheLookup
	WebElement bussName;
	
	@FindBy(xpath = "//input[@name='data[User][username]']")
	@CacheLookup
	WebElement bussUserName;
	
	@FindBy(xpath = "//input[@name='data[User][Email]']")
	@CacheLookup
	WebElement bussEmail;
	
	@FindBy(xpath = "//input[@name='data[User][password]']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//input[@name='data[User][password1]']")
	@CacheLookup
	WebElement repeatPassword;
	
	@FindBy(xpath = "//input[@name='terms']")
	@CacheLookup
	WebElement checkBox;
	
	@FindBy(xpath = "//span[text()='Register']")
	@CacheLookup
	WebElement registerBtn;
	
	public void selectGroup() {
		dropdown.click();
	}
	
	public void bloodGroup() {
		bb.click();
	}
	
	public void name(String name) {
		bussName.sendKeys(name);
	}
	
	public void userName(String userName) {
		bussUserName.sendKeys(userName);
	}
	
	public void email(String email) {
		bussEmail.sendKeys(email);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void confirmPassword(String confPass) {
		repeatPassword.sendKeys(confPass);
	}
	
	public void terms(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", checkBox);
		checkBox.click();
	}
	
	public void registration() {
		registerBtn.click();
	}
	
}
