package com.matt.stepDef;

import com.matt.Handler.CustomException;
import com.matt.Helper.Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDef {

	@Given("I navigate to {string}")
	public void navigate(String url) {
		Browser.driver.getDriver().get(url);
	}

	@Then("I validate Page Title is {string}")
	public void validatePageTitle(String expectedValue) throws CustomException {
		String actualValue = Browser.driver.getDriver().getTitle();
		System.out.println("Actual: " + actualValue);
		System.out.println("Expected: " + expectedValue);
		if (actualValue.equals(expectedValue)) {
			System.out.println("Page Title is correct");
		} else {
			throw new CustomException("Page Title is incorrect");
		}
	}

}
