package com.medimention.testcases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {

	public WebDriver driver;
	//String url = "https://www.medimention.com/";
	public Properties p;
	@BeforeClass(groups = {"Sanity","Regression","DataDriven","smoke"})
	@Parameters({"os","browser",})
	public void setUp(String os ,String br) throws IOException, InterruptedException {
		
		FileReader file = new FileReader("./src//main//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		switch(br.toLowerCase()) {
		
		case "chrome" : driver = new ChromeDriver();
			break;
		case "edge" : driver = new  EdgeDriver();
			break;
		default : System.out.println("invalid broweser");
			return;
		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.navigate().to(p.getProperty("appUrl"));
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String randomStr() {
		
		String createStr = RandomStringUtils.randomAlphabetic(6);
		return createStr;
	}
	
	public String randomNum() {
		
		String createNum = RandomStringUtils.randomNumeric(10);
		return createNum;
	}
	
	public Actions mouseHover() {
		Actions actions = new Actions(driver);
		return actions;
	}
	
	
}
