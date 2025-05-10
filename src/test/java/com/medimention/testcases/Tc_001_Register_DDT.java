package com.medimention.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.medimention.pageObject.AccountPage;
import com.medimention.pageObject.FrontPage;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.RegisterPage;
import com.medimention.utlities1.DataProviders;

public class Tc_001_Register_DDT extends baseClass {
	
	@Test(dataProvider="RegData", dataProviderClass= DataProviders.class)
	public void account_Register(String B_name, String U_Name, String U_Email, String pass, String cnfPass) {
		FrontPage fp = new FrontPage(driver);
		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		AccountPage ap = new AccountPage(driver);
		try {
		fp.homeBtn();
		hp.registerBtn();
		rp.selectGroup();
		rp.bloodGroup();
		rp.name(B_name);
		rp.userName(U_Name);
		rp.email(U_Email);
		rp.password(pass);
		rp.confirmPassword(cnfPass);
		rp.terms(driver);
		rp.registration();
		
		System.out.println(B_name+"   "+U_Name+"    "+U_Email+"    "+pass);
		
		Assert.assertTrue(ap.accheading().contains(B_name));
		Assert.assertEquals(ap.nameTexts(), B_name);
		
		ap.logoutDrp();
		ap.logout();
		hp.MediHeading();
		}catch (Exception e) {
			
			driver.navigate().refresh();
		}
		
	}

}
