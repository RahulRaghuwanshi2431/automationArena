package driverManager;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;

public class InitiateBrowser {

	private WebDriver driver;
	Scenario scenario;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	public void closeDriver() {
		// driver.close();
		driver.quit();
	}

	public void takeScreenshot() {

		try {

			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/report/cucumber-reports/screenshots/" + "Login" + ".png");
			System.out.println(destinationPath);

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
		}

	}
}
