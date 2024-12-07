package com.matt.Helper;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class Driver {

	private WebDriver driver;
	private Scenario scenario;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public Scenario getScenario() {
		return this.scenario;
	}

}
