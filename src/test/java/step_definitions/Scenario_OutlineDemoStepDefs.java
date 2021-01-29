package step_definitions;


import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Scenario_OutlineDemoStepDefs {
	
	


	@When("I click on {string} link")
	public void iClickOnLink(String link) {
		BrowserUtils.waitForPageToLoad(5);
           
		new HomePage().clickOnLink(link);

	}

	@Then("I should land on {string} Page")
	public void iShouldLandOnPage(String expected) {
	  
		
		
		String actual =  new HomePage().getPageName();
	  
	  assertEquals(expected, actual);
	}

	@Then("The title should be {string}")
	public void theTitleShouldBe(String expected) {
	   String actual = Driver.getDriver().getTitle();
	   assertEquals(expected, actual);
	}

	
	

}
