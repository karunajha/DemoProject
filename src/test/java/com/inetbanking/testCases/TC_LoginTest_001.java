package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() {
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage login = new LoginPage(driver);
		login.setUserName(username);
		logger.info("Entered usesrname");
		login.setPassword(password);
		logger.info("Entered password");

		login.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test Passed");

		} else {
			Assert.assertTrue(false);
			logger.info("login test failed");

		}

	}
}
