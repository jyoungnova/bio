package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;
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
	
	
	@When("The user enters Blouse in the search bar")
	public void theUserEntersBlouseInTheSearchBar() {
		 HomePage hp = new HomePage();
		 hp.searchBar.sendKeys("Blouse" + Keys.ENTER);
	}

	@Then("The user should see Blouse in the search page")
	public void theUserShouldSeeBlouseInTheSearchPage() {
	    SearchPage sp = new SearchPage();
	    String actualText = sp.searchHeader.getText().toLowerCase();
	    System.out.println(actualText);
	    assertTrue(actualText.contains("Blouse".toLowerCase()));
			
	}
	
	
	
	@When("The user enters {string} in the search bar")
	public void theUserEntersInTheSearchBar(String product) {
		HomePage hp = new HomePage();
		 hp.searchBar.sendKeys(product + Keys.ENTER);
	}

	@Then("The user should see {string} in the search page")
	public void theUserShouldSeeInTheSearchPage(String product) {
		SearchPage sp = new SearchPage();
	    String actualText = sp.searchHeader.getText().toLowerCase();
	    System.out.println(actualText);
	    assertTrue(actualText.contains(product.toLowerCase()));
	}
	
	
//	@When("The user  {word} in the search bar")
//	public void theUserInTheSearchBar(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should {word} in the search page")
//	public void theUserShouldInTheSearchPage(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	
	
}
