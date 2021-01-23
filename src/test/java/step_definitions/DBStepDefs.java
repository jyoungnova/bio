package step_definitions;

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


}
