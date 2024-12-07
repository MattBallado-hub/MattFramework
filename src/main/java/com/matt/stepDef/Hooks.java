package com.matt.stepDef;

import com.matt.Helper.Browser;
import com.matt.Helper.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	Driver driver = new Driver();
	Browser browser = new Browser();

	@Before
	public void startUp(Scenario scenario) {
		driver.setScenario(scenario);
		browser.openBrowser("Edge");
	}

	@After
	public void tearDown() {
		browser.closeBrowser();
	}

}
