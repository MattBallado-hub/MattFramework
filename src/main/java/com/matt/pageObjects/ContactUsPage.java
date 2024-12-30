package com.matt.pageObjects;

import org.openqa.selenium.By;

import com.matt.handler.CustomException;
import com.matt.helper.CustomEvent;

public class ContactUsPage extends CustomEvent {

	private By solutionsLink = By.xpath("(//a[@title='Solutions'])[1]");
	private By productsLink = By.xpath("(//a[@title='Products'])[1]");
	private By industriesLink = By.xpath("(//a[@title='Industries'])[1]");
	private By discoverLink = By.xpath("(//a[@title='Discover'])[1]");
	private By aboutUsLink = By.xpath("(//a[@title='About Us'])[1]");
	private By careersLink = By.xpath("(//a[@title='Careers'])[1]");

	private By footerExploreMoreLabel = By.xpath("//div[@class='footer__link__group-ctn']//span[text()='Explore more of Datacom']");
	private By footerDiscoverLink = By.xpath("//div[@class='footer__link__group-ctn']//a[@href='/nz/en/discover']");
	private By footerWhoWeAreLink = By.xpath("//div[@class='footer__link__group-ctn']//a[@href='/nz/en/about-us/who-we-are']");
	private By footerSustainabilityLink = By.xpath("//div[@class='footer__link__group-ctn']//a[@href='/nz/en/about-us/sustainability']");
	private By footerOurLocationLink = By.xpath("//div[@class='footer__link__group-ctn']//a[@href='/nz/en/about-us/our-locations']");
	private By footerYearInReviewLink = By.xpath("//div[@class='footer__link__group-ctn']//a[@href='/nz/en/about-us/year-in-review']");

	private By acceptCookiesButton = By.xpath("//button[@id='onetrust-accept-btn-handler']");

	private By contactUsButton = By.xpath("//div[@data-launchid='launchId']");
	private By contactUsCloseButton = By.xpath("//span[@class='cmp-mrkto-modal__content__close fal fa-times']");
	private By contactUsHeader = By.xpath("//h3[text()='Contact us']");
	private By contactUsDetails = By.xpath("(//div[@class=\"cmp-text  \"]//p)[2]");
	private By contactUsFirstName = By.xpath("//input[@id='FirstName']");
	private By contactUsLastName = By.xpath("//input[@id='LastName']");
	private By contactUsEmail = By.xpath("//input[@id='Email']");
	private By contactUsPhone = By.xpath("//input[@id='Phone']");
	private By contactUsTitle = By.xpath("//input[@id='Title']");
	private By contactUsCompany = By.xpath("//input[@id='Company']");
	private By contactUsCountry = By.xpath("//select[@id='Country']");
	private By contactUsHelp = By.xpath("//select[@id='custom2']");
	private By contactUsGraduate = By.xpath("//select[@id='custom5']");
	private By contactUsUniversity = By.xpath("//input[@id='custom6']");
	private By contactUsBusiness = By.xpath("//input[@id='custom7']");
	private By contactUsCaptcha = By.xpath("//div[@class='mktoCaptchaDisclaimer']");
	private By contactUsSubmit = By.xpath("//button[@type='submit']");

	public void clickAcceptCookies() throws CustomException {
		customClick(acceptCookiesButton);
	}

	public void clickContactUs() throws CustomException {
		customClick(contactUsButton);
	}

	public void validateContactUs() throws CustomException {
		shouldBeDisplayed(contactUsCloseButton);
		shouldBeDisplayed(contactUsHeader);
		shouldBeDisplayed(contactUsDetails);
		valueShouldBe(contactUsDetails, "Do you have a question? Want to learn more about our products and solutions, the latest career opportunities, or our events? We're here to help. Get in touch with us.");
		shouldBeDisplayed(contactUsFirstName);
		shouldBeDisplayed(contactUsLastName);
		shouldBeDisplayed(contactUsEmail);
		shouldBeDisplayed(contactUsPhone);
		shouldBeDisplayed(contactUsTitle);
		shouldBeDisplayed(contactUsCompany);
		shouldBeDisplayed(contactUsCountry);
		shouldBeDisplayed(contactUsHelp);
		shouldBeDisplayed(contactUsCaptcha);
		valueShouldBe(contactUsCaptcha, "This site is protected by reCAPTCHA and the Google Privacy Policy and Terms of Service apply.");
		shouldBeDisplayed(contactUsSubmit);
	}
	
	public void populateContactUs() throws CustomException {
		customSendKeys(contactUsFirstName, "Matt");
		customSendKeys(contactUsLastName, "Ballado");
		customSendKeys(contactUsEmail, "BryonBallado@gmail.com");
		customSendKeys(contactUsPhone, "+639688859607");
		customSendKeys(contactUsTitle, "Test Automation Engineer Specialist");
		customSendKeys(contactUsCompany, "DATACOM");
		customSelect(contactUsCountry, "Philippines");
		customSelect(contactUsHelp, "Careers");
		customSelect(contactUsGraduate, "Graduate");
		customSendKeys(contactUsUniversity, "Emilio Aguinaldo College - Cavite");
		customSendKeys(contactUsBusiness, "Test Automation Engineer");
		takeScreenshot("populateContactUs()");
		customClick(contactUsCloseButton);
	}

	public void validateNavigationBarLinks(String navBar) throws CustomException {
		if (navBar.equals("Solutions")) {
			shouldBeDisplayed(solutionsLink);
		} else if (navBar.equals("Products")) {
			shouldBeDisplayed(productsLink);
		} else if (navBar.equals("Industries")) {
			shouldBeDisplayed(industriesLink);
		} else if (navBar.equals("Discover")) {
			shouldBeDisplayed(discoverLink);
		} else if (navBar.equals("About Us")) {
			shouldBeDisplayed(aboutUsLink);
		} else if (navBar.equals("Careers")) {
			shouldBeDisplayed(careersLink);
		} else {
			throw new CustomException("Failed: " + navBar);
		}
	}

	public void validateFooterLinks(String footerLink) throws CustomException {
		if (footerLink.equals("Explore more of Datacom")) {
			shouldBeDisplayed(footerExploreMoreLabel);
		} else if (footerLink.equals("Discover")) {
			shouldBeDisplayed(footerDiscoverLink);
		} else if (footerLink.equals("Who we are")) {
			shouldBeDisplayed(footerWhoWeAreLink);
		} else if (footerLink.equals("Our sustainability journey")) {
			shouldBeDisplayed(footerSustainabilityLink);
		} else if (footerLink.equals("Our locations")) {
			shouldBeDisplayed(footerOurLocationLink);
		} else if (footerLink.equals("Year in review")) {
			shouldBeDisplayed(footerYearInReviewLink);
		} else {
			throw new CustomException("Failed: " + footerLink);
		}
	}

}
