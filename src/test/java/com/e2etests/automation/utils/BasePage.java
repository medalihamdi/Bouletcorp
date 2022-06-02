package com.e2etests.automation.utils;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {

	protected WebDriver driver;
	
	protected static Logger log = LogManager.getLogger();

	public BasePage() {

		this.driver = Setup.driver;

	}

}