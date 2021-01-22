package step_definitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.Driver;

public class SignInStepDefs {
	
	
	@Given("The User is on the homepage")
	public void the_User_is_on_the_homepage() {
	   
		Driver.getDriver().get("http://automationpractice.com/");
			
	}

	@When("The user clicks on sign in button")
	public void the_user_clicks_on_sign_in_button() {

		  HomePage hp = new HomePage();
		  hp.signInLink.click();

		
	}

	@Then("The user should land on sign in page and the title should be Login - My Store")
	public void the_user_should_land_on_sign_in_page_and_the_title_should_be_Login_My_Store() {

		String title = Driver.getDriver().getTitle();
		
		assertEquals("Login - My Store", title);
		
	  
	}

}
