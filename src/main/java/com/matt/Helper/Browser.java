package com.matt.Helper;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Browser {

	public void openBrowser(String browser) {
		String projectPath = System.getProperty("user.dir");

		if (browser.equalsIgnoreCase("Chrome")) {
			String driverPath = projectPath + "\\src\\test\\resources\\webdrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--inprivate");

			Driver.setDriver(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("Edge")) {
			String driverPath = projectPath + "\\src\\test\\resources\\webdrivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverPath);
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--inprivate");

			Driver.setDriver(new EdgeDriver());
		}
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(30)));
	}

	public void closeBrowser() {
		Driver.getDriver().quit();
	}

}
