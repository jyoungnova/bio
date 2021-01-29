package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import pages.SignInPage;
import pojos.User;
import utilities.Driver;

public class UserRegistrationStepDefs {
	
	
	@When("The user enters a valid email address and clicks create account")
	public void theUserEntersAValidEmailAddressAndClicksCreateAccount() {
	   SignInPage sp = new SignInPage();
	   sp.createAcctEmail.sendKeys(new Faker().internet().emailAddress());
	   sp.createAcctButton.click();
	}

	@When("The user enters the following info into the form and clicks on register")
	public void theUserEntersTheFollowingInfoIntoTheFormAndClicksOnRegister(List<User> dataTable) {
		
		User user = dataTable.get(0);
		
		RegisterPage rp = new RegisterPage();
		
		rp.firstName.sendKeys(user.getFirst());
		rp.lastName.sendKeys(user.getLast());
		rp.password.sendKeys(user.getPassword());
		
		rp.selectDOB(user.getDateOfBirth());
		
		rp.address.sendKeys(user.getAddress());
		rp.city.sendKeys(user.getCity());
		rp.selectState(user.getState());
		rp.zip.sendKeys(user.getZip());
		rp.phone.sendKeys(user.getPhoneNumber());
		
		
		rp.registerButton.click();
		
	}

	@Then("The user should land on account page and see welcome message")
	public void theUserShouldLandOnAccountPageAndSeeWelcomeMessage() {
	  
		assertTrue(Driver.getDriver().getTitle().contains("My account"));
		assertTrue(Driver.getDriver().getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
		
	}

}
