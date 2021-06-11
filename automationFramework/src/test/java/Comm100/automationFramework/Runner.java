package Comm100.automationFramework;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "steps", tags = "@Comm100", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:report/cucumber-reports/report.html" }, monochrome = true)
public class Runner {

	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig("./extent-config.xml");

	}
}
