package com.medimention.testcases;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.FrontPage;
import com.medimention.pageObject.HomePage;
import com.medimention.pageObject.MedicinePage;

public class Tc_003_searchMedicine extends baseClass {

	@Test
	public void mediMention() {
		FrontPage fp = new FrontPage(driver);
		HomePage hp = new HomePage(driver);
		MedicinePage mp = new MedicinePage(driver);
		
		Faker fake = new Faker();
		String mediName = fake.medical().medicineName();
		
		fp.homeBtn();
		hp.doctorHover(mouseHover());
		hp.nursingHomeHover(mouseHover());
		hp.medicalStoreHover(mouseHover());
		hp.bloodBankHover(mouseHover());
		hp.searchMedicine();
		mp.medicine(mediName);
		mp.searchMedicine();
	}
	
}
