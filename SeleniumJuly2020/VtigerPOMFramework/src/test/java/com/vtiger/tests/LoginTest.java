package com.vtiger.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.Pages.HomePage;
import com.vtiger.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	
	@BeforeClass
	public void LaunchApp()
	{
		if(driver==null)
		{
			openUrl();
		}
	}
	
	@Test
	public void validLogin()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login();
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
	}
	
	@Test
	public void verifyLoginPageContent()
	{
		LoginPage lp = new LoginPage(driver);
		lp.verifyTitle();
		lp.verifyLogo();		
	}
	
	@AfterClass
	public void closeapp()
	{
		driver.quit();
	}

}
