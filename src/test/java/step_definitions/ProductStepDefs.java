package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;
import utilities.Driver;

public class ProductStepDefs {
	
	
	 String expectedProductName;
	
	
	@When("The user clicks on {string}")
	public void theUserClicksOn(String product) {
		HomePage hp = new HomePage();
		expectedProductName = product;  // sharing a state/data between step def methods is very common
		hp.getProduct(product).click();
		
	   
	}

	@Then("The user should land on the same product page and the title has to contain {string}")
	public void theUserShouldLandOnTheSameProductPageAndTheTitleHasToContainTheName(String expected) {
	    String actual = Driver.getDriver().getTitle();
	    assertTrue(actual.contains(expectedProductName));	// expectedProdcutName is being initoialized by the other method	
	}

	@Then("The product name should be {string}, the price should be {double} and the quantity should be {int}")
	public void theProductNameShouldBeThePriceShouldBeAndTheQuantityShouldBe(String expectedproductName, Double expPrice, Integer expQty) {
	    
		ProductPage pp = new ProductPage();
		
		String actualProductName = pp.productName.getText();
		Double actualPrice = Double.valueOf(pp.price.getText().replace("$", ""));
		Integer actualQty = Integer.valueOf(pp.qunatityBox.getAttribute("value"));
		
		assertEquals(expectedproductName, actualProductName);
		assertEquals(expPrice, actualPrice);
		assertEquals(expQty, actualQty);
		
		
	}
	
	
	
	

	@Then("The product information should be the following")
	public void theProductInformationShouldBeTheFollowing(List<List<String>> dataTable) {
	   System.out.println(dataTable);
	}


}
