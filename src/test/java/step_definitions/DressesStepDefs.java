package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DressesPage;
import pages.HomePage;
import utilities.BrowserUtils;
import utilities.Driver;

public class DressesStepDefs {
	
	@When("The user clicks on Dresses page link")
	public void theUserClicksOnDressesPageLink() {
	  BrowserUtils.jsClick( new HomePage().dressesLink);
	}

	@Then("The user should see the following dress subcategories")
	public void theUserShouldSeeTheFollowingDressSubcategories(List<String> expectedList) {
	  
		 DressesPage dp = new DressesPage();
		 
		 
       List<String> actualList = BrowserUtils.getElementsText(dp.dressSubcategoriesList);
       
        for (int i = 0; i<actualList.size(); i++) {
			assertEquals(expectedList.get(i).toLowerCase(), actualList.get(i).toLowerCase());
		}
		
	   
	}

	@Then("The page title should be {string}")
	public void thePageTitleShouldBe(String expected) {
	    assertEquals(expected, Driver.getDriver().getTitle());
	}


}
