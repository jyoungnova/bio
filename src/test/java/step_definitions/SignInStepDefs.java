package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import pages.SignInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SignInStepDefs extends BrowserUtils{
	
	
	@Given("The User is on the homepage")
	public void the_User_is_on_the_homepage() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));	
	}

	
	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String username, String pass) {
	    SignInPage signin = new SignInPage();
	    signin.username.sendKeys(username);
	    signin.password.sendKeys(pass); 
	}
	
	
	@When("The user clicks on sign in button")
	public void the_user_clicks_on_sign_in_button() {
		SignInPage signin = new SignInPage();
		signin.loginButton.click();
	}

	
	@Then("The user should land on home page")
	public void the_user_should_land_on_sign_in_page_and_the_title_should_be_Login_My_Store() {
		String title = Driver.getDriver().getTitle();
		assertEquals("Swag Labs", title);
		ProductPage pp = new ProductPage();
	}
	
	
	@Then("The error message is displayed")
	public void theErrorMessageIsDisplayed() {
	    SignInPage sip = new  SignInPage();
	    String actual = "Epic sadface: Sorry, this user has been locked out.";
	    assertEquals(sip.errorMessageOnSignInPage.getText(), actual);
	    
	}
	
}
