package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driverManager.InitiateBrowser;

public class stepDefinitions {

	InitiateBrowser browser = new InitiateBrowser();

	@Given("^user launches browser in \"([^\"]*)\"$")
	public void user_launches_browser_in(String arg1) throws Throwable {
		switch (arg1) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			browser.setDriver(new ChromeDriver());
			browser.getDriver().manage().window().maximize();
			break;
		case "ie":
			System.out.println("No yet Implemented");
			break;
		}
	}

	@Given("^Launches URL \"([^\"]*)\"$")
	public void launches_URL(String arg1) throws Throwable {
		browser.getDriver().get(arg1);
	}

	@Then("^user enters emailID as \"([^\"]*)\"$")
	public void user_enters_emailID_as(String arg1) throws Throwable {
		browser.getDriver().findElement(By.id("txtEmail")).sendKeys(arg1);
		Thread.sleep(5000);
	}

	@Then("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
		browser.getDriver().findElement(By.id("txtPassword")).sendKeys(arg1);
		Thread.sleep(5000);
	}

	@Then("^user clicks on button \"([^\"]*)\"$")
	public void user_clicks_on_button(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("signin"))
			browser.getDriver().findElement(By.id("lblLogin")).click();
		Thread.sleep(5000);
		browser.takeScreenshot();
		browser.closeDriver();
	}

}
