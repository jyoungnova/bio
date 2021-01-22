package step_definitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {
	
	
	
	@Before
	public void setupScenario() {
		
		Driver.getDriver().manage().timeouts().
		implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitTimeout")), TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().deleteAllCookies();
		
	}
	
	
	@After
	public void tearDownScenario() {
		Driver.quit();
	}

}
