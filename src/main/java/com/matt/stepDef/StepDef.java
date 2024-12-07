package com.matt.stepDef;

import com.matt.Handler.CustomException;
import com.matt.Helper.Driver;
import com.matt.PageObjects.CommonPage;
import com.matt.PageObjects.ContactUsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	@Given("I navigate to {string}")
	public void navigate(String url) {
		Driver.getDriver().get(url);
	}

	@Then("I validate Page Title is {string}")
	public void validatePageTitle(String expectedValue) throws CustomException {
		new CommonPage().validatePageTitle(expectedValue);
	}

	@Then("I validate Page Title is not {string}")
	public void validateNotPageTitle(String expectedValue) throws CustomException {
		new CommonPage().validateNotPageTitle(expectedValue);
	}

	@Then("I validate Navigation Bar {string} link is displayed")
	public void validateNavBarLinks(String link) throws CustomException {
		new ContactUsPage().validateNavigationBarLinks(link);
	}

	@Then("I validate Footer {string} link is displayed")
	public void validateFooterLinks(String link) throws CustomException {
		new ContactUsPage().validateFooterLinks(link);
	}

	@When("I click Accept all button")
	public void clickAcceptAll() throws CustomException {
		new ContactUsPage().clickAcceptCookies();
	}

	@When("I click Contact Us button")
	public void clickContactUs() throws CustomException {
		new ContactUsPage().clickContactUs();
	}
	
	@Then("I validate the Contact Us section")
	public void validateContactUs() throws CustomException {
		new ContactUsPage().validateContactUs();
	}
	
	@Then("I populate the Contact Us section")
	public void populateContactUs() throws CustomException {
		new ContactUsPage().populateContactUs();
	}

}
