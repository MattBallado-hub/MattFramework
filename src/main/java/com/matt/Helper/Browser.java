package com.matt.Helper;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public void openBrowser(String browser, String headless) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
//			String driverPath = "src/test/resources/webdrivers/chromedriver.exe";
//			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--inprivate");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1920,1080");
			if (headless.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
			}

			Driver.setDriver(new ChromeDriver(options));
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
//			String driverPath = "src/test/resources/webdrivers/msedgedriver.exe";
//			System.setProperty("webdriver.edge.driver", driverPath);
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--inprivate");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1920,1080");
			if (headless.equalsIgnoreCase("true")) {
				options.addArguments("--headless");
			}

			Driver.setDriver(new EdgeDriver(options));
		}
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(30)));
	}
	
	public void closeBrowser() {
		Driver.getDriver().close();
	}

	public void quitBrowser() {
		Driver.getDriver().quit();
	}

}
