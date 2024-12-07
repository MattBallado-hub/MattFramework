package com.matt.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.matt.Handler.CustomException;

public class CustomEvent {

	Actions actions = new Actions(Driver.getDriver());

	public void staticWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void customClick(By locator) throws CustomException {
		try {
			WebElement element = Driver.getDriver().findElement(locator);
			Driver.getWait().until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			staticWait(1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Click Error: " + e.getMessage());
		}
	}

	public void customSendKeys(By locator, String value) throws CustomException {
		try {
			WebElement element = Driver.getDriver().findElement(locator);
			Driver.getWait().until(ExpectedConditions.elementToBeClickable(locator));
			if (element.getText().isBlank()) {
				element.sendKeys(value);
			} else {
				element.clear();
				element.sendKeys(value);
			}
			staticWait(1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("SendKeys Error: " + e.getMessage());
		}
	}

	public void customSelect(By locator, String value) throws CustomException {
		try {
			WebElement element = Driver.getDriver().findElement(locator);
			Driver.getWait().until(ExpectedConditions.elementToBeClickable(locator));
			Select selectElement = new Select(element);
			selectElement.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Select Error: " + e.getMessage());
		}
	}

	public void shouldBeDisplayed(By locator) throws CustomException {
		if (Driver.getDriver().findElement(locator).isDisplayed()) {
			highlightElement(locator);
			System.out.println("Passed");
		} else {
			throw new CustomException("Failed");
		}
	}

	public void valueShouldBe(By locator, String expectedValue) throws CustomException {
		String actualValue = Driver.getDriver().findElement(locator).getText();
		if (actualValue.equals(expectedValue)) {
			highlightElement(locator);
			System.out.println("Passed");
		} else {
			System.out.println("Actual: " + actualValue);
			System.out.println("Expected: " + expectedValue);
			throw new CustomException("Failed");
		}
	}

	public void takeScreenshot(String screenshotName) {
		byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		Driver.getScenario().attach(screenshot, "image/png", "Screenshot: " + screenshotName);
	}

	public void highlightElement(By locator) {
		WebElement element = Driver.getDriver().findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		String originalStyle = element.getDomProperty("style");
		String newStyle = "\"; border: 2px solid red;\"";
		js.executeScript("arguments[0].setAttribute('style', arguments[0].getAttribute('style') + " + newStyle + ")",
				element);

		actions.moveToElement(element).perform();

		staticWait(1);

		takeScreenshot(element.getText());

		js.executeScript("arguments[0].setAttribute('style', arguments[1])", element, originalStyle);
	}

}
