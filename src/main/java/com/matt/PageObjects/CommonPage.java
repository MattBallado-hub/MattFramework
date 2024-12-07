package com.matt.PageObjects;

import com.matt.Handler.CustomException;
import com.matt.Helper.CustomEvent;
import com.matt.Helper.Driver;

public class CommonPage extends CustomEvent {

	public void validatePageTitle(String expectedValue) throws CustomException {
		String actualValue = Driver.getDriver().getTitle();
		System.out.println("Actual: " + actualValue);
		System.out.println("Expected: " + expectedValue);
		if (actualValue.equals(expectedValue)) {
			System.out.println("Page Title is correct");
		} else {
			throw new CustomException("Page Title is incorrect");
		}
		
		takeScreenshot("validatePageTitle()");
	}

	public void validateNotPageTitle(String expectedValue) throws CustomException {
		String actualValue = Driver.getDriver().getTitle();
		System.out.println("Actual: " + actualValue);
		System.out.println("Expected: " + expectedValue);
		if (actualValue.equals(expectedValue)) {
			throw new CustomException("Page Title is incorrect");
		} else {
			System.out.println("Page Title is correct");
		}
		takeScreenshot("validateNotPageTitle()");
	}

}
