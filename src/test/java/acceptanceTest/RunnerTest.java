package acceptanceTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/cucumber-report.html",
				"json:target/cucumber-json/cucumber.json",
				"junit:target/cucumber.xml"
				},
		features = {
				"src/test/java/acceptanceTest/features"
		},
		glue = {
				"com.matt.stepDef"
		},
		tags = "@Test")
public class RunnerTest {
}
