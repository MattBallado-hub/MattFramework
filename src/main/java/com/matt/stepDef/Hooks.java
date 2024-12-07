package com.matt.stepDef;

import com.matt.Helper.Browser;
import com.matt.Helper.CustomEvent;
import com.matt.Helper.Driver;
import com.matt.Helper.PropertyManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	Browser browser = new Browser();
	PropertyManager propertyManager = new PropertyManager();

	@Before
	public void startUp(Scenario scenario) {
		Driver.setScenario(scenario);
		browser.openBrowser(propertyManager.getProperty("Browser"), propertyManager.getProperty("Headless"));
	}

	@After
	public void tearDown() {
		if (Driver.getScenario().isFailed()) {
			new CustomEvent().takeScreenshot("Failed Screenshot");
		}
		browser.quitBrowser();
	}

}
