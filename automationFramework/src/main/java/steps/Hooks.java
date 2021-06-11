package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverManager.InitiateBrowser;

public class Hooks {

	InitiateBrowser browser = new InitiateBrowser();

	@Before
	public void beforeScenario() {
		System.out.println("Starting the Execution of the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("Execution Complete for the current Scenario");
	}
}