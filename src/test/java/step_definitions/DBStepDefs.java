package step_definitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBStepDefs {
	
	@Given("I am connected to the database")
	public void i_am_connected_to_the_database() {
	    System.out.println("Connecting");
	}

	@When("I send a query to update user name")
	public void i_send_a_query_to_update_user_name() {
	   System.out.println("Sending query");
	}

	@Then("I should see the updated name in the database")
	public void i_should_see_the_updated_name_in_the_database() {
	   System.out.println("Verifying the update");
	}
	
	
	
	
	@Then("I should see the following info")
	public void iShouldSeeTheFollowingInfo(List<List<String>> dataTable) {
	    
		for (List<String> list : dataTable) {
			
			System.out.println(list.get(2));
			
		}
		
	}
	
	
	@Then("I should see the following info as list of maps")
	public void iShouldSeeTheFollowingInfoAsListOfMaps(List<Map<String, String>> dataTable) {
	    
		
		System.out.println(dataTable);
		
		
		for (Map<String, String> map : dataTable) {
			
			System.out.println(map.get("birthDate"));
		}
		
		
	}
	
	
	@Then("I should see the following info as maps")
	public void iShouldSeeTheFollowingInfoAsMaps(Map<String, String> dataTable) {
	   System.out.println(dataTable.keySet());
	}
	
	
	
	
	@Then("I should see the following info as maps with lists as value")
	public void iShouldSeeTheFollowingInfoAsMapsWithListsAsValue(Map<String, List<String>> dataTable) {
	    
		System.out.println(dataTable);
		
	}
	
	
	
	@Then("I should see the following info as maps with maps as value")
	public void iShouldSeeTheFollowingInfoAsMapsWithMapsAsValue(Map<String, Map<String,String>> dataTable) {
	   System.out.println(dataTable);
	}
	
	
	@When("I send a query")
	public void iSendAQuery(String docString) {
	    System.out.println(docString);
	}


}
