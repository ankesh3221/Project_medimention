package com.medimention.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.medimention.pageObject.FrontPage;

public class Tc_002_getInTouch extends baseClass{

	@Test
	public void enqiryDetails() {
		FrontPage fp = new FrontPage(driver);
		
		String text = "fa fa-check text-success";
		
		fp.names(randomStr());
		fp.emailes((randomNum()+"@xrv.com"));
		fp.phones(randomNum());
		fp.getInTouch();
		
		Assert.assertEquals(fp.assertSubmit(), text);
		
	}
}
