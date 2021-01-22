package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.Driver;

public class SearchStepDefs {
	
	
	@When("The user enters a search term in the search bar")
	public void the_user_enters_a_search_term_in_the_search_bar() {
	    HomePage hp = new HomePage();
	    hp.searchBar.sendKeys("Blouse" + Keys.ENTER);
	    
	}

	@Then("The user should land on serch page and title should be Search - My Store")
	public void the_user_should_land_on_serch_page_and_title_should_be_search_my_store() {
	    String actualTitle = Driver.getDriver().getTitle();
	    
	    assertEquals("Search - My Store", actualTitle);
	}

}
