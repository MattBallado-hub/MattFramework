package com.matt.Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class Driver {

	private static WebDriver driver;
	private static Scenario scenario;

	public static void setDriver(WebDriver driver) {
		Driver.driver = driver;
	}

	public static WebDriver getDriver() {
		return Driver.driver;
	}

	public static void setScenario(Scenario scenario) {
		Driver.scenario = scenario;
	}

	public static Scenario getScenario() {
		return Driver.scenario;
	}
	
	public static WebDriverWait getWait() {
		return new WebDriverWait(Driver.driver, Duration.ofSeconds(10));
	}
	
}
