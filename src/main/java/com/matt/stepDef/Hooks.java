package com.matt.stepDef;

import com.matt.helper.Browser;
import com.matt.helper.CustomEvent;
import com.matt.helper.Driver;
import com.matt.helper.PropertyManager;

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
