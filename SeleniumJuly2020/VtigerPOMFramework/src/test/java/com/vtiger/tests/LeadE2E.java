package com.vtiger.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.vtiger.Pages.CreateLeadPage;
import com.vtiger.Pages.HomePage;
import com.vtiger.Pages.LoginPage;

public class LeadE2E extends BaseTest {

	@BeforeClass
	public void LaunchApp() {
		if (driver == null) {
			openUrl();
		}
	}

	@Test
	public void verifyLeadE2Efunctionality() {
		LoginPage lp = new LoginPage(driver);
		lp.login();
		HomePage hp = new HomePage(driver);
		hp.clickNewLead();
		CreateLeadPage clp = new CreateLeadPage(driver);
		clp.createLead("Modi", "BJP");
		hp.clickLogout();
	}

	@AfterClass
	public void closeapp() {
		driver.quit();
	}

}
