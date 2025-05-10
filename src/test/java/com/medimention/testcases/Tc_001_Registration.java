package com.medimention.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.AccountPage;
import com.medimention.pageObject.FrontPage;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.RegisterPage;

public class Tc_001_Registration extends baseClass {
	 
	@Test(groups = "Regression")
	public void account_Register() {
		FrontPage fp = new FrontPage(driver);
		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		AccountPage ap = new AccountPage(driver);
		
		Faker fake = new Faker();
		
		String bussName = fake.name().name();
		String userName = fake.name().firstName();
		String userEmail = fake.internet().emailAddress();
		String password = fake.internet().password();
		
		fp.homeBtn();
		hp.registerBtn();
		rp.selectGroup();
		rp.bloodGroup();
		rp.name(bussName);
		rp.userName(userName);
		rp.email(userEmail);
		rp.password(password);
		rp.confirmPassword(password);
		rp.terms(driver);
		rp.registration();
		
		System.out.println(bussName+"   "+userName+"    "+userEmail+"    "+password);
		
		Assert.assertTrue(ap.accheading().contains(bussName));
		Assert.assertEquals(ap.nameTexts(), bussName);
		
		ap.logoutDrp();
		ap.logout();
	}
}
